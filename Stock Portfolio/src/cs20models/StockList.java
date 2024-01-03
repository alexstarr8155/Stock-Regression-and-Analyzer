/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author student
 */
public class StockList {
    public Stock[] stocks;
    public int stockCount;
    
    public StockList(){
        this.stockCount = 0;
        this.stocks = new Stock[1000];
    }
    
    public void addStock(Stock stock){
        this.stocks[stockCount] = stock;
        stockCount++;
    }
    
    public Stock getStock(String stockCode){
        return this.searchFor(stockCode);
    }
    
    public void setStock(String stockCode, Stock stock){
        this.stocks[this.searchForIndex(this.searchFor(stockCode).getStockCode())] = stock;
        
    }
    
    public Stock[] toArray(){
        
        Stock [] list = new Stock[this.stockCount];
        int count = 0;
        
        for (int i = 0; i < list.length; i++){
            if (!this.stocks[i].getName().equals("")){
                list[i] = this.stocks[i];
            }
            
            if (this.stocks[i] != null){
                list[count] = this.stocks[i];
                count++;
            }
        }
        
        //System.out.println(Arrays.toString(this.cutSpace(list)));
        
        this.stockCount = count;
           
        
        
        
        return this.cutSpace(list);   
        
        
    }
    
    public Stock[] cutSpace(Stock [] array){
        
        ArrayList<Stock> list = new ArrayList<Stock>();
        
        for (int i = 0; i < array.length; ++i){
            if (!this.stocks[i].getName().equals("")){
                list.add(this.stocks[i]);
            }
        }
        
        Object [] obj = list.toArray();
        Stock [] arr = new Stock[obj.length];
        
        for (int i = 0; i < obj.length; ++i){
            arr[i] = (Stock) obj[i];
        }
        
        return arr;

    }
    
    public Stock[] toArray(int num){
        
        ArrayList<Stock> list = new ArrayList<Stock>();
        int count = 0;
        
        for (int i = 0; i < this.stocks.length; i++){
            if (this.stocks[i] != null || this.stocks[i].getName().equals("")){
                list.add(this.stocks[i]);
                count ++;
            }
        }
        
        this.stockCount = count;
        
        Object [] obj = list.toArray();
        
        Stock [] arr = new Stock[obj.length];
        
        for (int i = 0; i < obj.length; i++){
            arr[i] = (Stock) obj[i];
        }
        
        //System.out.println(arr);
        
        return arr;
        
        
    }
    
    public Stock searchFor(String code){
        
        for (int i = 0; i < this.stockCount; i++){
            
            if (this.stocks[i].getStockCode().equals(code)){
                return this.stocks[i];
            }
            
        }
        
        return null;
        
    }
    
    public int searchForIndex(String code){
        
        for (int i = 0; i < this.stockCount; i++){
            
            if (this.stocks[i].getStockCode().equals(code)){
                return i;
            }
            
        }
        
        return -1;
        
    }
    
}
