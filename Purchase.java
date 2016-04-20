import javax.swing.JOptionPane;

public class Purchase {
	public int invoiceNumber;
	public double amountOfSale=-1.0;
	public double salesTax;
	
	public void setInvoiceNumber() {
		while(invoiceNumber<1000 ||invoiceNumber >8000){
		this.invoiceNumber = Integer.parseInt(JOptionPane.showInputDialog("enter your invoice number between 1000 and 8000!")); ;
		}
	}

	public void setAmountOfSale() {
		while(amountOfSale<=0){
			this.amountOfSale = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of sale"));			
		}
		salesTax = this.amountOfSale*.05;
	}
	
	public void getinfo(){
		setInvoiceNumber();
		setAmountOfSale();
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public double getAmountOfSale() {
		return amountOfSale;
	}

	public void display(){
		System.out.println("InvoiceNumber: "+getInvoiceNumber());
		System.out.println("Sales amount: "+getAmountOfSale());
		System.out.println("Sales tax "+getSalesTax());
		System.out.println("Total: "+(getSalesTax()+getAmountOfSale()));
	}
	public static void main(String[] args) {
		Purchase purch = new Purchase();
		purch.getinfo();
		purch.display();
	}

}
