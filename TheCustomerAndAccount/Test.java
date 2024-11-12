package TheCustomerAndAccount;

public class Test {
    public static void main(String[] args) {

//TestCustomer
        Customer b1 = new Customer(12,"tan ah teck",'f');
        System.out.println(b1);
        System.out.println("Id is " + b1.getId());
        System.out.println("Name is " + b1.getName());
        System.out.println("Gender is " + b1.getGender());
//TestAccount
        Account b2 = new Account(12,b1,0.6);
        System.out.println(b2);
        System.out.println("Customer's Id is " + b2.getId());
        System.out.println("Customer's Balance is " + b2.getBalance());
        System.out.println("Customer is " + b2.getCustomer());
        System.out.println("Customer's name is " + b2.getCustomerName());
        b2.setBalance(999.9967);
        System.out.println(" Customer's balance is:" +  b2.getBalance());
        b2.deposit(0.01);
        System.out.println("Customer's balance is " + b2.getBalance());
        b2.withdraw(1000.01);
        b2.withdraw(2000.01);
        System.out.println("Customer's balance is " + b2.getBalance());




    }
}
