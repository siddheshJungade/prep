public interface StockObservable {
    public void add(StockObserver observer);
    public void remove(StockObserver observer);
    public void notifySubscribers();
    public void setStockCount(double count);
    public double getStockCount();
}


// Implementing the StockObservable interface in IphoneImpl class
public class IphoneObservableImp implements StockObservable {
    
    private List<NotifyStockObserver> observers = new ArrayList<>();

    private double count;
    @Override
    public void add(StockObserver observer) {
        // Add the observer to the list
        this.observers.add(observer);
    }

    @Override
    public void remove(StockObserver observer) {
        // Remove the observer from the list
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        // Notify all the observers
        for (NotifyStockObserver observer : this.observers) {
 $           observer.update();
        }
    }

    @Override
    public void setStockCount(double count) {
        if(0 == this.count && count > 0) {
            // Notify all the observers
            this.notifySubscribers();
        }
        // Set the stock price
        this.count = count
    
    }

    @Override
    public double getStockCount() {
        // Get the stock price
        return this.count;
    }
}
// Implementing the StockObserver interface in the StockObserverImpl class
public interface NotifyStockObserver {
    public void update();
}

public class EmailObserverImpl implements NotifyStockObserver {
    private String email;
    StockObservable stockObservable;
    public EmailObserverImpl(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        // Send an email to the user
        sendEmail();
    }

    private void sendEmail() {
        // Send an email to the user
    }
}

public class SMSObserverImpl implements NotifyStockObserver {
    private String phoneNumber;
    StockObservable stockObservable;
    public SMSObserverImpl(String phoneNumber, StockObservable stockObservable) {
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        // Send an SMS to the user
        sendSMS();
    }

    private void sendSMS() {
        // Send an SMS to the user
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an observable object
        StockObservable iphoneObservable = new IphoneObservableImp();
        // Create observers
        NotifyStockObserver emailObserver = new EmailObserverImpl("test@gmali.com", iphoneObservable);
        NotifyStockObserver smsObserver = new SMSObserverImpl("1234567890", iphoneObservable);
        iphoneObservable.add(emailObserver);
        iphoneObservable.add(smsObserver);
        iphoneObservable.setStockCount(100);
    }
}