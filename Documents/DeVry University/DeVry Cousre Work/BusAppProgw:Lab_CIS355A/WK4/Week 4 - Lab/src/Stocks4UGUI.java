
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**************************************************** 
Program Name: Stock4UGUI 
Programmer's Name: Xavier Avery 
Program Description: Stocks4U Portfolio Management System
***********************************************************/

public class Stocks4UGUI extends javax.swing.JFrame {
    // class level references or attributes
    private DefaultListModel<Stock> model;
    
    /**
     * Creates new form Stocks4UGUI
     */
    public Stocks4UGUI() {
        // create the model for the JList
        model = new DefaultListModel<Stock>();
        
        initComponents();
        
        //Centered GUI
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMainTabs = new javax.swing.JTabbedPane();
        pnlStockList = new javax.swing.JPanel();
        scrStocks = new javax.swing.JScrollPane();
        lstStocks = new javax.swing.JList<>();
        lblProfitLoss = new javax.swing.JLabel();
        btnRemoveStock = new javax.swing.JButton();
        pnlAddStock = new javax.swing.JPanel();
        lblStockName = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblCurrentPrice = new javax.swing.JLabel();
        lblPurchasePrice = new javax.swing.JLabel();
        txtStockName = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtCurrentPrice = new javax.swing.JTextField();
        btnAddStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock4U App");

        jtpMainTabs.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        lstStocks.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lstStocks.setModel(model);
        lstStocks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStocksValueChanged(evt);
            }
        });
        scrStocks.setViewportView(lstStocks);

        lblProfitLoss.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblProfitLoss.setText("Profit / Loss");

        btnRemoveStock.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnRemoveStock.setText("Remove Stock");
        btnRemoveStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStockListLayout = new javax.swing.GroupLayout(pnlStockList);
        pnlStockList.setLayout(pnlStockListLayout);
        pnlStockListLayout.setHorizontalGroup(
            pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrStocks)
                    .addGroup(pnlStockListLayout.createSequentialGroup()
                        .addComponent(lblProfitLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlStockListLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnRemoveStock)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStockListLayout.setVerticalGroup(
            pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProfitLoss)
                .addGap(18, 18, 18)
                .addComponent(btnRemoveStock)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jtpMainTabs.addTab("List", pnlStockList);

        lblStockName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblStockName.setText("Stock name");

        lblQuantity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblQuantity.setText("Quantity");

        lblCurrentPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCurrentPrice.setText("Current price");

        lblPurchasePrice.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblPurchasePrice.setText("Purchase price");

        btnAddStock.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnAddStock.setText("Add Stock");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddStockLayout = new javax.swing.GroupLayout(pnlAddStock);
        pnlAddStock.setLayout(pnlAddStockLayout);
        pnlAddStockLayout.setHorizontalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStockName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addComponent(lblPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddStockLayout.createSequentialGroup()
                        .addComponent(lblCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCurrentPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlAddStockLayout.setVerticalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStockLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jtpMainTabs.addTab("Add Stock", pnlAddStock);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpMainTabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpMainTabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        // verify that the fields are complete
        if (txtStockName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Stock name is required.", "Error. Missing Information", JOptionPane.ERROR_MESSAGE);
            txtStockName.requestFocus();
            return;         // end method
        }
        
        if (txtQuantity.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Quantity is required.", "Error. Missing Information", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;         // end method
        }
        
        if (txtPurchasePrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Purchase Price is required.", "Error. Missing Information", JOptionPane.ERROR_MESSAGE);
            txtPurchasePrice.requestFocus();
            return;         // end method
        }
        
        if (txtCurrentPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Current Price is required.", "Error. Missing Information", JOptionPane.ERROR_MESSAGE);
            txtCurrentPrice.requestFocus();
            return;         // end method
        }
        
        double quantity = 0.0;  // THIS DONE WITH VALIDATION: double quantity = Double.parseDouble(txtQuantity.getText());
        try {
            quantity = Double.parseDouble(txtQuantity.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. please use number only." , "Error, Invalid data", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;        // end method
        }
        
        double purchasePrice = 0.0;
        try {
            purchasePrice = Double.parseDouble(txtPurchasePrice.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. please use number only." , "Error, Invalid data", JOptionPane.ERROR_MESSAGE);
            txtPurchasePrice.requestFocus();
            return;        // end method
        }
        
        double currentPrice = 0.0; // THIS DONE WITH VALIDATION: double currentPrice = Double.parseDouble(txtCurrentPrice.getText());
        try {
            currentPrice = Double.parseDouble(txtCurrentPrice.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. please use number only." , "Error, Invalid data", JOptionPane.ERROR_MESSAGE);
            txtCurrentPrice.requestFocus();
            return;        // end method
        }
        
        // get input
        String stockName = txtStockName.getText();
        
        // create the stock object
        Stock stk = new Stock(stockName, quantity, purchasePrice, currentPrice);
        
        // add the Stock object to the JList
        model.addElement(stk);
        
        // reset form for the next stock
        txtStockName.setText("");
        txtQuantity.setText("");
        txtPurchasePrice.setText("");
        txtCurrentPrice.setText("");
        txtStockName.requestFocus();
        
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void lstStocksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStocksValueChanged
        // get stock and show the current profit/loss
        Stock stk = lstStocks.getSelectedValue();
        
        if (stk != null) {
            double profitLoss = stk.getProfitLoss();
            DecimalFormat fmt = new DecimalFormat("#,##0.00");
            if (profitLoss > 0.0){
                lblProfitLoss.setText("Profit of " + fmt.format(profitLoss));
            }
            else if ( profitLoss < 0.0){
                lblProfitLoss.setText("Loss of " + fmt.format(profitLoss));
            }
            else{
                lblProfitLoss.setText("Break-even with zero profit/loss");
            }
        }
    }//GEN-LAST:event_lstStocksValueChanged

    private void btnRemoveStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStockActionPerformed
        // get stock position
        int position = lstStocks.getSelectedIndex();
        
        // if selected, remove the stock
        if ( position >= 0) {
            model.remove(position);
            lblProfitLoss.setText("Profit / Loss");
        }
    }//GEN-LAST:event_btnRemoveStockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stocks4UGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stocks4UGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stocks4UGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stocks4UGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stocks4UGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnRemoveStock;
    private javax.swing.JTabbedPane jtpMainTabs;
    private javax.swing.JLabel lblCurrentPrice;
    private javax.swing.JLabel lblProfitLoss;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStockName;
    private javax.swing.JList<Stock> lstStocks;
    private javax.swing.JPanel pnlAddStock;
    private javax.swing.JPanel pnlStockList;
    private javax.swing.JScrollPane scrStocks;
    private javax.swing.JTextField txtCurrentPrice;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStockName;
    // End of variables declaration//GEN-END:variables
}
