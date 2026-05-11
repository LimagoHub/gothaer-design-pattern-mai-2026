package ain;

import trafficlight.Trafficlight;

public class Main {

    public static void main(String[] args) {
        Trafficlight trafficlight = new Trafficlight();

        trafficlight.switchOn();

        for (int i = 0; i < 5; i++) {
            System.out.println(trafficlight.getColor());
            trafficlight.nextColor();
        }
    }
}
