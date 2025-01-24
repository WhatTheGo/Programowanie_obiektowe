public class UnitConverter implements Converter {
    @Override
    public double convertToEuro(double amount) {
        return amount * 4;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 3;
    }

    @Override
    public double getConversionRate(String currency) {
        return 0;
    }
}
