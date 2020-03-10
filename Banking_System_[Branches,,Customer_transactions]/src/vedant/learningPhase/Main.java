package vedant.learningPhase;

/*
System Structure:                  [Understanding]

       Bank 1
            (*)Branch AA
                  >>Customer X
                        ---Customer X transaction 1
                        ---Customer X transaction 2 .... n transactions
                  >>Customer Y
                        ---Customer Y transaction 1
                        ---Customer Y transaction 2 .... n transactions
                  >>... n customers
           (*)Branch BB{
                 ( same structure as AA )
                   }
                       with n Branches...

  -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
        Bank 2{
          (same structure)
          }
       n numbers of banks.

 */

public class Main {

    public static void main(String[] args) {

        //bank scotia
        Bank scotia = new Bank("Scotia");

        if (scotia.addBranch("Etobicoke")){
            System.out.println("Branch at Etobicoke created ");
        }

        scotia.addCustomer("Etobicoke", "vedant", 100.00);
        scotia.addCustomer("Etobicoke", "dave", 200.00);
        scotia.addCustomer("Etobicoke", "ved", 300.000);

        //new branch
        if(scotia.addBranch("Toronto")){
            System.out.println("Toronto branch is created");
        }
        scotia.addCustomer("Toronto","vedant",1000.00);
        scotia.addCustomer("Toronto","dave",2000.00);

        //add transactions to existing customers
        scotia.addCustomerTransaction("Etobicoke","vedant",50.00);
        scotia.addCustomerTransaction("Toronto","vedant",500.00);
        scotia.addCustomerTransaction("Etobicoke","dave",150.00);
        scotia.addCustomerTransaction("Etobicoke","ved",250.00);
        scotia.addCustomerTransaction("Toronto","dave",50.00);
        scotia.addCustomerTransaction("Etobicoke","dave",15.00);

        // make query checking -- cross checking for code
        if(!scotia.addCustomerTransaction("Toronto","ved",50.01)){          // we haven't account ...so
            System.out.println("Customer account does not exist");
        }

        if(!scotia.addCustomer("Brampton","vedant",20.01)){               // we haven't branch
            System.out.println("Branch does not exist");
        }

        if(!scotia.addBranch("Toronto")) {                                          // remove duplicacy issue;
            System.out.println("Branch already exist");
        }

        scotia.listOfCustomer("Toronto",false);
        System.out.println("+++++++");

        scotia.listOfCustomer("Etobicoke",true);
    }
}
