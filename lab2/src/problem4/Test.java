package problem4;

public class Test {

	public static void main(String[] args) {
		Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(4.0);
        Circuit c = new Resistor(5.0);
        Circuit d = new Resistor(6.0);
        Circuit e = new Resistor(1.0);
        Circuit f = new SeriesCircuit(a, b); 
        Circuit g = new ParallelCircuit(c, d); 
        Circuit h = new SeriesCircuit(g, e);
        Circuit circuit = new ParallelCircuit(h, f); 

        double R = circuit.getResistance();
        System.out.println("resistance: " + R + " om");

        double V = 12; 
        circuit.applyPotentialDiff(V);
        System.out.println("power: " + circuit.getPower());
        System.out.println("curr: " + circuit.getCurrent());
	}

}
