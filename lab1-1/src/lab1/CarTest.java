package lab1;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car(1, CarBody.CROSSOVER, "WDB124580914", 2000, "Mercedes");
//		System.out.println(car.toString());
		Car otherCar = new Car(2, CarBody.SEDAN, "BMW232124580914", 10000, "BMW");
		Car anotherCar = new Car();
		System.out.println(otherCar.earnedMoney());
		System.out.println(otherCar.getProducedCars());
	}

}
