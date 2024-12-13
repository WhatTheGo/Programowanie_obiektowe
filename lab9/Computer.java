import java.util.Objects;

public class Computer {
    private String brand;
    private String model;
    private Processor processor;

    public Computer(Processor processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;
        return Objects.equals(getBrand(), computer.getBrand()) &&
                Objects.equals(getModel(), computer.getModel()) &&
                getProcessor().equals(computer.getProcessor());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getBrand());
        result = 31 * result + Objects.hashCode(getModel());
        result = 31 * result + getProcessor().hashCode();
        return result;
    }
}

