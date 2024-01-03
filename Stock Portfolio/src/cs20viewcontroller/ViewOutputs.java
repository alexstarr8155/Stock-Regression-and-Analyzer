package cs20viewcontroller;

import cs20models.MonitorStock;
import static cs20models.MonitorStock.availableMoney;
import static cs20models.MonitorStock.moneyMade;
import cs20models.RunAlgorithmThread;
import cs20models.Stock;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;

import org.jfree.data.category.DefaultCategoryDataset;


public class ViewOutputs extends DrawnView {

    public void updateThoughtDisplayed() {
        //outputTextField.setText(this.stock1.getThought());
    }

    public void openSelectedStock(Stock stock) {

        nameOfStock.setText(stock.getName());
        currentPriceField.setText("$" + stock.getCurrentPrice());
        stockCodeField.setText(stock.getStockCode());
        numberBought.setText(stock.getNumBought() + " shares");

        viewStock.pack();
        viewStock.setEnabled(true);

        //checkbox1.setState(stock.isBought());
        this.setVisible(false);
        viewStock.setVisible(true);

    }

    public void openStockTransfer(Stock stock) {
        openSelectedStock(stock);
    }

    public void openNewStockWindow() {
        stockName.setText("");
        stockCode.setText("");
        exchangeName.setText("");

        addNewStockWindow.setVisible(true);
        addNewStockWindow.pack();
        setVisible(false);
    }

    public void add(String name, String code, String exchange) {
        String finalCode;
        if (!exchange.equals("")) {
            finalCode = code.toUpperCase() + "." + exchange.toUpperCase();
        } else {
            finalCode = code;
        }
        Stock stock = new Stock(name, finalCode);

        stockList.addStock(stock);

        try {
            MonitorStock.getAllFromTable(stock);
        } catch (IOException ex) {
            Logger.getLogger(ViewOutputs.class.getName()).log(Level.SEVERE, null, ex);
        }

        stockName.setText("");
        stockCode.setText("");
        exchangeName.setText("");

        addNewStockWindow.setVisible(false);

        addToMenus(stock);

        setVisible(true);
    }

    public void addToMenus(Stock stock) {
        stockMenus.add(stock, new JMenuItem(stock.getName()), openStockMenu);
    }

    public void passFields() {
        stockMenus.setFields(nameOfStock, stockCodeField, currentPriceField, numberBought, viewStock, this, openStockMenu);
        deleteStockMenus.setFields(nameOfStock, stockCodeField, currentPriceField, numberBought, viewStock, this, openStockMenu);
    }

    public void backToMainPage() {

        viewStock.setVisible(false);
        this.setVisible(true);

    }

    public void runStocks() {
        runner = new RunAlgorithmThread(earned, buyOrSellLabel);
        thread = new Thread(runner);
        thread.start();
        updateField();
        MonitorStock.running = true;
        //startAlgorithim.setEnabled(false);

    }

    public void runAnalysis() {
        MonitorStock.runAlgorithm();
    }

    public void endRunning() {
        updateField();
        //startAlgorithim.setEnabled(true);
        MonitorStock.setRunning(false);
        System.out.println(MonitorStock.lineCount);
    }

    public void updateList() {
        listDisplay.setListData(stockList.toArray());
    }

    public void updateField() {
        DecimalFormat df = new DecimalFormat("###0.00");
        earned.setText(("Cash: " + df.format(availableMoney) + " Money Made: $" + df.format(moneyMade)));
    }

    public void deleteStock() {

        Stock stock = stockList.searchFor(stockCodeField.getText());

        File file = new File("StockFiles/" + stock.getName() + " " + stock.getStockCode() + "HistoricalData.txt");
        double price = stock.getCurrentPrice();

        openStockMenu.remove(stockMenus.getMap().get(stock));

        stockMenus.delete(stock);
        deleteStockMenus.delete(stock);

        double num = stock.getNumBought();
        moneyMade += num * (price - stock.getBoughtPrice());
        availableMoney += num * price;
        stock.simulateSell();
        updateField();

        stockList.setStock(stock.getStockCode(), new Stock("", ""));
        stockList.toArray();
        updateList();

        file.delete();

        backToMainPage();

    }

    public void refreshMenuBar() {

        for (JMenuItem val : stockMenus.values()) {

            openStockMenu.add(val);

        }

    }

    int count = 0;

    public void graphData(DefaultCategoryDataset dataset) {

        Stock[] stocks = stockList.toArray();

        for (int i = 0; i < stocks.length; i++) {

            dataset.setValue(stocks[i].getCurrentPrice(), stocks[i].getName(), "" + count);

        }
        count++;

    }

    public void openGraphFrame() {

        run.setVisibility(true);

    }
    
    public void openInstructionsWindow(){
        
        instructionsDialog.pack();
        instructionsDialog.setVisible(true);
        
    }

    public void displayBuySellDialog() {

        for (int i = 0; i < stockList.toArray().length; i++) {

            Stock stock = stockList.toArray()[i];

            try {
                if (MonitorStock.buy.get(stock)) {

                    buyOrSellLabel.setText("Buy " + stock.getName());
                    MonitorStock.buy.put(stock, false);

                }

                if (MonitorStock.sell.get(stock)) {

                    buyOrSellLabel.setText("Sell " + stock.getName());
                    MonitorStock.sell.put(stock, false);

                }
            } catch (Exception e){};

        }

    }
}
