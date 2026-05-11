package trafficlight;

public class GreenState extends AbstractTrafficlightState {
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
