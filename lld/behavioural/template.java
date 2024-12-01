
public abstract class PaymentFlow {

    public abstract void Validate();
    public abstract void debited();
    public abstract void calculatedFees();
    public abstract void credited();

    // this is the templated method  which is final so that it cannot be overridden
    public final void sendMoney() {
        // Step 1
        Validate();
        // Step 2
        debited();
        // Step 3
        calculatedFees();
        // Step 4
        credited();
    }  
} 


public class PayToFriend implements PaymentFlow {
    
        @Override
        public void Validate() {
            System.out.println("Validating the user");
        }
    
        @Override
        public void debited() {
            System.out.println("Debiting the amount from the user account");
        }
    
        @Override
        public void calculatedFees() {
            System.out.println("0 fees for friend transfer");
        }
    
        @Override
        public void credited() {
            System.out.println("Crediting the amount to the friend account");
        }
}

public class PayToMerchant implements PaymentFlow {
    
        @Override
        public void Validate() {
            System.out.println("Validating the user");
        }
    
        @Override
        public void debited() {
            System.out.println("Debiting the amount from the user account");
        }
    
        @Override
        public void calculatedFees() {
            System.out.println("0.5% fees for merchant transfer");
        }
    
        @Override
        public void credited() {
            System.out.println("Crediting the amount to the merchant account");
        }
}