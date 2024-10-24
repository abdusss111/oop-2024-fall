package problem2;

public class Board {
    String[][] board;

    public Board() {
        board = new String[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = " |.| ";
            }
        }
    }
    
    public void takePosition(Piece piece) {
    	int i = Math.abs(piece.a.getRow() - 9)-1;
    	int j = piece.a.getColumn() - 96 -1;
    	this.board[i][j] = " |" + piece.toString().charAt(0) +"| ";
    }
    
    public void removePiece(Position a) {
    	int i = Math.abs(a.getRow() - 9)-1;
		int j = a.getColumn() - 96 - 1;
        board[i][j] = " |.| ";

    }

    public String drawBoard() {
        String result = "";
        String columns = "87654321";
        String rows = "abcdefgh";

        result += "   ";
        for (int i = 0; i < 8; i++) {
            result += " " + rows.charAt(i) + "   "; 
        }
        result += "\n";

        for (int i = 0; i < 8; i++) {
            result += columns.charAt(i) + " ";
            for (int j = 0; j < 8; j++) {
                result += board[i][j];
            }
            result += "\n\n";
        }

        return result;
    }

}
