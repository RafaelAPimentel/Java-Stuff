import javax.swing.JOptionPane;

public class Investment {

	public static void main(String[] args) {
		double investment;
		int years;
		
		investment = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to invest?"));
		while(investment == 0){
			investment = Double.parseDouble(JOptionPane.showInputDialog("You need to invest enter an amount!"));
		}
		
		years = Integer.parseInt(JOptionPane.showInputDialog("how many years do you want to invest"));
		while(years == 0){
			years = Integer.parseInt(JOptionPane.showInputDialog("you need to enter the amount of years to invest?"));
		}
		
		for(int i=0; i<years;i++){
			investment = investment*1.08;
			
		}
		
		System.out.println("after "+ years +" years your investment will be "+ investment);
	}
	


}
