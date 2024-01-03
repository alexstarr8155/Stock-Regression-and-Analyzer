/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;

import cs20viewcontroller.DrawnView;
import cs20viewcontroller.ViewOutputs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author User
 */
public class MenuItemOpenFrame implements ActionListener, MenuListener {

    public HashMap<Stock, JMenuItem> list;
    
    

    public JMenu menu;
    public JMenu openStock;
    public JTextField name;
    public JTextField code;
    public JTextField price;
    public JTextField num;
    public JFrame openedWindow;
    public JFrame closeWindow;

    public MenuItemOpenFrame(HashMap<Stock, JMenuItem> list) {
        this.list = list;

    }

    public void add(Stock stock, JMenuItem jmi) {

        list.put(stock, jmi);
        jmi.addActionListener(this);

    }

    public HashMap<Stock, JMenuItem> getMap() {
        return this.list;
    }

    public void setFields(JTextField name, JTextField code, JTextField price, JTextField num, JFrame openedWindow, JFrame closeWindow, JMenu openStock) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.num = num;
        this.openedWindow = openedWindow;
        this.closeWindow = closeWindow;
        this.openStock = openStock;
    }

    public void add(Stock stock, JMenuItem jmi, JMenu jm) {

        list.put(stock, jmi);
        System.out.println(list.keySet());
        jm.add(jmi);
        jmi.addActionListener(this);

    }

    public void delete(Stock key) {

//        this.openStock.remove(this.getMap().get(key));
//        this.deleteStock.remove(this.getMap().get(key));
//        list.remove(key);
    }

    public Collection<JMenuItem> values() {

        return list.values();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("opening");
        
        //if (this.menu.equals(this.openStock)) {
        this.getMap();
        Stock stock = getKeyFromValue(list, e.getSource());
        //openSelectedStock(stock);
        //System.out.println(stock.getName());

            name.setText(stock.getName());
            price.setText("$" + stock.getCurrentPrice());
            code.setText(stock.getStockCode());
            num.setText(stock.getNumBought() + " shares");

            openedWindow.pack();
            openedWindow.setEnabled(true);

            //checkbox1.setState(stock.isBought());
            closeWindow.setVisible(false);
            openedWindow.setVisible(true);
            
            
            
            
            
        //} else {

        //}
    }

    public static Stock getKeyFromValue(HashMap hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return (Stock) o;
            }
        }
        return null;
    }

    @Override
    public void menuSelected(MenuEvent e) {

    }

    @Override
    public void menuDeselected(MenuEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
