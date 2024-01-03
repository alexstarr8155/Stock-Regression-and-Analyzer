/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;


/**
 *
 * @author student
 */
public class HistoricalStock{
    public Stock stock;
    public String pathToFile;
    public double volatility;
    public double high;
    public double low;
    public double open;
    public double close;
    public String date;
    
    public HistoricalStock(Stock stock){
        this.stock = stock;
    }

    public HistoricalStock(String date, Stock stock, String high, String low, String open, String close) {
        this.date = date;
        this.stock = stock;
        this.high = Double.parseDouble(high);
        this.low = Double.parseDouble(low);
        this.open = Double.parseDouble(open);
        this.close = Double.parseDouble(close);
    }
    
    public HistoricalStock(Stock stock, String high, String low, String open, String close) {
        this.stock = stock;
        this.high = Double.parseDouble(high);
        this.low = Double.parseDouble(low);
        this.open = Double.parseDouble(open);
        this.close = Double.parseDouble(close);
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    public String getStockDataFromFile(){
        return ""; 
    }
    
    public void updateStockFile(){
        
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }
    
    
    
}
