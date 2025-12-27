package Vehicle;

public interface CarInterface {
    public int getCarRent();
    public void setCarRent(int rent);
    public  int book(int days);
    public  int book(int days,int hours);
    public void cancel();
    public void driverIncluded();

}
