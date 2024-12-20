package problem2;

public class Test {

	public static void main(String[] args) {
		
		Board b = new Board();

		System.out.println(b.drawBoard());
	
		Position pos3 = new Position('h', 4);
		Queen king = new Queen(pos3, Color.WHITE);
		b.takePosition(king);
		
		
		Position pos4 = new Position('g', 5);
		Pawn pawn = new Pawn(pos4, Color.BLACK);
		b.takePosition(pawn);
		System.out.println(b.drawBoard());

//		System.out.println(king);

		king.eat(pawn, b);
//		System.out.println(king);

		b.takePosition(king);
//		System.out.println(king);

		System.out.println((king.isLegalMove(pawn.a) && !(pawn.a.isPositionEmpty()) &&  king.getColor() != pawn.getColor()));
		System.out.println(b.drawBoard());

		

		
		
	}

}
