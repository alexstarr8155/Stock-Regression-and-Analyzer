/*
 * WARNING: There is nothing in this file for students to edit or change.
 *          This file is intended to have no student-serviceable code.
 *
 * "Draw" your GUI using the "Design" tab, and remember to give
 * them memorable variable names in the "Properties" panel
 * as well as make them public variables.
 * 
 * For convenience, you may want to set the default visibility of 
 * GUI elements to be public by going to:
 *    The NetBeans Preferences or Settings menu -> Miscellaneous -> GUI Builder
 * Then set Variables Modifier to public.
 */
package cs20viewcontroller;

import cs20models.AllModelsForView;

public class DrawnView extends AllModelsForView {
    // WARNING: Do NOT modify or write any code in this file!
    // <editor-fold defaultstate="collapsed" desc="Generated Code">

    public DrawnView() {
        initComponents();
    }// </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addNewStockWindow = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stockName = new javax.swing.JTextField();
        stockCode = new javax.swing.JTextField();
        exchangeName = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        viewStock = new javax.swing.JFrame();
        nameOfStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stockCodeField = new javax.swing.JTextField();
        currentPriceField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        numberBought = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();
        openScreen = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        startMenuItem = new javax.swing.JMenuItem();
        pauseMenuItem = new javax.swing.JMenuItem();
        closingDialog = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        no = new javax.swing.JButton();
        yes = new javax.swing.JButton();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        graphMenuItem = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        instructionsDialog = new javax.swing.JDialog();
        buySellLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        instructionsMenu = new javax.swing.JMenuItem();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDisplay = new javax.swing.JList();
        earned = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        buyOrSellLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        stockMenu = new javax.swing.JMenu();
        addStockMenu = new javax.swing.JMenuItem();
        openStockMenu = new javax.swing.JMenu();

        addNewStockWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addNewStockWindow.setTitle("Add Stock");
        addNewStockWindow.setBackground(new java.awt.Color(65, 105, 225));
        addNewStockWindow.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Stock");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock Code");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Exchange Name");

        stockName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        stockCode.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        exchangeName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        addButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addButton.setText("Add");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Example1: Name: Tesla, Code: TSLA, Exchange: BLANK");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Leave Blank for NYSE");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Example2: Name: CIBC, Code: CM, Exchange: TO");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Use the code 1234 for a hyperaccelerated simulated stock");

        org.jdesktop.layout.GroupLayout addNewStockWindowLayout = new org.jdesktop.layout.GroupLayout(addNewStockWindow.getContentPane());
        addNewStockWindow.getContentPane().setLayout(addNewStockWindowLayout);
        addNewStockWindowLayout.setHorizontalGroup(
            addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(addNewStockWindowLayout.createSequentialGroup()
                .addContainerGap()
                .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(addNewStockWindowLayout.createSequentialGroup()
                        .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(stockCode)
                            .add(stockName)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, addNewStockWindowLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(addButton))
                    .add(addNewStockWindowLayout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(exchangeName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                    .add(addNewStockWindowLayout.createSequentialGroup()
                        .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel8)
                            .add(jLabel10)
                            .add(jLabel19))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addNewStockWindowLayout.setVerticalGroup(
            addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(addNewStockWindowLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(stockName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(stockCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addNewStockWindowLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(exchangeName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(4, 4, 4)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel19)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(addButton)
                .addContainerGap())
        );

        viewStock.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        viewStock.setTitle("Stock Trader");
        viewStock.setBackground(new java.awt.Color(105, 105, 105));
        viewStock.setEnabled(false);

        nameOfStock.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameOfStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameOfStock.setText("Stock Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Trading Code: ");

        stockCodeField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        currentPriceField.setBackground(new java.awt.Color(240, 240, 240));
        currentPriceField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        currentPriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentPriceField.setBorder(null);

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backButton.setText("Go Back");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Bought: ");

        numberBought.setText("jTextField1");

        buttonDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonDelete.setText("Delete This Stock");

        org.jdesktop.layout.GroupLayout viewStockLayout = new org.jdesktop.layout.GroupLayout(viewStock.getContentPane());
        viewStock.getContentPane().setLayout(viewStockLayout);
        viewStockLayout.setHorizontalGroup(
            viewStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(viewStockLayout.createSequentialGroup()
                .addContainerGap()
                .add(viewStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nameOfStock)
                    .add(currentPriceField)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, viewStockLayout.createSequentialGroup()
                        .add(0, 125, Short.MAX_VALUE)
                        .add(buttonDelete)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(backButton))
                    .add(viewStockLayout.createSequentialGroup()
                        .add(viewStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(viewStockLayout.createSequentialGroup()
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(stockCodeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(viewStockLayout.createSequentialGroup()
                                .add(jLabel7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numberBought, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewStockLayout.setVerticalGroup(
            viewStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(viewStockLayout.createSequentialGroup()
                .addContainerGap()
                .add(nameOfStock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(currentPriceField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(viewStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(stockCodeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(viewStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(viewStockLayout.createSequentialGroup()
                        .add(numberBought)
                        .add(1, 1, 1))
                    .add(jLabel7))
                .add(105, 105, 105)
                .add(viewStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backButton)
                    .add(buttonDelete))
                .addContainerGap())
        );

        jLabel11.setText("Test Text");

        org.jdesktop.layout.GroupLayout openScreenLayout = new org.jdesktop.layout.GroupLayout(openScreen.getContentPane());
        openScreen.getContentPane().setLayout(openScreenLayout);
        openScreenLayout.setHorizontalGroup(
            openScreenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(openScreenLayout.createSequentialGroup()
                .add(106, 106, 106)
                .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        openScreenLayout.setVerticalGroup(
            openScreenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(openScreenLayout.createSequentialGroup()
                .add(90, 90, 90)
                .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        startMenuItem.setText("Start");
        startMenuItem.setMaximumSize(new java.awt.Dimension(67, 40));

        pauseMenuItem.setText("Pause");
        pauseMenuItem.setMaximumSize(new java.awt.Dimension(75, 40));
        pauseMenuItem.setPreferredSize(new java.awt.Dimension(18, 18));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Are You Sure You Would Like To Quit?");

        no.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        no.setText("No");

        yes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yes.setText("Yes");

        org.jdesktop.layout.GroupLayout closingDialogLayout = new org.jdesktop.layout.GroupLayout(closingDialog.getContentPane());
        closingDialog.getContentPane().setLayout(closingDialogLayout);
        closingDialogLayout.setHorizontalGroup(
            closingDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(closingDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(closingDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel12)
                    .add(closingDialogLayout.createSequentialGroup()
                        .add(yes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(no, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        closingDialogLayout.setVerticalGroup(
            closingDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(closingDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(closingDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(yes)
                    .add(no))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        graphMenuItem.setText("View Graphs");
        graphMenuItem.setMaximumSize(new java.awt.Dimension(120, 50));

        org.jdesktop.layout.GroupLayout jFrame1Layout = new org.jdesktop.layout.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        buySellLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        buySellLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buySellLabel.setText("Instructions");

        okButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        okButton.setText("OK");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Use the Stock menu bar to add new stocks, or open the data of each created stock.");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Press the start buton to begin the monitoring, for optimal performance pause the program when doing other activities.");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Click the View Graphs menu to see a graphical representation of your stocks");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("The graph begins large enough to view all stocks, zoom in by using the cursor to highligh the area you would like to zoom in on");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("To zoom out right click, go Auto Range, then Range Axis");
        jLabel17.setToolTipText("");

        org.jdesktop.layout.GroupLayout instructionsDialogLayout = new org.jdesktop.layout.GroupLayout(instructionsDialog.getContentPane());
        instructionsDialog.getContentPane().setLayout(instructionsDialogLayout);
        instructionsDialogLayout.setHorizontalGroup(
            instructionsDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(instructionsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(instructionsDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(buySellLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, instructionsDialogLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(instructionsDialogLayout.createSequentialGroup()
                        .add(instructionsDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel13)
                            .add(jLabel14)
                            .add(jLabel15)
                            .add(jLabel16)
                            .add(jLabel17))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        instructionsDialogLayout.setVerticalGroup(
            instructionsDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(instructionsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(buySellLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel13)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel14)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel15)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel16)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel17)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(okButton)
                .addContainerGap())
        );

        instructionsMenu.setText("Instructions");
        instructionsMenu.setMaximumSize(new java.awt.Dimension(150, 50));

        jLabel18.setText("jLabel18");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Stock Trader");
        setBackground(new java.awt.Color(105, 105, 105));
        setSize(new java.awt.Dimension(0, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Stocks Being Monitored");

        listDisplay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        listDisplay.setMaximumSize(new java.awt.Dimension(300, 400));
        listDisplay.setMinimumSize(new java.awt.Dimension(300, 400));
        listDisplay.setSelectionBackground(new java.awt.Color(255, 255, 255));
        listDisplay.setSelectionForeground(new java.awt.Color(105, 105, 105));
        jScrollPane1.setViewportView(listDisplay);

        earned.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        earned.setForeground(new java.awt.Color(255, 255, 255));
        earned.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        earned.setText("$0.0");

        buyOrSellLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buyOrSellLabel.setForeground(new java.awt.Color(255, 255, 255));
        buyOrSellLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        menuBar.setBackground(new java.awt.Color(120, 120, 120));

        stockMenu.setText("Stocks");

        addStockMenu.setText("Add New Stock");
        stockMenu.add(addStockMenu);

        openStockMenu.setText("Open Stocks");
        stockMenu.add(openStockMenu);

        menuBar.add(stockMenu);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(filler1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(154, 154, 154))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(earned, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .add(buyOrSellLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .add(18, 18, 18)
                .add(earned, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buyOrSellLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(filler1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // WARNING: Do NOT modify or write any code in this file!
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    public javax.swing.JFrame addNewStockWindow;
    public javax.swing.JMenuItem addStockMenu;
    public javax.swing.JButton backButton;
    public javax.swing.JButton buttonDelete;
    public javax.swing.JLabel buyOrSellLabel;
    public javax.swing.JLabel buySellLabel;
    public javax.swing.JDialog closingDialog;
    public javax.swing.JTextField currentPriceField;
    public javax.swing.JLabel earned;
    public javax.swing.JTextField exchangeName;
    private javax.swing.Box.Filler filler1;
    public javax.swing.JMenuItem graphMenuItem;
    public javax.swing.JDialog instructionsDialog;
    public javax.swing.JMenuItem instructionsMenu;
    javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList listDisplay;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JTextField nameOfStock;
    public javax.swing.JButton no;
    public javax.swing.JTextField numberBought;
    public javax.swing.JButton okButton;
    public javax.swing.JFrame openScreen;
    public javax.swing.JMenu openStockMenu;
    public javax.swing.JMenuItem pauseMenuItem;
    public javax.swing.JMenuItem startMenuItem;
    public javax.swing.JTextField stockCode;
    public javax.swing.JTextField stockCodeField;
    public javax.swing.JMenu stockMenu;
    public javax.swing.JTextField stockName;
    public javax.swing.JFrame viewStock;
    public javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}