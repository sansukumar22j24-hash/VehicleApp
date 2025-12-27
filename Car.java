package Vehicle;

public class Car extends BaseFunctionality implements CarInterface{

    private int carRent=500;

    public int getRent() {
        return carRent;
    }

    public void setRent(int rent) {
        this.carRent = rent;
    }
    public  int book(int days){
        this.carRent=this.carRent*days;
        return this.carRent;
    }
    public void cancel(){

        System.out.println("Car cannot be return ");
    }
    public void driverIncluded(){
        System.out.println("Driver Included");
    }
}
