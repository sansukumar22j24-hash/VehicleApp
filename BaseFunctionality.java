package Vehicle;

public abstract class BaseFunctionality implements BaseFunctionalityInterface {
    private int vehicleNo;
    public int getVehicleNo() {
        return vehicleNo;
    }
    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
}
