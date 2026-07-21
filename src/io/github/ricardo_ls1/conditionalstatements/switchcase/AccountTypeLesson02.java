package io.github.ricardo_ls1.conditionalstatements.switchcase;

/*
As a manager, I would like users to enter the account type and have the system display the interest rate offered by that account, in order to provide faster access to the information.

The account types are:

SAVINGS_ACCOUNT: 0.05%
CHECKING_ACCOUNT: 0.02%
INVESTMENT_ACCOUNT: 0.1%
 */

public class AccountTypeLesson02 {
    static void main(String[] args) {
        String accountType = "x";

        switch (accountType) {
            case "SAVINGS_ACCOUNT":
                System.out.println("The interest rate is 0.05%");
                break;
            case "CHECKING_ACCOUNT":
                System.out.println("The interest rate is 0.02%");
                break;
            case "INVESTMENT_ACCOUNT":
                System.out.println("The interest rate is 0.1%");
                break;
            default:
                System.out.println("Please choose one of the following types:\nSAVINGS_ACCOUNT\nCHECKING_ACCOUNT\nINVESTMENT_ACCOUNT");
        }
    }
}
