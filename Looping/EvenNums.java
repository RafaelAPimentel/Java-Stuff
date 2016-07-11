
public class EvenNums {

	public static void main(String[] args) {
		int counter = 2;
		while (counter <= 100) {
			if (counter % 20 == 0) {
				System.out.println("\n");
			}
			System.out.print(counter + " ");
			counter += 2;
		}

	}

}
