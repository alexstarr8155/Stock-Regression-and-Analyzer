/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;

import static cs20models.AllModelsForView.stockList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import cs20viewcontroller.ViewOutputs;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author User
 */
public class ConstantRunner extends ViewOutputs implements Runnable {

    public static Calendar calendar = Calendar.getInstance();
    public Stock stock;

    public boolean done = false;
    public boolean openFrame = false;
    public boolean setOnce = false;
    

    public HashMap<Stock, JMenuItem> menuMap;
    public int size;

    public ConstantRunner() {

    }

    public ConstantRunner(HashMap<Stock, JMenuItem> list) {
        this.menuMap = list;
        this.size = list.size();
    }

    public void setVisibility(boolean visible) {
        this.openFrame = visible;
        setOnce = false;
    }

//    public void setSetOnce(boolean setOnce){
//        this.setOnce = setOnce;
//    }
    @Override
    public void run() {
        

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        chart = ChartFactory.createLineChart("Stock Prices ", "Stock Prices", "", dataset, PlotOrientation.VERTICAL, true, true, false);
        frame = new ChartFrame("Stock Prices", chart);

        ImageIcon img = new ImageIcon("Logo.png");
        frame.setIconImage(img.getImage());
        
        frame.setSize(600, 400);

        frame.setLayout(new BorderLayout());

        JButton button = new JButton("Go Back");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                frame.setVisible(false);
                
            }
        });
        
        

        button.setMaximumSize(new Dimension(150, 200));

        frame.add(button, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        long time = System.currentTimeMillis();

        while (true) {

            if (openFrame == true && !setOnce) {
                frame.setVisible(true);
                setOnce = true;
            }

            int hour = Integer.parseInt(new SimpleDateFormat("HH").format(calendar.getTime()));
            String day = new SimpleDateFormat("EEE").format(calendar.getTime());

            if (hour == 17 && (!day.equals("Sat") || !day.equals("Sun") && !done)) {

                Stock[] stocks = stockList.toArray();

                for (int i = 0; i < stockList.toArray().length; i++) {

                    try {
                        MonitorStock.getLastFromTable(stocks[i]);
                    } catch (IOException ex) {
                        Logger.getLogger(ConstantRunner.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    done = true;
                }
            }

            if (hour == 18) {
                done = false;
            }

            updateField();
            updateList();
            displayBuySellDialog();

            if (time + 20 < System.currentTimeMillis()) {

                graphData(dataset);
                time = System.currentTimeMillis();

            }
            
            if (dataset.getColumnCount() > 750){
                for (int i = 0; i < dataset.getColumnCount() - 750; i++){
                    
                    
                    dataset.removeColumn(i);
                    //System.out.println(dataset.getColumnCount());
                    
                }
            }

//            if (this.size != this.menuMap.size()){
//                
//                Object [] obj = menuMap.values().toArray();
//                
//                for (int i = this.size; i < this.menuMap.size(); ++i){
//                    
//                    JMenuItem val = (JMenuItem) obj[i];
//                    
//                    val.addActionListener(this);
//                    
//                }
//                
//                this.size = this.menuMap.size();
//                
//            }
        }

    }

}
