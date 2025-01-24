public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 0;
    }

    @Override
    public void reset() {

    }

    @Override
    public String getStatus() {
        return "status";
    }
}
