package lab1;

public class Car {
    private final int id; 
    private String carName;
    private CarBody carBody;
    private int cost;
    private static int producedCars; 
    private final String vin; 
    
    { //init block
        System.out.println("A new car is created!");
        producedCars++; 
        if (carBody == null) {
            System.out.println("Warning: Car body is not set!");
        }
        if (carName == null || carName.isEmpty()) {
            carName = "Unnamed Car";
        }
    }

    // constructors
    public Car() {
        this(0, null, "", 0, ""); 
    }

    public Car(int id) {
        this(id, null, "", 0, "");
    }

    public Car(int id, CarBody carBody) {
        this(id, carBody, "", 0, ""); 
    }

    public Car(int id, CarBody carBody, String vin, int cost, String carName) {
        this.id = id; 
        this.carBody = carBody;
        this.vin = vin;
        this.cost = cost;
        this.carName = carName;
    }
    
//getters & setters
    public int earnedMoney() {
        return producedCars * cost; 
    }

    public int getId() {
        return id;
    }

    public CarBody getCarBody() {
        return carBody;
    }
    
    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public static int getProducedCars() {
        return producedCars;
    }

    public String getVin() {
        return vin;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    
    public int getCost() {
    	return this.cost;
    }
    
    public void setCost(int cost) {
    	this.cost = cost;
    }
    
    
    public String toString() {
        return "Car ID: " + id + ", Name: " + carName + ", Body: " + carBody + ", VIN: " + vin;
    }
}
