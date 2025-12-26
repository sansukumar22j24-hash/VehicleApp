package Vehicle;

public class Car {
    private int vehicleNo;
    private int rent;

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
    public  void book(int days){
        this.rent=this.rent+days;
        System.out.println(this.rent);
    }
    public void cancel(int days){
        this.rent=this.rent-days;
        System.out.println(this.rent);
    }
    public void driverIncluded(){
        System.out.println("Driver Included");
    }
}
