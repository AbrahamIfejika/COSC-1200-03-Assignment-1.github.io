public abstract class Currency {
    protected double rateToCAD; // Conversion rate to CAD

    public Currency(double rateToCAD) {
        this.rateToCAD = rateToCAD;
    }

    // Converts an amount from this currency to CAD
    public double toCAD(double amount) {
        return amount * rateToCAD;
    }

    // Converts an amount from CAD to this currency
    public double fromCAD(double amount) {
        return amount / rateToCAD;
    }

    // Abstract method to be implemented by subclasses for conversion between currencies
    public abstract double convert(double amount, Currency toCurrency);
}
