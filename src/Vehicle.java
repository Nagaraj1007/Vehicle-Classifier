abstract class Vehicle {
    abstract String start();
    abstract String stop();
}
class Car extends Vehicle{
    String start(){
        return "Car Started";
    }
    String stop(){
        return "Car Stopped";
    }
}
class Motorcycle extends Vehicle{
    String start(){
        return "Motorcycle Started";
    }
    String stop(){
        return "Motorcycle Stopped";
    }
}


