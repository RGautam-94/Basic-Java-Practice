package polymorphism;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for Basic car, 2 for Economy car, 3 for Luxury car and 4 for Flying car:  ");
        int input = sc.nextInt();

        switch (input){
            case 1:
                Car c = new Car();
                testDrive(c);
                break;
            case 2:
                EconomyCar e = new EconomyCar();
                testDrive(e);
                break;
            case 3:
                LuxuryCar l = new LuxuryCar();
                testDrive(l);
                break;
            case 5:
                FlyingCar f = new FlyingCar();
                testDrive(f);
                break;

        }

    }
    public static void testDrive(Car c){
        c.drive();
    }
}
