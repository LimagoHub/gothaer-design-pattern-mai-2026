package trafficlight;

public abstract class AbstractTrafficlightState implements TrafficlightState {

    private final Trafficlight trafficlight;

    public AbstractTrafficlightState(final Trafficlight trafficlight) {
        this.trafficlight = trafficlight;
    }

    public final Trafficlight getTrafficlight() {
        return trafficlight;
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Diese Methode macht hier keinen Sinn");
    }

    @Override
    public void nextColor() {
        throw new UnsupportedOperationException("Diese Methode macht hier keinen Sinn");
    }

    @Override
    public void switchOn() {
        throw new UnsupportedOperationException("Diese Methode macht hier keinen Sinn");
    }

    @Override
    public void switchOff() {
        throw new UnsupportedOperationException("Diese Methode macht hier keinen Sinn");

    }
}
