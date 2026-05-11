package trafficlight;

public class Trafficlight {

    protected final TrafficlightState red = new RedState(this);
    protected final TrafficlightState green = new GreenState(this);
    protected TrafficlightState current = red;

    public String getColor() {
        return current.getColor();
    }

    public void nextColor() {
        current.nextColor();
    }
}
