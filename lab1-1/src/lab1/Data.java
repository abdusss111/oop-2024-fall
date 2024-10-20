package lab1;

public class Data {
    private int count;
    private double sum;
    private double max;

    
    public Data() {
    	this.count = 0;
    	this.sum = 0;
    	this.max = Double.NEGATIVE_INFINITY;
    }
    
    public void addNumber(double number) {
    	count++;
    	this.sum += number;
    	if (number > max) max = number;
    }
    
    public double getAverage() {
    	if (count == 0) {
    	    return 0;
    	} else {
    	    return sum / count;
    	}

    }
    
    public double getSum() {
    	return this.sum;
    }
    
    public double getMax() {
    	if (count == 0) {
            System.out.println("No data available.");
            return 0;
        } else return max;
    }
    
    public int getCount() {
    	return this.count;
    }
}

