package problem2;

public class Test {

	public static void main(String[] args) {
		Position pos = new Position('h', 8);
		Position pos2 = new Position('a', 1);

		System.out.println(pos);
		System.out.println(pos.equals(pos2));
		System.out.println(pos.hashCode());
		System.out.println(pos2.hashCode());
		
		

	}

}
