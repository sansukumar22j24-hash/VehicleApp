package Vehicle;

public class Main {

    public static void main(String[] args){

        Customer customer= new Customer();
        Bike bike= new Bike();
        Car car = new Car();

        customer.setVehicleNo(1);
        customer.setRent(300);
        customer.setVehicleType("Bike");

        Customer customer2=new Customer();

        customer2.setVehicleNo(1);
        customer2.setRent(500);
        customer2.setVehicleType("Car");

        if(customer.getVehicleType()=="Bike"){
            System.out.println("==========CUSTOMER 1: BIKE==========");
            System.out.println("Booking Successful");
            System.out.print("Rent Days: ");
            bike.book(customer.getRent());
            bike.cancel(customer.getRent());
            bike.helmetIncluded();
        }


        System.out.println();

        if(customer2.getVehicleType()=="Car"){
            System.out.println("==========CUSTOMER 2: CAR==========");
            System.out.println("Booking Successful");
            System.out.print("Rent Days: ");
            car.book(customer2.getRent());
            car.cancel(customer2.getRent());
            car.driverIncluded();
        }


    }
}
