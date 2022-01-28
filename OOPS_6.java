import java.util.*;

class Account{

private static int numAccounts;

int min=10000,max=99999;

double Bal;

String owner;

long number;

double fee;

double amount;

public Account(double initBal,String owner,long number) {

this.Bal=initBal;

this.owner=owner;

this.number=(int)(Math.random()*(max-min+1)+min);

numAccounts++;

}

public Account(double initBal,String owner) {

this.Bal=initBal;

this.owner=owner;

this.number=(int)(Math.random()*(max-min+1)+min);

numAccounts++;

}

public Account(String owner) {

this.owner=owner;

numAccounts++;

}

public void deposit(double amount) {

this.Bal+=amount;

System.out.println("Amount deposited is: "+amount);

System.out.println("Current balance is: "+Bal);

}

public void withdraw(double amount) {

this.Bal-=amount;

System.out.println("Amount withdrawn is: "+amount);

System.out.println("Current balance is: "+Bal);

}

public void withdraw(double amount,double fee) {

this.Bal-=(amount+fee);

System.out.println("Amount withdrawn: "+amount);

System.out.println("Transaction fee: "+fee);

System.out.println("Balance is : "+Bal);

}

double getBalance() {

return Bal;

}

long number() {

return number;

}

long getAccount() {

return number;

}

public String toString() {

System.out.println("Owner: "+owner);

return"\n Account number"+number+"\n Owner: "+owner+"Balance: "+Bal;

}

public static int getnumAccounts(){

return numAccounts;

}

public void close() {

owner=owner+" CLOSED";

Bal=0;

numAccounts--;

}

public static void Account_consolidate(Account acct1,Account acct2) {

if(acct1.owner.equals(acct2.owner)&&acct1.getAccount()!=acct2.getAccount()) {

double Balance=acct1.Bal+acct2.Bal;

Account obj4=new Account(Balance,acct1.owner);

acct1.close();

acct2.close();

return;

}

else {

System.out.print("Invalid Arguments");

}

}

}

public class main {

public static void main(String []args) {

System.out.println("Testing :");

Account test1=new Account(100,"Kasyap");

test1.deposit(2000.90);

test1.withdraw(1786.00);

test1.withdraw(134.09,8.09);

test1.getAccount();

test1.getBalance();

test1.toString();

test1.close();

System.out.println(" ");

Account test2=new Account(100,"kasyap");

test1.getBalance();

test1.toString();

System.out.println(" ");

System.out.println("Before consolidation: ");

Account obj1=new Account(10.00,"Rem",21910);

System.out.println("Account constructor1: ");

obj1.deposit(2000.90);

obj1.withdraw(1786.00);

obj1.withdraw(134.09,8.09);

obj1.getAccount();

obj1.getBalance();

obj1.toString();

System.out.println(" ");

Account obj2=new Account(10.00,"Den");

System.out.println("Account constructor2: ");

obj2.deposit(2000.90);

//obj2.withdraw(1786.00);

//obj2.withdraw(134.09,8.09);

obj2.getAccount();

obj2.getBalance();

obj2.toString();

System.out.println(" ");

Account obj3=new Account("Chad");

System.out.println("Account constructor3: ");

//obj3.deposit(2000.90);

//obj3.withdraw(1786.00);

//obj3.withdraw(134.09,8.09);

obj3.getBalance();

obj3.getAccount();

obj3.toString();

System.out.println("Number of accounts BEFORE: "+Account.getnumAccounts());

//---> 1 test account+3 actual accounts = 4 accounts(total)

System.out.println(" ");

System.out.println("After Consolidation: ");

Account obj4=new Account(10.00,"Rem",21910);

System.out.println("Account constructor1: ");

obj4.deposit(2000.90);

obj4.withdraw(1786.00);

obj4.withdraw(134.09,8.09);

obj4.getAccount();

obj4.getBalance();

obj4.close();

obj4.toString();

System.out.println(" ");

Account obj5=new Account(10.00,"Den");

System.out.println("Account constructor2: ");

obj5.deposit(2000.90);

//obj2.withdraw(1786.00);

//obj2.withdraw(134.09,8.09);

obj5.getAccount();

obj5.getBalance();

obj5.toString();

System.out.println(" ");

Account obj6=new Account("Chad");

System.out.println("Account constructor3: ");

//obj3.deposit(2000.90);

//obj3.withdraw(1786.00);

//obj3.withdraw(134.09,8.09);

obj6.getBalance();

obj6.getAccount();

obj6.toString();

System.out.println("Number of accounts AFTER: "+Account.getnumAccounts());

//---->test account-1

//---->regular accounts-6

//---->one account deleted

//total accounts=6

}

}