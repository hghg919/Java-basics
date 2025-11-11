public class ECar {

    public static ECar getInstance() {
        return new ECar();   // (1)
    }

    private int batteryPercentage = 100; // (2)
    private int distance = 0;          // (3)

    public void dispDistance() {
        System.out.println(distance + "km 이동했습니다");
    }

    public void dispBattery() {
        if (this.batteryPercentage == 0) {
            System.out.println("Battery empty");
            return;
        }
        System.out.println("Battery: " + batteryPercentage + "%");
    }

    public void drive() {
        if (this.batteryPercentage != 0) {
            this.distance += 1;      // (4)
            this.batteryPercentage -= 10; // (5)
        }
    }

    public static void main(String[] args) {

        ECar car = ECar.getInstance();  // (6)

        car.drive();
        car.drive();

        car.dispDistance();   // (7)
        car.dispBattery();   // (8)
    }
}
