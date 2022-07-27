public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount member1 = new BankAccount();
        member1.Deposit(3,"saving");
        System.out.println(member1.totalmonay());
        member1.withdraw(10,"saving");
        System.out.println(member1.getSavingbalance());
    }
}
