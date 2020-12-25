package com.company;

class Car {
    private int wheels;
    private String nameOfVehicle;
    private boolean engine;
    private int modalNumber;
    private String vehicleColor;
    private int cylinders;


    public Car (String nameOfVehicle, int modalNumber, String vehicleColor, int cylinders) {
        this.wheels = 4;
        this.nameOfVehicle = nameOfVehicle;
        this.engine = true;
        this.modalNumber = modalNumber;
        this.vehicleColor = vehicleColor;
        this.cylinders = cylinders;
    }

    public String startEngine() {
        return "The Car is on and running!";
    }

    public String carBrakes() {
        return "The Car is braking.";
    }
    public String accelerate() {
        return "The Car is accelerating";
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }
    public int getModalNumber() {
        return modalNumber;
    }
    public String getVehicleColor() {
        return vehicleColor;
    }
    public int cylinders() {
        return cylinders;
    }

}

class Ford extends Car {
    public Ford (String nameOfVehicle, int modalNumber, String vehicleColor, int cylinders) {
        super(nameOfVehicle, modalNumber, vehicleColor, cylinders);
    }

    @Override
    public String startEngine() {
        return "The Ford is on and running!";
    }

    @Override
    public String carBrakes() {
        return "The Ford is braking.";
    }

    @Override
    public String accelerate() {
        return "The Ford is accelerating";
    }
}

class Honda extends Car {
    public Honda (String nameOfVehicle, int modalNumber, String vehicleColor, int cylinders) {
        super(nameOfVehicle, modalNumber, vehicleColor, cylinders);
    }

    @Override
    public String startEngine() {
        return "The Honda is on and running!";
    }

    @Override
    public String carBrakes() {
        return "The Honda is braking.";
    }

    @Override
    public String accelerate() {
        return "The Honda is accelerating";
    }
}

class Toyota extends Car {
    public Toyota (String nameOfVehicle, int modalNumber, String vehicleColor, int cylinders) {
        super(nameOfVehicle, modalNumber, vehicleColor, cylinders);
    }

    @Override
    public String startEngine() {
        return "The Toyota is on and running!";
    }

    @Override
    public String carBrakes() {
        return "The Toyota is braking.";
    }

    @Override
    public String accelerate() {
        return "The Toyota is accelerating";
    }
}


public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Car", 1234, "Emerald Green", 4);
        System.out.println(myCar.startEngine());
        System.out.println(myCar.accelerate());
        System.out.println(myCar.carBrakes());

        Ford ford = new Ford("Fusion", 2231, "Sky Blue", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.carBrakes());

        Honda honda = new Honda("Civic", 2219, "Sky Blue", 4);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.carBrakes());

        Toyota toyota = new Toyota("Corolla", 4401, "Sky Blue", 8);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.carBrakes());
    }
}

