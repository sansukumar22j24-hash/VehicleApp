package Vehicle;

public class Main {

    public static void main(String[] args) {

        //1. created the objects for respective class and give
        //   the reference variables and methods inside it
        //for Bike-vehicleNo,bikeRent=100 and their methods and extra methods.
        //2. create the customer and customer2 objects.

        Customer customer = new Customer();
        Customer customer2= new Customer();


        //3. create the Bike and Car objects.
        Bike bike = new Bike();
        Car car = new Car();
        //4. setting the customer vehicle-no,type,days
        customer.setVehicleNo(1);
        customer.setVehicleType("BIKE");
        customer.setRentDays(3);
        //here created  if else for checking the conditions based on the given vehicle type it goes inside
        // if it vehicle type matches then it goes inside and get vehiclenumber, rentdays, and passing rentdays  the bike function from  customer.
        // printing the outputs excluding the helmetIncluded()
        {
            if (customer.getVehicleType() == "BIKE") {
                System.out.println("=============CUSTOMER 1: BIKE ===================");
                bike.setVehicleNo(customer.getVehicleNo());
                System.out.println("Booking Successfully");
                System.out.print("Rental Days:");
                System.out.println(customer.getRentDays());
                int bk = bike.book(customer.getRentDays());
                System.out.print("Rent:");
                System.out.println(bk);
                bike.helmetIncluded();
            }
            // else it runs with the cancel() method
            else {
                System.out.println("=============CUSTOMER 1: BIKE ===================");
                bike.setVehicleNo(customer.getVehicleNo());
                System.out.println("Booking Successfully");
                System.out.print("Rental Days:");
                System.out.println(customer.getRentDays());
                int bk = bike.book(customer.getRentDays());
                System.out.print("Rent:");
                System.out.println(bk);
                bike.cancel();
                bike.helmetIncluded();
            }

        }

        System.out.println();

        customer2.setVehicleNo(1);
        customer2.setVehicleType("CAR");
        customer2.setRentDays(5);
        {
            if (customer2.getVehicleType() == "CAR") {
                System.out.println("=============CUSTOMER 2: CAR ===================");
                car.setVehicleNo(customer2.getVehicleNo());
                System.out.println("Booking Successfully");
                System.out.print("Rental Days:");
                System.out.println(customer2.getRentDays());
                int cr = car.book(customer2.getRentDays());
                System.out.print("Rent:");
                System.out.println(cr);
                int crs = car.book(5,48);
                System.out.print("Rent:");
                System.out.println(crs);
                car.driverIncluded();
            }
            else {
                System.out.println("=============CUSTOMER 1: CAR ===================");
                car.setVehicleNo(customer2.getVehicleNo());
                System.out.println("Booking Successfully");
                System.out.print("Rental Days:");
                System.out.println(customer2.getRentDays());
                int cr = car.book(customer2.getRentDays());
                System.out.print("Rent:");
                System.out.println(cr);
                car.cancel();
                car.driverIncluded();
            }

        }

    }
}





















//
//        customer.setVehicleNo(7);
//        customer.setRent(300);
//        customer.setVehicleType("Bike");
//        customer.setRentDays(2);
//
//        Customer customer2=new Customer();
//
//        customer2.setVehicleNo(1);
//        customer2.setRent(500);
//        customer2.setVehicleType("Car");
//
//        if(customer.getVehicleType()=="Bike"){
//            System.out.println("==========CUSTOMER 1: BIKE==========");
//            System.out.println("Booking Successful");
//            System.out.print("Rent Days: ");
//
//            bike.book(customer.getRent());
//            bike.cancel(customer.getRent());
//            bike.helmetIncluded();
//        }
//
//
//        System.out.println();
//
//        if(customer2.getVehicleType()=="Car"){
//            System.out.println("==========CUSTOMER 2: CAR==========");
//            System.out.println("Booking Successful");
//            System.out.print("Rent Days: ");
//            car.book(customer2.getRent());
//            car.cancel(customer2.getRent());
//            car.driverIncluded();
//        }
//
//
//    }
//}
