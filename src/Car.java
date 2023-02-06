public class Car {

    private  Tires carTires = new Tires();

    private String carName;

    private Engine carEngine;

    private SteeringWheel steeringWheel;

    void setCarName(String newName){
        this.carName = newName;
    }

    void setCarEngine(Engine newEngine){
        this.carEngine = newEngine;
    }

    void  setSteeringWheel(SteeringWheel newSteeringWheel){
        this.steeringWheel = newSteeringWheel;
    }

    public String getCarName(){
        return carName;
    }

    public Engine getCarEngine(){
        return carEngine;
    }

    public SteeringWheel getSteeringWheel(){
        return  steeringWheel;
    }
}
