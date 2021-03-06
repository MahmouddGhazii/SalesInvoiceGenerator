/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package salesInvoiceGenerator.view;
import salesInvoiceGenerator.controller.InvoiceActionListener;
import salesInvoiceGenerator.controller.TableSelectionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRIZMA MEGA STORE
 */
public class theMainInvoiceForm extends javax.swing.JFrame {

    private InvoiceActionListener actionListener = new InvoiceActionListener();

    public static JTable getLeftSideTable() {
        return leftSideTable;
    }

    public static void setLeftSideTable(JTable leftSideTable) {
        theMainInvoiceForm.leftSideTable = leftSideTable;
    }

    public static JLabel getInvoiceNoTxt() {
        return invoiceNoTxt;
    }

    public static void setInvoiceNoTxt(JLabel invoiceNoTxt) {
        theMainInvoiceForm.invoiceNoTxt = invoiceNoTxt;
    }

    public static JLabel getInvoiceTotalTxt() {
        return invoiceTotalTxt;
    }

    public static void setInvoiceTotalTxt(JLabel invoiceTotalTxt) {
        theMainInvoiceForm.invoiceTotalTxt = invoiceTotalTxt;
    }

    public static JTable getRightSideTable2() {
        return rightSideTable2;
    }

    public static void setRightSideTable2(JTable rightSideTable2) {
        theMainInvoiceForm.rightSideTable2 = rightSideTable2;
    }


    /**
     * Creates new form theMainInvoiceForm
     */
    public theMainInvoiceForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftSidePanel = new javax.swing.JPanel();
        invoicesTableLbl = new javax.swing.JLabel();
        leftSideScrollPane = new javax.swing.JScrollPane();
        leftSideTable = new javax.swing.JTable();
        deleteInvoiceBtn = new javax.swing.JButton();
        createNewInvoiceBtn = new javax.swing.JButton();
        rightSidePanel = new javax.swing.JPanel();
        invoiceNoLbl = new javax.swing.JLabel();
        invoiceNoTxt = new javax.swing.JLabel();
        customerNameLbl = new javax.swing.JLabel();
        invoiceDateLbl = new javax.swing.JLabel();
        invoiceTotalTxt = new javax.swing.JLabel();
        invoiceTotalLbl = new javax.swing.JLabel();
        customerNameTxt = new javax.swing.JTextField();
        invoiceDateTxt = new javax.swing.JTextField();
        rightSideTablePanel = new javax.swing.JPanel();
        rightSideScrollPanel = new javax.swing.JScrollPane();
        rightSideTable2 = new javax.swing.JTable();
        deleteItemBtn = new javax.swing.JButton();
        addItemBtn = new javax.swing.JButton();
        sigMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadFileItem = new javax.swing.JMenuItem();
        saveFileItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("invoiceFrame"); // NOI18N

        invoicesTableLbl.setText("Invoices Table");

        leftSideTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leftSideTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        leftSideTable.setShowGrid(true);
        leftSideTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftSideTableMouseClicked(evt);
            }
        });
        leftSideScrollPane.setViewportView(leftSideTable);

        deleteInvoiceBtn.setText("Delete Invoice");
        deleteInvoiceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteInvoiceBtnMouseClicked(evt);
            }
        });

        createNewInvoiceBtn.setText("Create New Invoice");
        createNewInvoiceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewInvoiceBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftSidePanelLayout = new javax.swing.GroupLayout(leftSidePanel);
        leftSidePanel.setLayout(leftSidePanelLayout);
        leftSidePanelLayout.setHorizontalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(createNewInvoiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteInvoiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSidePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(invoicesTableLbl))
                    .addGroup(leftSidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(leftSideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftSidePanelLayout.setVerticalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoicesTableLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftSideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInvoiceBtn)
                    .addComponent(createNewInvoiceBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invoiceNoLbl.setText("Invoice Number");

        customerNameLbl.setText("Customer Name");

        invoiceDateLbl.setText("Invoice Date");

        invoiceTotalTxt.setText("0.0");

        invoiceTotalLbl.setText("Invoice Total");

        customerNameTxt.setEditable(false);

        invoiceDateTxt.setEditable(false);

        rightSideTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Items"));

        rightSideTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "Count", "Item Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rightSideTable2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rightSideTable2PropertyChange(evt);
            }
        });
        rightSideScrollPanel.setViewportView(rightSideTable2);

        javax.swing.GroupLayout rightSideTablePanelLayout = new javax.swing.GroupLayout(rightSideTablePanel);
        rightSideTablePanel.setLayout(rightSideTablePanelLayout);
        rightSideTablePanelLayout.setHorizontalGroup(
            rightSideTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(rightSideTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightSideTablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rightSideScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        rightSideTablePanelLayout.setVerticalGroup(
            rightSideTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
            .addGroup(rightSideTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightSideTablePanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightSideScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        deleteItemBtn.setText("Delete");
        deleteItemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteItemBtnMouseClicked(evt);
            }
        });
        deleteItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemBtnActionPerformed(evt);
            }
        });

        addItemBtn.setText("Add New Item");
        addItemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addItemBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightSidePanelLayout = new javax.swing.GroupLayout(rightSidePanel);
        rightSidePanel.setLayout(rightSidePanelLayout);
        rightSidePanelLayout.setHorizontalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSidePanelLayout.createSequentialGroup()
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightSidePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(rightSidePanelLayout.createSequentialGroup()
                                    .addComponent(invoiceNoLbl)
                                    .addGap(89, 89, 89))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightSidePanelLayout.createSequentialGroup()
                                    .addComponent(invoiceTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)))
                            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(invoiceDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(rightSidePanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(invoiceNoTxt)
                            .addComponent(invoiceTotalTxt)
                            .addComponent(invoiceDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(customerNameTxt)
                            .addGroup(rightSidePanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(addItemBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteItemBtn)))))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rightSidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rightSideTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        rightSidePanelLayout.setVerticalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceNoTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceTotalTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteItemBtn)
                    .addComponent(addItemBtn))
                .addGap(43, 43, 43))
            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightSidePanelLayout.createSequentialGroup()
                    .addContainerGap(189, Short.MAX_VALUE)
                    .addComponent(rightSideTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        fileMenu.setText("File");

        loadFileItem.setText("Load File ");
        loadFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadFileItem);

        saveFileItem.setText("Save File");
        saveFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveFileItem);

        sigMenuBar.add(fileMenu);

        setJMenuBar(sigMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(rightSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileItemActionPerformed
        JOptionPane.showMessageDialog(this, "Kindly select the Invoice Headers file","SIG (Attention)", JOptionPane.WARNING_MESSAGE);
        actionListener.loadFiles(leftSideTable);
    }//GEN-LAST:event_loadFileItemActionPerformed

    private void saveFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileItemActionPerformed
        JOptionPane.showMessageDialog(this, "Kindly select the folder to save HEADERS","SIG (Attention)", JOptionPane.WARNING_MESSAGE);
        actionListener.SaveFies();
    }//GEN-LAST:event_saveFileItemActionPerformed

    private void leftSideTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftSideTableMouseClicked
       new  TableSelectionListener(leftSideTable,rightSideTable2,invoiceNoTxt,invoiceDateTxt,customerNameTxt,invoiceTotalTxt);
    }//GEN-LAST:event_leftSideTableMouseClicked

    private void deleteInvoiceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInvoiceBtnMouseClicked
        actionListener.deleteInvoiceHeader(leftSideTable,invoiceNoTxt);
        customerNameTxt.setText("");
        invoiceDateTxt.setText("");
        invoiceNoTxt.setText("");
        invoiceTotalTxt.setText("");
        DefaultTableModel model = (DefaultTableModel) rightSideTable2.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_deleteInvoiceBtnMouseClicked

    private void createNewInvoiceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewInvoiceBtnMouseClicked
        actionListener.createNewInvoice();
    }//GEN-LAST:event_createNewInvoiceBtnMouseClicked

    private void rightSideTable2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rightSideTable2PropertyChange

    }//GEN-LAST:event_rightSideTable2PropertyChange

    private void deleteItemBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteItemBtnMouseClicked
       actionListener.deleteInvoiceLine(rightSideTable2,invoiceTotalTxt,invoiceNoTxt);
    }//GEN-LAST:event_deleteItemBtnMouseClicked

    private void deleteItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItemBtnActionPerformed

    private void addItemBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemBtnMouseClicked
         actionListener.addNewItem();
    }//GEN-LAST:event_addItemBtnMouseClicked

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
            java.util.logging.Logger.getLogger(theMainInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(theMainInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(theMainInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(theMainInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                theMainInvoiceForm mainForm = new theMainInvoiceForm();
                mainForm.setVisible(true);
                mainForm.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton createNewInvoiceBtn;
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JTextField customerNameTxt;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel invoiceDateLbl;
    private javax.swing.JTextField invoiceDateTxt;
    private javax.swing.JLabel invoiceNoLbl;
    private static javax.swing.JLabel invoiceNoTxt;
    private javax.swing.JLabel invoiceTotalLbl;
    private static javax.swing.JLabel invoiceTotalTxt;
    private javax.swing.JLabel invoicesTableLbl;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JScrollPane leftSideScrollPane;
    private static javax.swing.JTable leftSideTable;
    private javax.swing.JMenuItem loadFileItem;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JScrollPane rightSideScrollPanel;
    private static javax.swing.JTable rightSideTable2;
    private javax.swing.JPanel rightSideTablePanel;
    private javax.swing.JMenuItem saveFileItem;
    private javax.swing.JMenuBar sigMenuBar;
    // End of variables declaration//GEN-END:variables

}
