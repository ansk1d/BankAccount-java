public class BankAccount {
    private double checkingbalance =0;
    private double savingbalance =0;
    private double total =0;

    public double getCheckingbalance() {
        return checkingbalance;
    }
    public double getSavingbalance() {
        return savingbalance;
    }
    
    public double Deposit(double amaunt , String type) {
        if (type == "check"){
            checkingbalance+= amaunt;
            total+=amaunt;
            return checkingbalance;
        }
        else if (type == "saving"){
            savingbalance+= amaunt;
            total+=amaunt;
            return savingbalance;
        }
        else{
            return total;
        }
    }
    
    public double withdraw(double amaunt, String type) {
        if (type == "check"){
            if (amaunt<checkingbalance){
                checkingbalance-= amaunt;
                total-=amaunt;
            }
            else{
                System.out.println("You don't have enough Moany");
            }
            return checkingbalance;
        }
        else if (type == "saving"){
            if (amaunt<savingbalance){
                savingbalance-= amaunt;
                total-=amaunt;
            }
            else{
                System.out.println("You don't have enough Moany");
            }
            return savingbalance;
        }
        else{
            return total;
        }
    }

    public double totalmonay() {
        return total;
    }
}