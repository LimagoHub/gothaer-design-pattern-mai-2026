package trafficlight;

public class OffState extends AbstractTrafficlightState {
    public OffState(final Trafficlight trafficlight) {
        super(trafficlight);
    }

    @Override
    public void switchOn() {
        getTrafficlight().current = getTrafficlight().red;

    }
}
