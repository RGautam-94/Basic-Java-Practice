package practice;

public class Miles2Kilometers {
    public static void main(String[] args) {

        double runningTimeInSec;

        double  km;
       Integer kmPerHour;
        km = 24*1.6;
runningTimeInSec = (35+(40*60)+(60*60));

        System.out.println(runningTimeInSec);
        double timeInHr = runningTimeInSec/3600;
        System.out.println(timeInHr);


kmPerHour = (int) Math.floor(km/timeInHr);
        int meters = (int) ((timeInHr%kmPerHour)*100);
        System.out.println(kmPerHour +" kilometers "+ meters+ " meters.");

    }
}
