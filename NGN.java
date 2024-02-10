public class NGN extends Currency {
    public NGN() {
        super(0.000949);
    }

    @Override
    public double convert(double amount, Currency toCurrency) {
        double amountInCAD = this.toCAD(amount);
        return toCurrency.fromCAD(amountInCAD);
    }
}
