import javax.swing.JOptionPane;

public class CreateDelivery {
	int year;
	int shortDeliveryNumber;
	int deliveryNumber;
	int deliveryArea;
	double weight,fee;
	/**
	 * @param deliveryNumber
	 * @param deliveryArea
	 * @param weight
	 * @param fee
	 */
	
	public void display(){
		System.out.println("year: "+getYear());
		System.out.println("Short num: "+getShortDeliveryNumber());
		System.out.println("Num: "+getDeliveryNumber());
		System.out.println("Delivery area: "+getDeliveryArea());
		System.out.println("Weight: "+getWeight());
		System.out.println("Fee: "+getFee());
		
	}
	public int getYear() {
		return year;
	}
	public int getShortDeliveryNumber() {
		return shortDeliveryNumber;
	}
	public int getDeliveryNumber() {
		return deliveryNumber;
	}
	public int getDeliveryArea() {
		return deliveryArea;
	}
	public double getWeight() {
		return weight;
	}
	public double getFee() {
		return fee;
	}
	
	public CreateDelivery(int year, int shortDeliveryNumber, int deliveryArea, double weight) {
		this.year = year;
		while(year<2001||year>2025){
			year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year between 2001 and 2025"));
			this.year = year;
		}
		
			
		while(shortDeliveryNumber<=0||shortDeliveryNumber>9999){
			shortDeliveryNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a delivery number between 1 and 9999"));
			this.shortDeliveryNumber = shortDeliveryNumber;
		}
		
		this.deliveryNumber = Integer.valueOf(String.valueOf(this.year)+ String.valueOf(shortDeliveryNumber));
		while(String.valueOf(this.deliveryNumber).length()<8){
			String string = String.valueOf(this.deliveryNumber);
			this.deliveryNumber = Integer.valueOf(string.substring(0,4)+ "0"+string.substring(4,string.length()));
		}
		
		
		while(deliveryArea>2||deliveryArea<1){
			deliveryArea = Integer.parseInt(JOptionPane.showInputDialog("Enter your area 1 or 2"));
			this.deliveryArea = deliveryArea;
		}
		
		while(weight<.10||weight>100){
			weight = Integer.parseInt(JOptionPane.showInputDialog("Enter the weight of object only .1-100 lb"));
			this.weight = weight;
		}
		
		switch(this.deliveryArea){
		case 1:
			if(this.weight>20){
				this.fee = 22.00;
			}
			else if(this.weight>5){
				this.fee = 16.50;
			}
			else{
				this.fee = 12.00;
			}
			break;
		case 2:
			if(this.weight>5){
				this.fee = 47.50;
			}
			else{
				this.fee = 35.00;
			}
		}
		}
	
	public static void main(String[] args) {
		CreateDelivery create = new CreateDelivery(2001,2012,0,0);
		create.display();
	}

}
