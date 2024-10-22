package problem4;

public class SeriesCircuit extends Circuit {
    private Circuit circuit1, circuit2;

    public SeriesCircuit(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        return circuit1.getResistance() + circuit2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff() + circuit2.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
    	// I = V / R
    	// V1 = R1*I, V2 = R2*I

    	double I = V / this.getResistance();
       double V1 = I * circuit1.getResistance();
       double V2 = I * circuit2.getResistance();
       circuit1.applyPotentialDiff(V1);
       circuit2.applyPotentialDiff(V2);
    }
}

