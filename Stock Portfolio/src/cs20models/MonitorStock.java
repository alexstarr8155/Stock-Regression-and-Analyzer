/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;

import cs20viewcontroller.ViewOutputs;
import java.awt.Button;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author student
 */
public class MonitorStock extends ViewOutputs {

    public static double moneyMade = 0;
    public static boolean running = true;
    public static double availableMoney = 20000;
    public static double totalValue;

    public static String s;
    public static Calendar c;
    public static int lineCount = 0;

    public static HashMap<Stock, Boolean> buy = new HashMap<Stock, Boolean>();
    public static HashMap<Stock, Boolean> sell = new HashMap<Stock, Boolean>();

    static double midpoint = 150;

    static double max = midpoint + 0.05;
    static double min = midpoint - 0.05;

    @SuppressWarnings("unchecked")
    public static void updateInfo(Stock stock) throws IOException {

        try {
        
        
        
        BufferedReader read;

        if (!stock.getStockCode().equals("1234")) {

            URL url;

            
            url = new URL("https://ca.finance.yahoo.com/quote/" + stock.getStockCode());
            //URL url = new URL("https://ca.finance.yahoo.com/quote/WJA.TO?p=WJA.TO");
            URLConnection conn = url.openConnection();

            InputStreamReader inStream = new InputStreamReader(conn.getInputStream());

            //System.out.println(doc.title());
            read = new BufferedReader(inStream);

            String finalLine = "";
            //String price = "0";

            double dPrice = 0;
            String line = read.readLine();
            while (line != null) {

                if (line.contains("currentPrice")) {
                    int start = line.indexOf("currentPrice");
                    int index = line.indexOf(".", start);

                    int num = index;
                    int num1 = index;

                    while (line.charAt(num) != ':') {
                        --num;
                    }

                    try {
                        dPrice = Double.parseDouble(line.substring(num + 1, index + 3));
                    } catch (java.lang.NumberFormatException e) {
                        String l = line.substring(num + 1, index + 2);
                        l = l.replaceAll("[^\\d.]", "");
                        dPrice = Double.parseDouble(l);
                    }

                    line = null;
                } else {
                    line = read.readLine();
                }

            }

            stock.setLastPrice(stock.currentPrice);
            stock.setCurrentPrice(dPrice);

            if (dPrice - stock.getLastPrice() != 0) {
                stock.setChange(dPrice - stock.getLastPrice());
            }
            //S

        } else {
            double dPrice = 0;

            double previousNum;
            double num = Math.random() * (max - min) + min;

            //for (int i = 0; i < 7500; i++) {
            previousNum = num;
            num = Math.random() * (max - min) + min;
            midpoint = num;

            if (num >= previousNum) {
                max = midpoint + 0.1;
                min = midpoint - 0.1;
            } else if (previousNum > num) {
                max = midpoint + 0.1;
                min = midpoint - 0.1;
            }

            dPrice = num;
            lineCount++;

            stock.setLastPrice(stock.currentPrice);
            stock.setCurrentPrice(dPrice);

            if (dPrice - stock.getLastPrice() != 0) {
                stock.setChange(dPrice - stock.getLastPrice());
            }

            //}
        }
        
        } catch (Exception exception){
            System.out.println("System currently down");
        }

    }

    public static void runAlgorithm() {

        StockList list = AllModelsForView.stockList;

        double eachAvailable = availableMoney / list.toArray().length;

        if (list.stockCount != 0) {
            while (running) {

                for (int i = 0; i < list.toArray().length; i++) {
                    Stock stock = list.toArray()[i];

                    double price = stock.getCurrentPrice();

                    if (!stock.isBought() && price + 0.02 < stock.getSoldPrice()) {
                        int amount = (int) Math.floor(eachAvailable / price);
                        availableMoney -= amount * price;
                        stock.simulateBuy(amount);

                    } else if (price > stock.getBoughtPrice() + 0.01) {
                        double num = stock.getNumBought();
                        moneyMade += num * (price - stock.getBoughtPrice());
                        availableMoney += num * price;
                        stock.simulateSell();
                    }
                }
            }

        }

    }

    public static void backOneDay() {
        //long milisecondsBack = numDays * 86_400_000;
        c.add(Calendar.DATE, -1);

        s = new SimpleDateFormat("MMM dd, yyyy").format(c.getTime());
    }

    public static void runAlgorithm(JLabel label, JLabel label1) {
        StockList list = AllModelsForView.stockList;

        totalValue = availableMoney;

        DecimalFormat df = new DecimalFormat("###0.00");

        double eachAvailable;

        if (list.stockCount != 0) {
            while (running) {

                eachAvailable = availableMoney / list.toArray().length;

                for (int i = 0; i < list.toArray().length; i++) {
                    Stock stock = list.toArray()[i];

                    label.setText("Cash: " + df.format(availableMoney) + " Money Made: $" + df.format(moneyMade));

                    double price = stock.getCurrentPrice();
                    System.out.println(stock.getStockCode() + ": " + price + ", " + stock.getBoughtPrice() + "||" + stock.getSoldPrice());

                    totalValue += stock.getNumBought() * price;

                    if (!stock.isBought() && stock.getChange() > 0) {
                        int amount = (int) Math.floor(eachAvailable / price);
                        availableMoney -= amount * price;
                        stock.simulateBuy(amount);
                        label1.setText("Buy  " + (int) amount + " shares of " + stock.getName() + " stock");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MonitorStock.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        label1.setText("");
                    }

                    if (price >= stock.getBoughtPrice() && stock.isBought() && stock.getChange() < 0) {
                        double num = stock.getNumBought();
                        moneyMade += num * (price - stock.getBoughtPrice());
                        availableMoney += num * price;
                        stock.simulateSell();
                        label1.setText("Sell " + (int) num + " shares of " + stock.getName() + " stock");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MonitorStock.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        label1.setText("");
                    }

                }
            }

        }

    }

    public static void getAllFromTable(Stock stock) throws IOException {
        HistoricalStockList list = new HistoricalStockList(stock);

        String link = "https://finance.yahoo.com/quote/CM.TO/history?period1=1370156400&period2=1527922800&interval=1d&filter=history&frequency=1d";

        URL url = new URL("https://finance.yahoo.com/quote/" + stock.getStockCode() + "/history?p=" + stock.getStockCode());
        URLConnection conn = url.openConnection();
        InputStreamReader inStream = new InputStreamReader(conn.getInputStream());
//
//        
        BufferedReader read = new BufferedReader(inStream);

        c = Calendar.getInstance();
        s = new SimpleDateFormat("MMM dd, yyyy").format(c.getTime());

        String day = new SimpleDateFormat("EEE").format(c.getTime());

        if (day.equals("Sun")) {
            backOneDay();
        }
        if (day.equals("Mon")) {
            backOneDay();
            backOneDay();
        }
        backOneDay();
        //String price = "0";

        String line = read.readLine();
        while (line != null) {

            while (line.contains(s)) {
                if (line.contains(s)) {

                    //while (line.contains(s)) {
                    //System.out.println(s);
                    String[] arr = new String[4];

                    int start = line.indexOf(s);

                    for (int i = 0; i < arr.length; i++) {

                        String l = line.substring(start);

                        int index = line.indexOf(".", start);

                        start = index + 1;

                        int num = index;

                        while (line.charAt(num) != '>') {
                            --num;
                        }

                        arr[i] = line.substring(num + 1, index + 3).replaceAll("[^\\d.]", "");

                    }

                    HistoricalStock hs = new HistoricalStock(s, stock, arr[1], arr[2], arr[0], arr[3]);

                    list.add(hs);

                    backOneDay();

                    if (!line.contains(s)) {
                        backOneDay();
                        backOneDay();
                    }

                    if (!line.contains(s)) {
                        backOneDay();
                    }

                    //}
                }
            }

            //System.out.println(line);
            line = read.readLine();

        }

        list.toFile();
        c = Calendar.getInstance();

    }

    public static void getLastFromTable(Stock stock) throws IOException {
        HistoricalStockList list = new HistoricalStockList(stock);

        String link = "https://finance.yahoo.com/quote/CM.TO/history?period1=1370156400&period2=1527922800&interval=1d&filter=history&frequency=1d";

        URL url = new URL("https://finance.yahoo.com/quote/" + stock.getStockCode() + "/history?p=" + stock.getStockCode());
        URLConnection conn = url.openConnection();
        InputStreamReader inStream = new InputStreamReader(conn.getInputStream());
//
//        
        BufferedReader read = new BufferedReader(inStream);

        c = Calendar.getInstance();
        s = new SimpleDateFormat("MMM dd, yyyy").format(c.getTime());

        String day = new SimpleDateFormat("EEE").format(c.getTime());

        if (day.equals("Sun")) {
            backOneDay();
        }
        if (day.equals("Mon")) {
            backOneDay();
            backOneDay();
        }
        backOneDay();
        //String price = "0";

        String line = read.readLine();
        while (line != null) {

            if (line.contains(s)) {

                //while (line.contains(s)) {
                //System.out.println(s);
                String[] arr = new String[4];

                int start = line.indexOf(s);

                for (int i = 0; i < arr.length; i++) {

                    String l = line.substring(start);

                    int index = line.indexOf(".", start);

                    start = index + 1;

                    int num = index;

                    while (line.charAt(num) != '>') {
                        --num;
                    }

                    arr[i] = line.substring(num + 1, index + 3).replaceAll("[^\\d.]", "");

                }

                HistoricalStock hs = new HistoricalStock(s, stock, arr[1], arr[2], arr[0], arr[3]);

                list.add(hs);

                backOneDay();

                if (!line.contains(s)) {
                    backOneDay();
                    backOneDay();
                }

                if (!line.contains(s)) {
                    backOneDay();
                }

                //}
            }

            //System.out.println(line);
            line = read.readLine();

        }

        list.toFile(false);
        c = Calendar.getInstance();

    }

    public static void readData(Stock stock) throws FileNotFoundException {

        File file = new File("C:\\Users\\User\\Desktop\\StockFiles\\" + stock.getName() + " " + stock.getStockCode() + "HistoricalData.txt");

        Scanner scanner = new Scanner(file);
        ArrayList<Double> list = new ArrayList<Double>();

        while (scanner.hasNextLine()) {
            String[] arr = scanner.nextLine().split("  ");
            double diff = Double.parseDouble(arr[1]) - Double.parseDouble(arr[2]);
            list.add(diff);
        }

        //System.out.println(Arrays.toString(list.toArray()));
    }

    public static void setRunning(boolean bool) {
        running = bool;
    }

}
