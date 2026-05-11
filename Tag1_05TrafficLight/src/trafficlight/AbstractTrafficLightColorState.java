package trafficlight;

public class AbstractTrafficLightColorState extends AbstractTrafficlightState{
    public AbstractTrafficLightColorState(final Trafficlight trafficlight) {
        super(trafficlight);
    }

    @Override
    public void switchOff() {
        getTrafficlight().current = getTrafficlight().off;
    }
}
