package Ex3;

public class Truck extends Car {
    public void m1(){
        System.out.println("Truck 1");
    }

    public void m2(){
        super.m1();
    }

    public String toString(){
        return super.toString() + super.toString();
    }
}
