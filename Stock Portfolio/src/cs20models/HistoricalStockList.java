/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class HistoricalStockList {

    ArrayList<HistoricalStock> list;
    Stock stock;

    public HistoricalStockList(Stock stock) {

        list = new ArrayList<HistoricalStock>();
        this.stock = stock;

    }

    public void toFile(boolean append) throws IOException {
        String filePath = "StockFiles/" + stock.getName() + " " + stock.getStockCode() + "HistoricalData.txt";

        File file = new File(filePath);
        FileWriter fw = new FileWriter(file, append);
        PrintWriter pw = new PrintWriter(fw);

        for (int i = 0; i < list.size(); ++i) {
            HistoricalStock temp = list.get(i);
            pw.println(temp.getDate() + "  " + temp.getOpen() + "  " + temp.getClose() + "  " + temp.getHigh() + "  " + temp.getLow());
            //System.out.println(temp.getDate() + "  " + temp.getOpen() + "  " + temp.getClose() + "  " + temp.getHigh() + "  " + temp.getLow());
        }

        fw.close();
        pw.close();
    }

    public void toFile() throws IOException {

        String filePath = "StockFiles/" + stock.getName() + " " + stock.getStockCode() + "HistoricalData.txt";

        File file = new File(filePath);
        FileWriter fw;
        fw = new FileWriter(file);

        PrintWriter pw = new PrintWriter(fw);

        for (int i = 0;
                i < list.size();
                ++i) {
            HistoricalStock temp = list.get(i);
            pw.println(temp.getDate() + "  " + temp.getOpen() + "  " + temp.getClose() + "  " + temp.getHigh() + "  " + temp.getLow());
            //System.out.println(temp.getDate() + "  " + temp.getOpen() + "  " + temp.getClose() + "  " + temp.getHigh() + "  " + temp.getLow());
        }

        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        pw.close();
    }

    public void add(HistoricalStock hs) {
        list.add(hs);
    }

    public Object[] toArray() {
        return this.list.toArray();
    }

}
