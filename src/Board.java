public class Board {
       private static String[][] gameBoard = new String[3][3];

       public Board(){
    	   this.init();
       }
       
       public void init() {
             for (int i=0; i<gameBoard.length; i++) {
                    for (int j=0; j<gameBoard.length; j++) {
                           gameBoard[i][j] = " ";
                    }
             }
       }
       
       public void display() {
             System.out.println("+-+-+-+");
             for (int i=0; i < gameBoard.length; i++) {
                    for (int j=0; j < gameBoard.length; j++) {
                           System.out.print("|" + gameBoard[i][j]);
                    }
                    System.out.print("|");
                    System.out.println();
                    System.out.println("+-+-+-+");
             }
       }
       public void updateBoard(input in, String currentTurn) {
             int row = in.getRow();
             int col = in.getColumn();
             gameBoard[row][col] = currentTurn;
       }
       
       public boolean check(String turn) { // Return true if a player win, then set running to false
             // Code here ... 
             for (int i=0; i<3; i++) {
            	 int count = 0;
            	 for (int j=0; j<3; j++) {
            		 if (gameBoard[i][j].equals(turn)) {
            			 count++;
            			 
            		 }
            	 }
            	 if (count == 3) {
            		 return true;
            	 }
             }
             for (int i=0; i<3; i++) {
            	 int count = 0;
            	 for (int j=0; j<3; j++) {
            		 if (gameBoard[j][i].equals(turn)) {
            			 count++;
            		 }
            	 }
            	 if (count == 3) {
            		 return true;
            	 }
             }
             
             // Check diagonal
             int count1 = 0;
             int count2 = 0;
             for (int i=0; i<3; i++) {
            	 for (int j=0; j<=0; j++) {
            		 if (gameBoard[i][i].equals(turn)) {
            			 count1++;
            		 }
            	 }
            	 if (count1 == 3) {
            		 return true;
            	 }
             }
             for (int i=2; i >= 0; i--) {
            	 for (int j=0; j<3; j++) {
            		 if (gameBoard[i][j].equals(turn)) {
            			 count2++;
            		 }
            	 }
            	 if (count2 == 3) {
            		 return true;
            	 }
             }
             return false;
       }
}
