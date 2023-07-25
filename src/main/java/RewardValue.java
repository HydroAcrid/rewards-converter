public class RewardValue {

    private double cash;
    private double miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash * 0.0035;
    }

    public RewardValue(float miles) {
        this.miles = miles;
        this.cash = cash;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.cash * 0.0035;
    }
}
