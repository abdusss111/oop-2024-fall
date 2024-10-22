package problem4;

public abstract class Circuit {
    public abstract double getResistance();
    double R = getResistance();
    public abstract double getPotentialDiff();
    double V = getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower() {// v^2 / r
        return V * V / R;
    }

    public double getCurrent() {// i = v/r
    	
        return V / R;
    }
}

