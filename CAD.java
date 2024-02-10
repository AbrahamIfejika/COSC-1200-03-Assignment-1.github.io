public class CAD extends Currency {
    public CAD() {
        super(1.0);
    }

    @Override
    public double convert(double amount, Currency toCurrency) {
        double amountInCAD = this.toCAD(amount);
        return toCurrency.fromCAD(amountInCAD);
    }
}
