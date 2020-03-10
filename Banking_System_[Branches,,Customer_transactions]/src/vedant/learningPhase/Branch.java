package vedant.learningPhase;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;


    // constructor                                 ... arrayList have such unique constructor format
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    //getter
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //method
    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i<customers.size(); i++){                          // Error : i< (improvised) instead of i<= (previous)
            if(this.customers.get(i).getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }


}
