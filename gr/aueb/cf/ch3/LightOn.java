package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * turn on when: it's dark OR raining AND running(>100)
 */
public class LightOn {
    public static void main(String[] args) {
        final  int  MAX_SPEED = 100;
        boolean isDark = false;
        boolean isRaining = false;
        boolean lightsOn = false;
        boolean running = false;
        int speed;

        Scanner in = new Scanner(System.in);

        System.out.println("please insert if raining");
        isRaining = in.nextBoolean();

        System.out.println("please insert if running");
        speed = in.nextInt();

        running = speed > MAX_SPEED;

        System.out.println("please insert if it's dark");
        isDark = in.nextBoolean();

        lightsOn = isRaining && (running || isDark);
        System.out.println(lightsOn);
    }
}
