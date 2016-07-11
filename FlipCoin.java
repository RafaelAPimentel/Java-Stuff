
public class FlipCoin {

	public static void main(String[] args) {
		int heads=0,tails=0;

		for(int i=0;i<1000;i++){
			double result = Math.random();
			 if(result>.5){
				 tails++;
			 }
			 else{
				 heads++;
			 }
		}
		
		System.out.println("Heads: "+ heads+"\nTails: "+ tails);
	}

}
