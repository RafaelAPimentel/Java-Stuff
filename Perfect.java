
public class Perfect {

	public static void main(String[] args) {
		
		
		
		for(int number=1; number<10000;number++){
			int sum = 0;
			int counter = 1;
			while(counter<number){
				if(number%counter == 0){
					sum += counter;
					counter++;
				}
				else{
					counter++;
					continue;
				}
				
			}
			
			if(sum == number){
				System.out.println(number + " is perfect number");
			}
			else{
				continue;
			}
		}
		
		}
}



