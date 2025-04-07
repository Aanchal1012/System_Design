package payment;

import interfaces.IPaymentProcessor;
import interfaces.IUser;

public class CardPayment implements IPaymentProcessor {
    @Override
    public void proccespayment(IUser from, IUser to, double amount) {
        System.out.println("Proccessing Card Payment of Rs: "+amount+" from "+from.getName()+" to "+to.getName());
    }
}
