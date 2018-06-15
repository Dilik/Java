import java.util.*;
import java.io.*;

public class testAccount{

    public static void main(String[] args){
	bankAccount MDsAccount = new bankAccount(981276345, 2000);
	MDsAccount.makeDeposit(400);
	MDsAccount.makeWithdraw(100);
	MDsAccount.deductFee();
	MDsAccount.print();
	MDsAccount.accountPolicy();
	
    }
}
