package solid;

public class BankService {

    public long deposit(long amount, long accountNo) {
        return 0;
    }

    public long withdraw(long amount, long accountNo) {
        return 0;
    }

    public void printPassbook() {
        // update transaction info in passbook
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeloan")) {
            // do some job
        } else if (loanType.equals("personalloan")) {
            // do some job
        } else if (loanType.equals("car")) {
            // do some job
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email logic
        }

    }


}
