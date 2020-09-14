package Lab1;

public class Parking {
    public static void main(String[] args){
        for(int i=0;i<7;i++){
            System.out.println(new Vehicle((int)(Math.random()*220)));
        }
    }
}
