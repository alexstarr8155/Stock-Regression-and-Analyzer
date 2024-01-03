/*
 * The controller classes (like the ViewUserActions class) provides actions
 * that the user can trigger through the view classes.  Those actions are 
 * written in this class as private inner classes (i.e. classes 
 * declared inside another class).
 *
 * You can use all the public instance variables you defined in AllModelsForView, 
 * DrawnView, and ViewOutputs as though they were part of this class! This is 
 * due to the magic of subclassing (i.e. using the extends keyword).
 */
package cs20viewcontroller;

import cs20models.ConstantRunner;
import cs20models.MonitorStock;
import cs20models.Stock;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class ViewUserActions extends ViewOutputs {

    private class AddNewStock implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            openNewStockWindow();
        }
    }

    private class AddCreatedStock implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String name = stockName.getText();
            String code = stockCode.getText();
            String exchange = exchangeName.getText();
            add(name, code, exchange);

            stockName.setText("");
            stockCode.setText("");
            exchangeName.setText("");

            updateList();
        }
    }

    private class OpenStock implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object obj = listDisplay.getSelectedValue();
            Stock stock = (Stock) obj;
            openSelectedStock(stock);
        }
    }

    private class GoBack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            backToMainPage();
        }
    }

    private class RunAlgorithim implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            runStocks();
        }
    }

    private class EndAlgorithim implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            endRunning();
        }
    }

    private class DeleteStock implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            deleteStock();
        }
    }

    private class CloseProgram implements ActionListener {

        public boolean close;

        public CloseProgram(boolean close) {
            this.close = close;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (close) {

                System.exit(0);

            } else {

                closingDialog.setVisible(false);

            }

        }

    }
    
    private class CloseDialog implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            instructionsDialog.setVisible(false);
            
        }
        
    }

    public class MenuActions implements MenuListener, ActionListener {

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

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(startMenuItem)) {

                runStocks();

            } else if (e.getSource().equals(pauseMenuItem)) {

                endRunning();

            } else if (e.getSource().equals(addStockMenu)) {

                openNewStockWindow();

            } else if (e.getSource().equals(graphMenuItem)) {

                openGraphFrame();

            } else if (e.getSource().equals(instructionsMenu)){
                
                openInstructionsWindow();
                
            }
        }

    }

    private class Window implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

            //if (!e.getSource().equals(frame)) {
                closingDialog.pack();
                closingDialog.setVisible(true);

                System.out.println("Closing");
//            } else {
//                
//                run.setVisibility(false);
//                run.setSetOnce(false);
//                
//            }
            
            
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

    /*
     * ViewUserActions constructor used for wiring user actions to GUI elements
     */
    public ViewUserActions() {

        /*
            * Step 2 of 2 for writing user actions.
            * -------------------------------------
            *
            * Once a private inner class has been written for a user action, you
            * can wire it to a GUI element (i.e. one of GUI elements you drew in
            * the DrawnView class and which you gave a memorable public variable
            * name!).
            *
            * Use the following as a template for wiring more user actions.
         */
        System.out.println("Running");
        
        this.setLocationRelativeTo(null);
        viewStock.setLocationRelativeTo(null);
        addNewStockWindow.setLocationRelativeTo(null);
        instructionsDialog.setLocationRelativeTo(null);

        this.getContentPane().setBackground(new Color(105, 105, 105));
        addNewStockWindow.getContentPane().setBackground(new Color(105, 105, 105));

        startMenuItem.setIcon(new ImageIcon("startButton.png"));
        startMenuItem.addActionListener(new MenuActions());

        pauseMenuItem.setIcon(new ImageIcon("pauseButton.png"));
        pauseMenuItem.addActionListener(new MenuActions());

        graphMenuItem.addActionListener(new MenuActions());
        
        instructionsMenu.addActionListener(new MenuActions());

        addStockMenu.addActionListener(new MenuActions());

        //menuBar.add(graphMenuItem);
        menuBar.add(startMenuItem);
        menuBar.add(pauseMenuItem);
        menuBar.add(graphMenuItem);
        menuBar.add(instructionsMenu);

        updateField();

        ImageIcon img = new ImageIcon("Logo.png");
        this.setIconImage(img.getImage());
        addNewStockWindow.setIconImage(img.getImage());
        viewStock.setIconImage(img.getImage());

        File dir = new File("StockFiles/");
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                String path = child.getAbsolutePath();

                String[] stockData = path.substring(dir.getAbsolutePath().length() + 1, path.indexOf("HistoricalData.txt")).split(" ");

                String name = stockData[0];
                String code = stockData[1];

                add(name, code, "");

                updateList();

            }
        }
        
        

        //frame.addWindowListener(new Window());
        
        run = new ConstantRunner();
        thread1 = new Thread(run);
        thread1.start();

        passFields();

        this.addWindowListener(new Window());
        addNewStockWindow.addWindowListener(new Window());
        viewStock.addWindowListener(new Window());
        //addNewStockButton.addActionListener(new AddNewStock());
        addButton.addActionListener(new AddCreatedStock());
        //openStock.addActionListener(new OpenStock());
        backButton.addActionListener(new GoBack());
        //startAlgorithim.addActionListener(new RunAlgorithim());
        //endAlgorithim.addActionListener(new EndAlgorithim());
        buttonDelete.addActionListener(new DeleteStock());
        okButton.addActionListener(new CloseDialog());

        yes.addActionListener(new CloseProgram(true));
        no.addActionListener(new CloseProgram(false));

    }
}
