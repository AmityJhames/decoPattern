package decoPattern;

public class UpSave implements BankAccountDecorator{

    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return this.bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public String showInfo() {
        return this.bankAccount.showInfo();
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {

    }
}