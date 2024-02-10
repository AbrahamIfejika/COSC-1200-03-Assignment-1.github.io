public class JPY extends Currency {
    public JPY() {
        super(0.0091);
    }

    @Override
    public double convert(double amount, Currency toCurrency) {
        double amountInCAD = this.toCAD(amount);
        return toCurrency.fromCAD(amountInCAD);
    }
}
