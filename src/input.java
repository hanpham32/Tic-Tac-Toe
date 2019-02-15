import java.util.Scanner;
import java.util.StringTokenizer;

public class input {
	private int row; // set variable row
	
	private int column; // set variable column 
	
	// creating point method 
	public void setPoint() {
		
		// getting user input for point 	
		System.out.println("Enter the position: ");
		Scanner input = new Scanner(System.in);
		String positions = input.nextLine();

		// tokenize input -- split up row and column 
		StringTokenizer st = new StringTokenizer(positions, ",");

		// assigning tokens to variables 
		String first = st.nextToken();
		String second = st.nextToken();

		// parsing variables to row and column and making them into numbers arrays can use 
		row = Integer.parseInt(first) - 1;
		column = Integer.parseInt(second) - 1;
		checkPoint(); 
	}
	
	public void checkPoint() {
		// If one of these conditions are met then the given input is out of bound
		if (row > 2 || column > 2 || row < 0 || column < 0) {
			System.out.println("Invalid input please re-enter a point between 1 and 3");
			setPoint(); 
		}
	}
	
	// get method for row 
	public int getRow() {
		return row;
	}

	// get method for column 
	public int getColumn() {
		return column;
	}

}
