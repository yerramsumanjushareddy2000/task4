package Calculations;

public class SimpleCompound {
    int principal;
    float rate;
    int time;
    float simpleInterest;
    double compoundInterest;

    public SimpleCompound(int principal, float rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public float simpleInterest()
    {
        simpleInterest = ( principal * rate * time ) / 100;
        return simpleInterest;
    }

    public double compoundInterest()
    {
        compoundInterest = Math.pow ( (( principal * rate ) / 100 ) , time );
        return compoundInterest;
    }
}
