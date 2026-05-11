package trafficlight;

public class GreenState extends AbstractTrafficLightColorState {
    public GreenState(final Trafficlight trafficlight) {
        super(trafficlight);
    }

    @Override
    public String getColor() {
        return "GREEN";
    }

    @Override
    public void nextColor() {
        getTrafficlight().current = getTrafficlight().red;
    }
}
