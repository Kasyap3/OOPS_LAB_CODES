/*Get a rational number in form a/b and reduces it to its smallest rational form

*I.e 500/1000 when given as input give output 1/2

*/

/*This is the Rational class with 4 variables

* numerator a, denominator b

* a variable to compare a and b i.e., c

* and flag to dentote +ve or -ve

*/

//importing the required dependencies

import java.util.*;

//for taking the input from the user

import java.lang.Math;

//for the math module

class Rational{

int flag,c;

void display() {

Scanner sc=new Scanner(System.in);

System.out.print("Enter the numerator: ");

int a=sc.nextInt();

//input of the numerator -->a

System.out.print("Enter the deenominator: ");

//input for the denominator -->b

int b=sc.nextInt();

//setting the flags

if((a>0&&b>0)||(a<0&&b<0))

{

flag = 0;

}

if(a<0 && b>0){

flag = 1;

}

if(a>0 && b<0){

flag = 1;

}

a=Math.abs(a);

b=Math.abs(b);

if(a<b) {

c=a;

}

else {

c=b;

}

for(int i=2;i<c;i++) {

if(a%i==0&&b%i==0){

a=a/i;

b=b/i;

i=1;}

}

if(flag==1) {

System.out.println("-"+a+"/"+b);

}

if(flag==0) {

System.out.println(a+"/"+b);

}

}

}

public class Lab_1 extends Rational {

/*Below is the testing class with the main function

*using scanner we take two inputs numerator and denominator

* a = numerator and b = denominator

* we pass e to the constructor of newly created RationalClass object

* then we run Rationalise function of said object to display result

*/

public static void main(String[] args) {

Rational obj=new Rational();

obj.display();