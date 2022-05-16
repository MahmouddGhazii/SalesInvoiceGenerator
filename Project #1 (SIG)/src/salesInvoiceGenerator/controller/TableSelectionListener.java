package salesInvoiceGenerator.controller;

import salesInvoiceGenerator.model.InvoiceHeader;
import salesInvoiceGenerator.model.InvoiceLine;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static salesInvoiceGenerator.controller.InvoiceActionListener.invoicesHeaders;

public class TableSelectionListener {

    public TableSelectionListener(JTable invoicesTable, JTable linesTable, JLabel invoiceNoTxt, JTextField invoiceDateTxt, JTextField customerNameTxt, JLabel invoiceTotalTxt) {

        DefaultTableModel model = (DefaultTableModel) invoicesTable.getModel();
        int theSelectedRowIndex = invoicesTable.getSelectedRow();
        invoiceNoTxt.setText(model.getValueAt(theSelectedRowIndex, 0).toString());
        invoiceDateTxt.setText(model.getValueAt(theSelectedRowIndex, 1).toString());
        customerNameTxt.setText(model.getValueAt(theSelectedRowIndex, 2).toString());
        invoiceTotalTxt.setText(model.getValueAt(theSelectedRowIndex, 3).toString());

        DefaultTableModel oldModel = (DefaultTableModel) linesTable.getModel();
        oldModel.setRowCount(0);

        Object[] rowData = new Object[4];

        for (InvoiceHeader invoiceHeader : invoicesHeaders) {
            for (InvoiceLine invoiceLine : invoiceHeader.getInvoiceLines()) {
                if (Integer.parseInt(invoiceNoTxt.getText()) == invoiceHeader.getNumber()) {
                    rowData[0] = invoiceLine.getItemName();
                    rowData[1] = invoiceLine.getItemPrice();
                    rowData[2] = invoiceLine.getCount();
                    rowData[3] = invoiceLine.getLineTotal();
                    oldModel.addRow(rowData);
                }
            }
        }
    }
}

