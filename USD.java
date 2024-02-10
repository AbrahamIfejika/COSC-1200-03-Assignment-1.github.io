public class USD extends Currency {
    public USD() {
        super(1.35);
    }

    @Override
    public double convert(double amount, Currency toCurrency) {
        double amountInCAD = this.toCAD(amount);
        return toCurrency.fromCAD(amountInCAD);
    }
}
