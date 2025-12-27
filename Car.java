package Vehicle;

public class Car extends BaseFunctionality implements CarInterface{

    private int carRent=500;


    public int getCarRent() {
        return carRent;
    }

    public void setCarRent(int rent) {
        this.carRent = rent;
    }
    public  int book(int days){
//        this.carRent=this.carRent*days;
//        return this.carRent;

        int store = this.getCarRent()* days;
        return store;
    }
    public  int book(int days,int hours){
        int stores=getCarRent()/24;
        int store = this.getCarRent()* (days+stores);
        return store;
    }
    public void cancel(){

        System.out.println("Car cannot be return ");
    }
    public void driverIncluded(){
        System.out.println("Driver Included");
    }

}
