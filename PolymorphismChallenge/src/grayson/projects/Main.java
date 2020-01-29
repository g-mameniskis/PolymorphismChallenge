package grayson.projects;

class Car {

    private String model;
    private String engineType;
    private int cylinders;
    private int wheels;
    private boolean hasEngine;
    private boolean isEngineOn;
    private int currentSpeed;

    public Car(String model, String engineType, int cylinders) {
        this.model = model;
        this.engineType = engineType;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.hasEngine = true;
        this.currentSpeed = 0;
//        this.isEngineOn = isEngineOn;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getModel() {
        return model;
    }

    public String startEngine(boolean isKeyTurned) {
        if (isKeyTurned) {
            this.isEngineOn = true;
        }
        return "Engine started";
    }

    public String accelerate(boolean isGasPedalPressed, int speed) {
        if ((isEngineOn) && (isGasPedalPressed)) {
            if (speed <= 0) {
                return ("When I press the gas pedal, nothing happens; mechanic needed");
            }
            this.currentSpeed += speed;
        }
        return ("Car is accelerating at " + this.currentSpeed + " mph");
    }

    public String brake() {
        if (currentSpeed > 0) {
            this.currentSpeed = 0;
        }
        return ("Car is braking to a stop");
    }
}

class Porsche extends Car {

    public Porsche(String model, String engineType, int cylinders) {
        super(model, engineType, cylinders);
    }

    @Override
    public String startEngine(boolean isKeyTurned) {
        super.startEngine(isKeyTurned);
        return "Push to start";
    }

    @Override
    public String accelerate(boolean isGasPedalPressed, int speed) {
        return super.accelerate(isGasPedalPressed, speed);
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class AstonMartin extends Car {

    public AstonMartin(String model, String engineType, int cylinders) {
        super(model, engineType, cylinders);
    }

    @Override
    public String startEngine(boolean isKeyTurned) {
        super.startEngine(isKeyTurned);
        return "Vanquish ready for action";
    }

    @Override
    public String accelerate(boolean isGasPedalPressed, int speed) {
        return super.accelerate(isGasPedalPressed, speed);
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class BMW extends Car {

    public BMW() {
        super("M8", "V", 8);
    }

    @Override
    public String startEngine(boolean isKeyTurned) {
        return super.startEngine(isKeyTurned);
    }

    @Override
    public String accelerate(boolean isGasPedalPressed, int speed) {
        return super.accelerate(isGasPedalPressed, speed);
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

public class Main {

    public static void main(String[] args) {

    Car myCar = new Car("Generic Car", "V", 4);

        System.out.println(myCar.getModel());
        System.out.println(myCar.startEngine(true));
        System.out.println(myCar.accelerate(true, 30));
        System.out.println(myCar.brake());
        System.out.println("Current speed is now " + myCar.getCurrentSpeed() + " mph");

    System.out.println("**************************");

    Porsche myPorsche = new Porsche("918", "V", 12);
        System.out.println(myPorsche.getModel());
        System.out.println(myPorsche.startEngine(true));
        System.out.println(myPorsche.accelerate(true, 95));
        System.out.println("Current speed is now " + myPorsche.getCurrentSpeed() + " mph");

    System.out.println("**************************");

    AstonMartin myAstonMartin = new AstonMartin("Vanquish", "V", 8);
        System.out.println(myAstonMartin.getModel());
        System.out.println(myAstonMartin.startEngine(true));
        System.out.println(myAstonMartin.accelerate(true, 77));
        System.out.println(myAstonMartin.brake());

    System.out.println("**************************");

    BMW myBMW = new BMW();

        System.out.println(myBMW.getModel());
        System.out.println(myBMW.startEngine(true));
        System.out.println(myBMW.accelerate(true, 100));
        System.out.println(myBMW.brake());

    System.out.println("**************************");

    }
}
