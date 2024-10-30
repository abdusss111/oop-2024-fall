package problem2;

public class Board {
    static Piece[][] board;

    public Board() {
        board = new String[8][8]; // array of pieces;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = " |.| ";
            }
        }
    }
 
    public void createPiece(Position p, Color color, Pieces type) {
    	Position pos = new Position(column, row);
    	
    	Piece p2 ;
    	switch(type) {
    	case PAWN:
    	p = new Pawn(pos, color);
    	
    	case KNIGHT:
    		Knight knight = new Knight(pos, color);
    		
    	case ROOK:
    		Rook rook = new Rook(pos, color);
    		
    	case KING:
    		King king = new King(pos, color);
    		
    	case QUEEN:
    		Queen queen = new Queen(pos, color);
    		
    	case BISHOP:
    		Bishop bishop = new Bishop(pos, color);
    		
    	default:
    		System.out.println("invalid type of piece");
    	
    	}
    	this.takePosition(p2);
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
