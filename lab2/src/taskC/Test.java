package taskC;

public class Test {

	public static void main(String[] args) {
		Shirt sh1 = new Shirt("favorite", Type.CLASSIC, Season.FALL, 42);
		Shirt sh2 = new Shirt("favorite", Type.CLASSIC, Season.FALL, 42);
		Shirt sh3 = sh1;
		Shirt sh4 = new Shirt("party", Type.CLASSIC, Season.WINTER, 52);

		System.out.println(sh1);
		System.out.println(sh4);
		System.out.println(sh1.equals(sh2));
		System.out.println(sh1.equals(sh3));
		System.out.println(sh1.equals(sh4));
		System.out.println(sh1.hashCode());
		System.out.println(sh2.hashCode());

		


	}

}
