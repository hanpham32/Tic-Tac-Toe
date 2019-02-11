public class Main {
       public static void main(String[] args) {
             boolean running = true;
             String[] turn = {"X","O"}; 
             
             int token = 0;
             input in = new input();
             Board board = new Board();
             while (running) {
                    String currentTurn = turn[token];
                    System.out.println(turn[token] + "'s Turn");
                    in.setPoint();
                    board.updateBoard(in, currentTurn);
                    board.display();
                    System.out.println();
                    
                    if (board.check(currentTurn)) {
                    	System.out.println(currentTurn + " Win");
                    	running = false;
                    }
                    // Flip turn
                    token++;
                    if (token == 2) {
                           token = 0;
                    }
             }
       }
}
