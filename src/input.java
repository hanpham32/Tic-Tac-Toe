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
       }

       public int getRow() {
             return row;
       }
       
       public int getColumn() {
             return column;
       }
       
       
}
