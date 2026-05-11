package trafficlight;

public class Trafficlight {

    protected final TrafficlightState red = new RedState(this);
    protected final TrafficlightState green = new GreenState(this);
    protected final TrafficlightState off = new OffState(this);
    protected TrafficlightState current = off;

    public String getColor() {
        return current.getColor();
    }

    public void nextColor() {
        current.nextColor();
    }

    public void switchOn() {
        current.switchOn();
    }

    public void switchOff() {
        current.switchOff();
    }
}
