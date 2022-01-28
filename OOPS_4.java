import java.util.*;

import java.text.NumberFormat;

import java.util.Locale;

class CS_Card{

double previous_balance;

double additional_charges;

double intrest;

double min_pay;

double new_balance;

CS_Card(){

previous_balance=0;

additional_charges=0;

intrest=0;

min_pay=0;

new_balance=0;

}

CS_Card(double previous_balance,double additional_charges){

this.previous_balance=previous_balance;

this.additional_charges=additional_charges;

if(previous_balance>0) {

this.intrest=(previous_balance+additional_charges)*2/100;

}

else {

this.intrest=0;

}

this.new_balance=previous_balance+this.previous_balance+this.additional_charges;

}

void display() {

NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));

System.out.println("CS CARD International Statement");

System.out.println("===============================");

System.out.println("Previous Balance: $ "+previous_balance);

System.out.println("Additional Charges: $ "+additional_charges);

System.out.println("Intrest: $ "+intrest);

System.out.println("New Balance: $ "+new_balance);

System.out.print("Mini_paymenyt: $ "+mini_statement());

}

double mini_statement() {

if(new_balance<50) {

return new_balance;

}

else if((new_balance>=50)&&(new_balance<=300)) {

return 50.00;

}

else {

return new_balance/5;

}

}

}

public class main {

public static void main(String []args) {

Scanner sc=new Scanner(System.in);

double previous_balance;

double additional_charges;

System.out.println("Enter your PREVIOUS BALANCE: ");

previous_balance=sc.nextDouble();

System.out.println("Enter your ADDITIONAL CHARGES: ");

additional_charges=sc.nextDouble();

CS_Card obj=new CS_Card(previous_balance,additional_charges);

obj.display();

}

}