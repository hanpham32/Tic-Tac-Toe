import java.util.Scanner;
import java.util.StringTokenizer; 
public class input {
	public static void main(String args[]) { 
		System.out.println("Enter the position: "); 
		Scanner input = new Scanner(System.in);
		String positions = input.nextLine(); 

		StringTokenizer st = new StringTokenizer(positions, ",");
		
		String first = st.nextToken(); 
		String second = st.nextToken(); 
		
		int row = Integer.parseInt(first); 
		int column = Integer.parseInt(second);
		
		
	}
}
