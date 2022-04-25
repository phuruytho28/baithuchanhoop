package Car;

public class TaxiCar implements Car {
    public void Move() {
        System.out.println("Tai xe dang chay");
    }

    public void Stop() {
        System.out.println("Dung lai");
    }

    public void TurnRight() {
        System.out.println("Re phai");
    }

    public void TurnLeft() {
        System.out.println("Re trai");
    }

    public void Reverse() {
        System.out.println("reverse");
    }
}