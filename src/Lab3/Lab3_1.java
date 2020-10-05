package Lab3;

public class Lab3_1 {
    public static void main(String[] args){
        BusInterval bi = new BusInterval();
        BusRoute.showRoute();
        System.out.println(bi);
        BusRoute.addBusStop("Another Stop", 5);
        BusRoute.showRoute();
        System.out.println(bi);
        BusRoute.addBusStop("Stop#11", 7);
        BusRoute.showRoute();
        System.out.println(bi);

        BusInterval.showTimeBetweenStops("Stop#5", "Stop#4");

    }
}
