package Vehicle;

public interface BikeInterface {
    public int getBikeRent();
    public void setBikeRent(int rent);
    public int  book(int days);
    public  int book(int days,int hours);
    public void cancel();
    public void helmetIncluded();
}
