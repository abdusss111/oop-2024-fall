package week2;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(18, 30, 0);
		Time t2 = new Time(18, 0, 0);
		System.out.println(t.toStandard());
		System.out.println(t2.toUniversal());
		System.out.println(t.add(t2).toUniversal());

	}

}
