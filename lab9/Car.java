public record Car(String brand, String model, double fuelConsumptionPer100km) {
    public double fuelCost(double fuelPrice, double distance){
        return fuelPrice * (distance/100) * fuelConsumptionPer100km;
    }
}
