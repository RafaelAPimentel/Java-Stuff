import javax.swing.JOptionPane;

public class Survey {

	public static void main(String[] args) {
		int end = 1;
		
		int question1Answer1 =0;
		int question1Answer2=0;
		int question1Answer3=0;
		
		while(end == 1){
			int question1 = Integer.parseInt(JOptionPane.showInputDialog("Whats your favorite number? \n1: 1\n2: 2\n3: 3"));
			switch(question1){
			case 1:
				question1Answer1++;
				break;
			case 2:
				question1Answer2++;
				break;
			case 3:
				question1Answer3++;
				break;
			default:
				System.out.println("you need to enter 1,2, or 3");
			}
			end = Integer.parseInt(JOptionPane.showInputDialog("Do you want to continue \n1: yes\n2: no"));
		}
		
		System.out.println("answer1: "+ question1Answer1+ "\nanswer2: "+ question1Answer2+"\nanswer3: "+ question1Answer3);

	}

}
