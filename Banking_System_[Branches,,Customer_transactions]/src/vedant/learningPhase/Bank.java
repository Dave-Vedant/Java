package vedant.learningPhase;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, amount);
        }
        return  false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return  false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {                         /* solve query of i< instead of i<= ,,, very important because
                                                                                  i = 0 and if code consider that in array and can not get any answer
                                                                                  then throw error
                                                                                  */

            Branch checkBranch = this.branches.get(i);
            if (checkBranch.getName().equals(branchName)) {
                return checkBranch;
            }
        }
        return null;
    }

    /*
    check branch
    ---check customer existence in branch
    ------check customer's transaction scenario
     */

    public boolean listOfCustomer(String branchName, boolean showTransactions){
            Branch branch = findBranch(branchName);
            if (branch != null) {
                System.out.println("Current Branch name is : " + branch.getName());

                ArrayList<Customer> branchCustomers = branch.getCustomers();
                for (int i = 0; i < branchCustomers.size(); i++) {                 //Error solved: i< (improvised) instead of i<= (previous)
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("Customers Name for branch are : " + branchCustomer.getName() + "[" + (i + 1) + "]");

                    if (showTransactions == true) {
                        System.out.println("Transaction Positive");
                        ArrayList<Double> transactions = branchCustomer.getTransactions();
                        for (int j = 0; j < transactions.size(); j++) {               //Error solved: i< (improvised) instead of i<= (previous)
                            System.out.println("Recent occurred transaction amount : " + "[" + (j + 1) + "}" + transactions.get(j));
                        }
                    }
                }
                return true;
            } else {
                return false;
            }
        }
}

