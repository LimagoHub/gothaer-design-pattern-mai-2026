package gothaer.bank;

import gothaer.bank.visitor.BankVisitor;

public class Konto extends AbstractBankNode {

    private double balance;
    public Konto(final String label) {
        super(label);
    }

    public Konto(final String label, final double balance) {
        super(label);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {

        return super.toString() + ", balance: " + balance;
    }

    public void accept(BankVisitor visitor){
        visitor.visit(this);
    }
}
