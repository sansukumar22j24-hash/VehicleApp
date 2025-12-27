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
        int store = this.getBikeRent()* days;
       return store;
    }
    public  int book(int days,int hours){
        int stores=getBikeRent()/24;
        int store = this.getBikeRent()* (days+stores);
        return store;
    }
    public void cancel(){
        System.out.println("Bike can be return");
    }
    public void helmetIncluded(){
        System.out.println("Helmet Included");
    }
}
