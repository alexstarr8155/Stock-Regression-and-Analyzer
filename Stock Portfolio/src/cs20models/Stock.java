package cs20models;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Stock {

    
    public String name;
    public String stockCode;
    public double currentPrice;
    public double lastPrice;
    public double change;
    public boolean bought;
    public double boughtPrice;
    public double soldPrice;
    public int numBought;

    
    public int moneyMade;

    public Stock(String name, String stockCode){
        this.name = name;
        this.stockCode = stockCode;
        //this.bought = true;
        this.soldPrice = this.getCurrentPrice() + 0.05;
    }
    
    public Stock(String name) {
        this.name = name;
        //this.bought = true;
        this.soldPrice = this.getCurrentPrice() + 0.05;
    }
    
    public Stock(){
        //this.bought = true;
        this.soldPrice = this.getCurrentPrice() + 0.05;
    }
    
    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        try {
            MonitorStock.updateInfo(this);
        } catch (IOException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
        return currentPrice;
    }

    public boolean isBought() {
        return bought;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    private void setBought(boolean bought) {
        this.bought = bought;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public void buy() {
        this.setBought(true);
    }

    public void sell() {
        this.setBought(false);
    }

    public int getNumBought() {
        return numBought;
    }

    public void setNumBought(int numBought) {
        this.numBought = numBought;
    }
    
    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }
    
    
    public void simulateBuy(int amount){
        double price = this.getCurrentPrice();
        this.setSoldPrice(0);
        this.setNumBought(amount);
        this.setBoughtPrice(price);
        this.setBought(true);
    }
    
    public void simulateSell(){
        this.setNumBought(0);
        this.setSoldPrice(this.getCurrentPrice());
        this.setBought(false);
    }
    
    @Override
    public String toString(){
        return this.getName();
    }

}
