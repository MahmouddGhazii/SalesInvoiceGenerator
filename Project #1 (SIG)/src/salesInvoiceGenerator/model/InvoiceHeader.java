package salesInvoiceGenerator.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int number;
    private Date dateOfCreation;
    private String customerName;
    private ArrayList<InvoiceLine> invoiceLines = new ArrayList<>();

    public InvoiceHeader() {
    }

    public InvoiceHeader(int number, Date dateOfCreation, String customerName) {
        this.number = number;
        this.dateOfCreation = dateOfCreation;
        this.customerName = customerName;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(ArrayList<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public double getInvoiceTotal() {
        double invoiceTotal = 0.0 ;
        for (InvoiceLine invoiceLine : invoiceLines) {
            invoiceTotal += invoiceLine.getLineTotal();
        }
        return invoiceTotal;
    }
}
