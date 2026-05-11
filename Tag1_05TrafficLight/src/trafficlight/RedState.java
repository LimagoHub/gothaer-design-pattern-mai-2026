package trafficlight;

public class RedState extends AbstractTrafficlightState {
    public RedState(final Trafficlight trafficlight) {
        super(trafficlight);
    }

    @Override
    public String getColor() {
        return "RED";
    }

    @Override
    public void nextColor() {
        getTrafficlight().current = getTrafficlight().green;
    }
}
