import java.nio.charset.StandardCharsets;

public class TestClass {

    public  static void main(String[] args) {

        Car car1 = new Car();

        car1.setCarName("BMW");

        Engine engine1 = new Engine();

        engine1.setPower(200);

        car1.setCarEngine(engine1);

        SteeringWheel rule = new SteeringWheel();

        rule.setMarka("Mazda");

        car1.setSteeringWheel(rule);


        System.out.println(car1.getCarEngine().getPower());
    }
}
