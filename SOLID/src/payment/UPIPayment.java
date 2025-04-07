package payment;

import interfaces.IPaymentProcessor;
import interfaces.IUser;

public class UPIPayment implements IPaymentProcessor {
    @Override
    public void proccespayment(IUser from, IUser to, double amount) {
        System.out.println("Proccessing UPI Payment of Rs: "+amount+" from "+from.getName()+" to "+to.getName());
    }
}
