package Lab3;

import java.util.ArrayList;

class BusRoute {
    private static ArrayList<String> busStops;
    private static ArrayList<Integer> intervals;

    public static ArrayList<String> getBusStops() { return busStops; }
    public static ArrayList<Integer> getIntervals() { return  intervals; }

    static {
        initializeRoutesAndIntervals();
    }

    public BusRoute(){
        initializeRoutesAndIntervals();
    }

    public static void addBusStop(String stopName, Integer interval ){
        System.out.println("Creating another stop...");
        busStops.add(stopName);
        intervals.add(interval);
    }

    public static void showRoute(){
        for (String stop: busStops) {
            if(busStops.indexOf(stop) == 0){
                System.out.print("Початковий пункт: " + stop + " - ");
            }
            else if(busStops.indexOf(stop) == busStops.size() - 1){
                System.out.print("Кінцевий пункт: " + stop + "\n");
            }
            else {
                System.out.print(stop + " - ");
            }
        }
    }
    public static void initializeRoutesAndIntervals(){
        busStops = new ArrayList<>();
        busStops.add("Stop#1");
        busStops.add("Stop#2");
        busStops.add("Stop#3");
        busStops.add("Stop#4");
        busStops.add("Stop#5");

        intervals = new ArrayList<>();
        intervals.add(7);
        intervals.add(11);
        intervals.add(5);
        intervals.add(12);
    }

}
