package lab1;

public class TemperatureTest {

	public static void main(String[] args) {
		
		Temperature firstTemp = new Temperature();
		Temperature secondTemp = new Temperature(10);
		Temperature thirdTemp = new Temperature('F');
		Temperature fourthTemp = new Temperature(22.0, 'C');
		System.out.println(fourthTemp.toString());
		System.out.println(thirdTemp.toString());
		System.out.println(secondTemp.toString());
		System.out.println(firstTemp.toString());

	}

}
