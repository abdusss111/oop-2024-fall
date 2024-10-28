package problem2;

public class Board {
    static String[][] board;

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
    
    public void createPiece(char column, int row, Color color, Pieces type) {
    	Position pos = new Position(column, row);
    	switch(type) {
    	case PAWN:
    		Pawn pawn = new Pawn(pos, color);
    		this.takePosition(pawn);
    	case KNIGHT:
    		Knight knight = new Knight(pos, color);
    		this.takePosition(knight);
    	case ROOK:
    		Rook rook = new Rook(pos, color);
    		this.takePosition(rook);
    	case KING:
    		King king = new King(pos, color);
    		this.takePosition(king);
    	case QUEEN:
    		Queen queen = new Queen(pos, color);
    		this.takePosition(queen);
    	case BISHOP:
    		Bishop bishop = new Bishop(pos, color);
    		this.takePosition(bishop);
    	default:
    		System.out.println("invalid type of piece");
    	
    	}
    }
    

    public void takePosition(Piece piece) {
    	int i = Math.abs(piece.a.getRow() - 9)-1;
    	int j = piece.a.getColumn() - 96 -1;
    	Board.board[i][j] = " |" + piece.toString().charAt(0) +"| ";
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
