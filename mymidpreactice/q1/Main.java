package mymidpreactice.q1;

class Vehicle {
    int speed = 0;

    void speedup() {
        speed += 1;
        System.out.println("Vehicle Speed: " + speed);

    }

    void speedDown() {
        speed -= 1;
        System.out.println("Vehicle Speed: " + speed);

    }

}

class Car extends Vehicle {
    @Override
    void speedup() {
        speed += 15;
        System.out.println("Vehicle Speed: " + speed);

    }

    @Override
    void speedDown() {
        speed -= 15;
        System.out.println("Vehicle Speed: " + speed);
    }

}

class Bicycle extends Vehicle {
    @Override
    void speedup() {
        speed += 10;
        System.out.println("Vehicle Speed: " + speed);

    }

    @Override
    void speedDown() {
        speed -= 15;
        System.out.println("Vehicle Speed: " + speed);
    }
}

public class Main{
    public static void main(String[] args)
    {
        Vehicle ob = new Vehicle();
        ob.speedup();
        ob.speedDown();
        ob = new Car();
        ob.speedup();
        ob.speedup();
        ob.speedup();
        ob.speedup();
        ob.speedDown();
        ob  = new Bicycle();
        ob.speedup();
        ob.speedup();
        ob.speedup();
        ob.speedDown();


    }
}