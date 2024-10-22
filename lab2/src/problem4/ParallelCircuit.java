package problem4;

public class ParallelCircuit extends Circuit {
    private Circuit circuit1, circuit2;

    public ParallelCircuit(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        double R1 = circuit1.getResistance();
        double R2 = circuit2.getResistance();
        return 1 / (1 / R1 + 1 / R2);
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff(); 
    }

    @Override
    public void applyPotentialDiff(double V) {
        circuit1.applyPotentialDiff(V);
        circuit2.applyPotentialDiff(V);
    }
}

