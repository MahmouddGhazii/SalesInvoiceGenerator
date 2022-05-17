package salesInvoiceGenerator.model;

public class InvoiceLine {
    private int invoiceNumber;
    private String itemName;
    private double itemPrice;
    private int count;

    public InvoiceLine() {

    }

    public InvoiceLine(int invoiceNumber, String itemName, double itemPrice, int count) {
        this.invoiceNumber = invoiceNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getLineTotal(){
        return itemPrice * count;
    }
}
