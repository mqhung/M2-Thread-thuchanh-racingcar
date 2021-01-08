public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car firstCar = new Car("BWM");
        Car secondCar = new Car("Lexus");
        Car thirdCar = new Car("Audi");
        Thread t1 = new Thread(firstCar);
        Thread t2 = new Thread(secondCar);
        Thread t3 = new Thread(thirdCar);
        System.out.println("Distance: 100 KM");
        try {
            t1.start();
            t2.start();
            t3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
