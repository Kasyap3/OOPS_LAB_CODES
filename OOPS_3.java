import java.util.*; abstract class Vehicle{

Scanner input = new Scanner(System.in); String name;

String owner; String type; String number;

String engineCapacity; String seatingCapacity; abstract void Display(); void Input(){

int temp;

System.out.print("Enter name of vehicle: "); this.name = input.nextLine(); System.out.print("Enter owner of vehicle: "); this.owner = input.nextLine(); System.out.print("Enter type of vehicle: "); this.type = input.nextLine(); System.out.print("Enter number of vehicle: "); this.number = input.nextLine();

System.out.print("Enter Engine Capacity of vehicle: "); this.engineCapacity = input.nextLine();

System.out.print("Enter Seating Capacity of vehicle: "); this.seatingCapacity = input.nextLine();

}}

class Air extends Vehicle{ void Display(){

System.out.println("Name of Vehicle: " + name); System.out.println("Owner of Vehicle: "+ owner); System.out.println("Type of Vehicle: "+ type); System.out.println("Number of Vehicle: "+ number); System.out.println("Engine Capacity of Vehicle: "+ engineCapacity); System.out.println("Seating Capacity of Vehicle: "+ seatingCapacity);

}

}

class Water extends Vehicle{ void Display(){

System.out.println("Name of Vehicle: " + name); System.out.println("Owner of Vehicle: "+ owner); System.out.println("Type of Vehicle: "+ type); System.out.println("Number of Vehicle: "+ number); System.out.println("Engine Capacity of Vehicle: "+ engineCapacity); System.out.println("Seating Capacity of Vehicle: "+ seatingCapacity);

}

}

class Land extends Vehicle{ String wheelCapacity;

void Display(){

System.out.println("Name of Vehicle: "+ name);

System.out.println("Owner of Vehicle: "+ owner); System.out.println("Type of Vehicle: "+ type); System.out.println("Number of Vehicle: "+ number); System.out.println("Engine Capacity of Vehicle: "+ engineCapacity); System.out.println("Seating Capacity of Vehicle: "+ seatingCapacity); System.out.println("Wheel Capacity of Vehicle: "+ wheelCapacity);

}

void Input(){ super.Input();

System.out.print("Enter wheel Capacity of vehicle: "); this.wheelCapacity = input.nextLine();

}

}

public class main{

public static void main(String[] args){ Scanner in = new Scanner(System.in); Vehicle v;

int n;

boolean cond = true; boolean situ = true; while(cond){

System.out.print("\nEnter Vehicle choice: \n 1. Air \n 2.Water \n 3.Land \nEnter your choice: ");

n = in.nextInt(); switch(n){

case 1:

v = new Air(); while(situ){

System.out.print("\nWhat would you like to do: \n 1. Input Data \n 2.Display Data \n 3.Exit options \nEnter your choice: ");

n = in.nextInt(); switch(n){

case 1:

v.Input(); break; case 2:

v.Display(); break;

case 3:

situ = false; default:

System.out.println("wrong input try again!!");

}}

break; case 2:

v = new Water(); while(situ){

System.out.print("\nWhat would you like to do: \n 1. Input Data \n 2.Display Data \n 3.Exit options \nEnter your choice: ");

n = in.nextInt(); switch(n){

case 1: v.Input(); break; case 2:

v.Display();

break; case 3:

situ = false; default:

System.out.println("wrong input try again!!");

}}

break; case 3:

v = new Land(); while(situ){

System.out.print("\nWhat would you like to do: \n 1. Input Data \n 2.Display Data \n 3.Exit options \nEnter your choice: ");

n = in.nextInt(); switch(n){

case 1:

v.Input(); break; case 2:

v.Display(); break;

case 3:

situ = false; default:

System.out.println("wrong input try again!!");

}}

break; default:

System.out.println("wrong choice!!");

}

System.out.print("\n Would You Like To Continue?? \nEnter Yor choice: \n 1. yes \n 2.no \nEnter your choice: ");

n = in.nextInt(); switch(n){

case 1:

cond = true; break;

case 2:

cond = false; break; default:

System.out.println("Wrong input exiting by default."); cond = false;

}

}

}

}