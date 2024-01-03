/*
 * The classes representing the model is organized into the cs20models package.
 * 
 * These are classes that represent (i.e. "models") the underlying data needed
 * for your program to run; as well, these classes model what can be done to
 * the data (e.g. an Elevator class may model an object with information of 
 * which floor the car is on, and contains methods for moving the car to 
 * another floor.  There may be other classes to help model other aspects of
 * the problem or situation too).
 * 
 * Model classes shouldn't know anything about the View or Controller classes.
 * It's a "pure" representation of the underlying problem or situation your
 * program solves or handles.
 * 
 * The Model classes are manipulated by the Controller classes.  Data stored
 * in Model classes are displayed whenever the View classes decides to do so.
 * So Model classes are passive (active Model classes would need some kind of
 * event or notification system, which you are not expected to know how to use).
 * 
 * The View and Controller classes are in the cs20viewcontroller package.
 * 
 * A sample model class is provided in the form of the DeepThoughtModel.
 * Go ahead and modify that class.
 * 
 * You can also make more classes in the cs20models package to better model
 * the problem or situation for your program.  But if you do, you will need
 * to list them below, inside the AllModelsForView class.  That's to inform
 * the View and Controller classes that these models are available to be used
 * by them.
 */
package cs20models;

import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class AllModelsForView extends javax.swing.JFrame {

    public Stock stock1 = new Stock("CM-T", "TESTCODE");
    public HistoricalStock hStock1 = new HistoricalStock(stock1);
    public static StockList stockList = new StockList();
    
    public HashMap<Stock, JMenuItem> menuItems = new HashMap<Stock, JMenuItem>();
    public MenuItemOpenFrame stockMenus = new MenuItemOpenFrame(menuItems);
    
    public HashMap<Stock, JMenuItem> menuItems1 = new HashMap<Stock, JMenuItem>();
    public MenuItemOpenFrame deleteStockMenus = new MenuItemOpenFrame(menuItems1);
    
    
    public DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    public JFreeChart chart;
    public ChartFrame frame; 
    
    public RunAlgorithmThread runner;
    public Thread thread;
    
    public ConstantRunner run;
    public Thread thread1;
    
    public JLabel j;
}
