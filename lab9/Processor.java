public class Processor {
    private double frequency;
    private int cores;
    private String manufacturer;

    public Processor(double frequency, int cores, String manufacturer) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Processor processor = (Processor) o;
        return Double.compare(getFrequency(), processor.getFrequency()) == 0 &&
                getCores() == processor.getCores() &&
                getManufacturer().equals(processor.getManufacturer());
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(getFrequency());
        result = 31 * result + getCores();
        result = 31 * result + getManufacturer().hashCode();
        return result;
    }
}
