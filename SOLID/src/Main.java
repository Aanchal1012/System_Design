import interfaces.IPaymentProcessor;
import payment.UPIPayment;
import ride.Ride;
import ride.RideMatchingService;
import ride.RideRequest;
import user.Driver;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ride rider = new Ride("R1", "AANCHAL");
        Driver driver = new Driver("D1", "ABHI");
        RideRequest request = new RideRequest(rider, "hsr", "kormangala");
        RideMatchingService matcher = new RideMatchingService(List.of(driver));
        Driver matchDriver = matcher.matchDriver(request);
        if(matchDriver!=null){
            System.out.println("Matched driver"+matchDriver.getName());
            IPaymentProcessor processor = new UPIPayment();
            processor.proccespayment(rider, matchDriver,300.00);
        }else{
            System.out.println("Drivers busy");
        }
    }
}