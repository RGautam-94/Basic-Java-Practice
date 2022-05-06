package practice;

public class currentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        // Total Seconds
        long totalSeconds = totalMilliseconds / 1000;
        // Current Seconds
        Long currentSeconds = totalSeconds % 60;
        // Total Minutes
        Long totalMinutes = totalSeconds / 60;
        // CurrentMinutes
        long currentMinutes = totalMinutes % 60;
        // Total Hours
        long totalHours = totalMinutes / 60;
        // Current hours
        long currentHours = totalHours % 24;

        System.out.println("Current time is >> " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
        if (currentHours <= 12) {
            if (currentHours < 12) {
                System.out.println("Current time is >> " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " AM GMT");
            } else {
                System.out.println("Current time is >> " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " PM GMT ");
            }
        } else {
            currentHours = currentHours % 12;
            if (currentHours == 0) {
                System.out.println("Current time is >> " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " AM GMT ");
            } else {

                System.out.println("Current time is >> " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " PM GMT ");
            }
        }


    }
}
