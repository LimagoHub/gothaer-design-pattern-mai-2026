package trafficlight;

public interface TrafficlightState {

    String getColor();
    void nextColor();
    void switchOn();
    void switchOff();
}
