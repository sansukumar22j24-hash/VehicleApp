package Vehicle;

public class Bike extends BaseFunctionality implements BikeInterface {
    private int vehicleNo;
    private int bikeRent=100;
    public int getBikeRent() {
        return bikeRent;
    }
    public void setBikeRent(int rent) {
        this.bikeRent = rent;
    }
    public int  book(int days){
        this.bikeRent=this.bikeRent*days;
       return this.bikeRent;
    }
    public void cancel(){
        System.out.println("Bike can be return");
    }
    public void helmetIncluded(){
        System.out.println("Helmet Included");
    }
}
