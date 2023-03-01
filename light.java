public class light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 18600; // ligth speed 

        days= 1000; // specify number of days here

        seconds = days *24 * 60 *60; // convert to seconds

        distance = lightspeed * seconds;
        System.out.println();
        System.out.print(" In "+days);
        System.out.print("days light will travel about ");
        System.out.print(distance + " miles\n");


    }
    
}
