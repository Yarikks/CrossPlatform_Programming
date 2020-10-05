package Lab3;

import java.util.ArrayList;

class BusInterval extends BusRoute {
    public BusInterval(){
        super();
    }

    public static void showTimeBetweenStops(String startStop, String endStop){
        ArrayList<String> busStops = getBusStops();
        ArrayList<Integer> intervals = getIntervals();

        if(busStops.contains(startStop) & busStops.contains(endStop)){
            int startStopIndex = busStops.indexOf(startStop);
            int endStopIndex = busStops.indexOf(endStop);
            Double intervalSum = 0.0;

            if(startStopIndex > endStopIndex){
                for (int i = endStopIndex; i < startStopIndex; i++) {
                    intervalSum += intervals.get(i);
                }
            }
            else {
                for (int i = startStopIndex; i < endStopIndex; i++) {
                    intervalSum += intervals.get(i);
                }
            }
            System.out.println("Час між зупинками: " + intervalSum);
        }
    }

    @Override
    public String toString() {
        ArrayList<String> stops = getBusStops();
        ArrayList<Integer> intervals = getIntervals();
        Integer minutes = 0;

        for (Integer interval : intervals) {
            minutes += interval;
        }
        return "Маршрут від " + stops.get(0) + " до " + stops.get(stops.size() - 1) + " займає " + minutes + " хвилин.";
    }
}
