package salesInvoiceGenerator.controller;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import salesInvoiceGenerator.model.InvoiceHeader;
import salesInvoiceGenerator.model.InvoiceLine;
import salesInvoiceGenerator.view.InvoiceDialog;
import salesInvoiceGenerator.view.NewItemDialog;
import salesInvoiceGenerator.view.theMainInvoiceForm;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class InvoiceActionListener {
    public static ArrayList<InvoiceHeader> invoicesHeaders = new ArrayList<>();

    public void loadFiles(JTable leftSideTable) {
        JFileChooser myFileChooser = new JFileChooser();
        int feedBack = myFileChooser.showOpenDialog(null);
        String myPath = myFileChooser.getSelectedFile().getPath();
        if (feedBack == JFileChooser.APPROVE_OPTION) {
            invoicesHeaders.clear();
            BufferedReader csvReader = null;
            try {
                csvReader = new BufferedReader(new FileReader(myPath));
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            while (true) {
                try {
                    if (!((myPath = csvReader.readLine()) != null)) break;
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,
                            e.getMessage(),
                            "Sales Invoice Generator",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                String[] invoiceHeaderData = myPath.split(",", 3);
                InvoiceHeader newInvoice = null;
                try {
                    // Setting the Invoice number, Date, and Customer name
                    newInvoice = new InvoiceHeader(Integer.parseInt(invoiceHeaderData[0]), new SimpleDateFormat("dd-MM-yyyy").parse(invoiceHeaderData[1]),invoiceHeaderData[2]);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null,
                            e.getMessage(),
                            "Sales Invoice Generator",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                invoicesHeaders.add(newInvoice);
            }

            setInvoicesLinesArray();

            try {
                csvReader.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            showDataOnTable(leftSideTable);
        }
        fileLoadingTest();
    }

    private void setInvoicesLinesArray() {

        JOptionPane.showMessageDialog(null, "Kindly select the Invoice Lines file", "SIG (Attention)", JOptionPane.WARNING_MESSAGE);

        JFileChooser myFileChooser = new JFileChooser();
        int feedBack = myFileChooser.showOpenDialog(null);
        String myPath = myFileChooser.getSelectedFile().getPath();
        if (feedBack == JFileChooser.APPROVE_OPTION) {
            BufferedReader csvReader = null;
            try {
                csvReader = new BufferedReader(new FileReader(myPath));
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            while (true) {
                try {
                    if (!((myPath = csvReader.readLine()) != null)) break;
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,
                            e.getMessage(),
                            "Sales Invoice Generator",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                String[] invoiceLinesData = myPath.split(",", 4);

                //insert the Line to its object in the Headers Array
                for (InvoiceHeader invoiceHeader : invoicesHeaders) {
                    if (invoiceHeader.getNumber() == Integer.parseInt(invoiceLinesData[0])){
                        invoiceHeader.getInvoiceLines().add(new InvoiceLine(Integer.parseInt(invoiceLinesData[0]), invoiceLinesData[1], Double.parseDouble(invoiceLinesData[2]), Integer.parseInt(invoiceLinesData[3])));
                    }
                }
            }

            try {
                csvReader.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void showDataOnTable(JTable invoicesHeadersTable) {

        DefaultTableModel invoicesHeadersTableModel = (DefaultTableModel) invoicesHeadersTable.getModel();
        invoicesHeadersTableModel.setRowCount(0);
        Object[] rowData = new Object[4];
        for (InvoiceHeader invoiceHeader : invoicesHeaders) {
            rowData[0] = invoiceHeader.getNumber();
            rowData[1] = dateFormatter(invoiceHeader.getDateOfCreation());
            rowData[2] = invoiceHeader.getCustomerName();
            rowData[3] = invoiceHeader.getInvoiceTotal();
            invoicesHeadersTableModel.addRow(rowData);
        }
    }

    public void SaveFies() {

        JFileChooser myFileChooser = new JFileChooser();
        myFileChooser.setSelectedFile(new File("InvoiceHeader"));
        int feedBack = myFileChooser.showSaveDialog(null);
        myFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String theHeadersPath = myFileChooser.getCurrentDirectory()+"\\"+"InvoiceHeader"+".csv";
        myFileChooser.setDialogTitle("Please select the folder");
        myFileChooser.setAcceptAllFileFilterUsed(false);
        if (feedBack == JFileChooser.APPROVE_OPTION){
            FileWriter file = null;
            try {
                file = new FileWriter(theHeadersPath);
                for (InvoiceHeader inv : invoicesHeaders) {
                    file.append(String.valueOf(inv.getNumber()));
                    file.append(",");
                    file.append(dateFormatter(inv.getDateOfCreation()));
                    file.append(",");
                    file.append(inv.getCustomerName());
                    file.append("\n");
                }
                file.close();
                SavingInvoices();
                JOptionPane.showMessageDialog(null,
                        "File Saved Successfully",
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "HEADERS path is not selected!",
                    "Sales Invoice Generator",
                    JOptionPane.WARNING_MESSAGE);
        }



    }

    private void SavingInvoices(){
        JOptionPane.showMessageDialog(null, "Kindly select the folder to save LINES","SIG (Attention)", JOptionPane.WARNING_MESSAGE);
        JFileChooser myFileChooser = new JFileChooser();
        myFileChooser.setSelectedFile(new File("InvoiceLine"));
        int feedBack = myFileChooser.showSaveDialog(null);
        myFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String theLinesPath = myFileChooser.getCurrentDirectory()+"\\"+"InvoiceLine"+".csv";
        myFileChooser.setDialogTitle("Please select the folder");
        myFileChooser.setAcceptAllFileFilterUsed(false);
        if (feedBack == JFileChooser.APPROVE_OPTION){
            FileWriter file = null;
            try {
                file = new FileWriter(theLinesPath);
                for (InvoiceHeader invoicesHeader : invoicesHeaders) {
                    for (InvoiceLine line : invoicesHeader.getInvoiceLines()){
                        file.append(String.valueOf(line.getInvoiceNumber()));
                        file.append(",");
                        file.append(line.getItemName());
                        file.append(",");
                        file.append(String.valueOf(line.getItemPrice()));
                        file.append(",");
                        file.append(String.valueOf(line.getCount()));
                        file.append("\n");
                    }
                }
                file.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null,
                    "LINES path is not selected!",
                    "Sales Invoice Generator",
                    JOptionPane.WARNING_MESSAGE);
        }


    }

    public void createNewInvoice() {
        InvoiceDialog invoiceDialog = new InvoiceDialog(null, true);
        invoiceDialog.setVisible(true);
        invoiceDialog.setLocationRelativeTo(null);
    }
    public void addNewItem() {
        NewItemDialog newItemDialog = new NewItemDialog(null, true);
        newItemDialog.setVisible(true);
        newItemDialog.setLocationRelativeTo(null);
    }

    public void deleteInvoiceHeader(JTable invoicesTable, JLabel invoiceNumber) {
        int theSelectedRowIndex = invoicesTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) invoicesTable.getModel();

        if (invoicesTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Please select the Invoice!",
                    "Sales Invoice Generator",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            int feedBack = JOptionPane.showOptionDialog(new JFrame(), "Do you want to delete the Invoice?", "Sales Invoice Generator",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Yes", "No, Cancel!"}, JOptionPane.YES_OPTION);
            if (feedBack == JOptionPane.YES_OPTION) {
                model.removeRow(theSelectedRowIndex);
                invoicesHeaders.removeIf(item -> item.getNumber() == Integer.parseInt(invoiceNumber.getText()));
                   JOptionPane.showMessageDialog(null,
                        "The Invoice is deleted successfully",
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public void deleteInvoiceLine(JTable linesTable, JLabel invoiceTotal, JLabel invoiceNumber) {

        int theSelectedRowIndex = linesTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) linesTable.getModel();

        double itemValue = Double.parseDouble(model.getValueAt(theSelectedRowIndex,3).toString());
        String itemName = model.getValueAt(theSelectedRowIndex,0).toString();

        if (linesTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Please select the Invoice!",
                    "Sales Invoice Generator",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            int feedBack = JOptionPane.showOptionDialog(new JFrame(), "Do you want to delete the item?", "Sales Invoice Generator",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Yes", "No, Cancel!"}, JOptionPane.YES_OPTION);
            if (feedBack == JOptionPane.YES_OPTION) {
                model.removeRow(theSelectedRowIndex);

                for (InvoiceHeader invoiceHeader : invoicesHeaders) {
                    invoiceHeader.getInvoiceLines().removeIf(item -> item.getInvoiceNumber() == Integer.parseInt(invoiceNumber.getText()) && item.getItemName().equals(itemName));
                }

                invoiceTotal.setText(String.valueOf(Double.parseDouble(invoiceTotal.getText())- itemValue));

                for (int i = 0; i < theMainInvoiceForm.getLeftSideTable().getModel().getRowCount() ; i ++){
                    if (Integer.parseInt(theMainInvoiceForm.getLeftSideTable().getModel().getValueAt(i,0).toString()) == Integer.parseInt(invoiceNumber.getText())){
                        theMainInvoiceForm.getLeftSideTable().getModel().setValueAt(Double.parseDouble(invoiceTotal.getText()),i,3);
                    }
                }

                JOptionPane.showMessageDialog(null,
                        "The Invoice is deleted successfully",
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public String dateFormatter(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }
    private void fileLoadingTest(){
        System.out.println("The Invoice File:");
        System.out.println("__________________");

        for (InvoiceHeader invoiceHeader : invoicesHeaders) {

            System.out.println(invoiceHeader.getNumber() + "    " + invoiceHeader.getDateOfCreation() + "    " + invoiceHeader.getCustomerName() + "    " + invoiceHeader.getInvoiceTotal());
            System.out.println("The Invoice's lines : ");
            for (InvoiceLine invoiceLine : invoiceHeader.getInvoiceLines()) {
                System.out.println(invoiceLine.getItemName() + "    " + invoiceLine.getItemPrice() + "    " + invoiceLine.getCount() + "    " + invoiceLine.getLineTotal());
            }

            System.out.println("_____________________________________________________________________________________");
        }
    }


}
