package interfaces;

public interface IPaymentProcessor {
    void proccespayment(IUser from, IUser to, double amount);
}
