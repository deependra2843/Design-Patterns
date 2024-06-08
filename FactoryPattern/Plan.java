public abstract class Plan {
    protected int rate;
    
    public int calculateBill(int units) {
        return rate * units;
    }

    public abstract void setRate(int rate);
}
