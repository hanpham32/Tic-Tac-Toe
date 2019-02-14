import java.util.Scanner;
import java.util.StringTokenizer;

public class input {
	private int row;
	private int column;

	public void setPoint() {
		System.out.println("Enter the position: ");
		Scanner input = new Scanner(System.in);
		String positions = input.nextLine();

		StringTokenizer st = new StringTokenizer(positions, ",");

		String first = st.nextToken();
		String second = st.nextToken();

		row = Integer.parseInt(first) - 1;
		column = Integer.parseInt(second) - 1;

		if (row > 2 || column > 2) {
			System.out.println("Invalid input please re-enter a point between 1 and 3");

			System.out.println("Enter the position: ");
			Scanner input2 = new Scanner(System.in);
			String positions2 = input.nextLine();

			StringTokenizer st2 = new StringTokenizer(positions2, ",");

			String first2 = st2.nextToken();
			String second2 = st2.nextToken();

			row = Integer.parseInt(first2) - 1;
			column = Integer.parseInt(second2) - 1;
		}
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

}
