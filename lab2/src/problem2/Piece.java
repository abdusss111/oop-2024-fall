package problem2;

import java.util.Objects;

public abstract class Piece {
	Position a;
	public abstract boolean isLegalMove(Position b);
	
	@Override
	public String toString() {
		return a.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj.getClass() != this.getClass() || obj == null) return false;
		Piece piece = (Piece)obj;
		return Objects.equals(a, piece.a);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(a);
	}
}
