package Vehicle;

public class Customer extends BaseFunctionality implements CustomerInterface{

    private int rent;
    private String vehicleType;
    private int rentDays;

    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public int getRentDays() {
        return rentDays;
    }
    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }
}
