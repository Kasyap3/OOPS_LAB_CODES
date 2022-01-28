import java.util.Scanner;

import java.lang.Math;

class Date{

int year;

int month;

int date;

String day;//check if it is date or day

int hours;

int minutes;

int seconds;

/*The default constructor uses System.currentTimeMillis() method

*to get the number of milliseconds scince January first 1970, 00:00:00 GMT and uses it

*to calculate the current date and time

*th.

*/

Date(){

long millisec = System.currentTimeMillis();

long seconds_in_year = 31557600;

//scientificall one year has 365 + 1/4 days which causes a leap year

year = 1970 + (int)Math.floor(millisec/(seconds_in_year*1000));

month = 1 + (int)Math.floorDiv((millisec%(seconds_in_year*1000))/2629746,1000);

int day = (int)Math.floor(((millisec%(seconds_in_year*1000)))/86400000);

date = 1 + get_date_in_month(year,month,day);

hours = (int)Math.floor(((millisec%(seconds_in_year*1000))%86400000)/3600000);

minutes = (int)Math.floor((((millisec%(seconds_in_year*1000))%86400000)%3600000)/60000);

seconds = (int)Math.floor(((((millisec%(seconds_in_year*1000))%86400000)%3600000)%60000)/1000);

}

Date(int year, int date, int month){

this.year = year;

this.date = date;

this.month = month;

}

Date(int year, int date, int month, int hours, int minutes){

this.year = year;

this.date = date;

this.month = month;

this.hours = hours;

this.minutes = minutes;

}

Date(int year, int date, int month, int hours, int minutes, int seconds){

this.year = year;

this.date = date;

this.month = month;

this.hours = hours;

this.minutes = minutes;

this.seconds = seconds;

}

int getYear(){

return year;

}

int getMonth(){

return month;

}

int getDate(){

return date;

}

int getHours(){

return hours;

}

int getMinutes(){

return minutes;

}

int getSeconds(){

return seconds;

}

void setYear(int year){

this.year = year;

}

void setMonth(int month){

this.month = month;

}

void setDate(int date){

this.date = date;

}

void setHours(int hours){

this.hours = hours;

}

void setMinutes(int minutes){

this.minutes = minutes;

}

void setSeconds(int Seconds){

this.seconds = seconds;

}

int get_date_in_month(int year, int month, int day){

int d;

switch(month){

case 1:

d = day - 0;

break;

case 2:

d = day -31;

break;

case 3:

d = day -59;

break;

case 4:

d = day -90;

break;

case 5:

d = day -120;

break;

case 6:

d = day - 151;

break;

case 7:

d = day - 181;

break;

case 8:

d = day - 212;

break;

case 9:

d = day - 243;

break;

case 10:

d = day - 273;

break;

case 11:

d = day - 304;

break;

case 12:

d = day - 334;

break;

default:

System.out.println("Invalid argument");

d = 0;

}

if (year % 4 == 0){

return d+1;

}

else

return d;

}

boolean After(){

System.out.println(this.year);

Date currentDate = new Date();

System.out.println(currentDate.year);

if(this.year>currentDate.year){

return true;

}

else if(this.year<currentDate.year){

return false;

}

else{

if(this.month>currentDate.month){

return true;

}

else if(this.month<currentDate.month){

return false;

}

else{

if(this.date>currentDate.date){

return true;

}

else

return false;

}

}

}

//need to correct the code below

boolean Before(){

Date currentDate = new Date();

if(this.year<currentDate.year){

return true;

}

else if(this.year>currentDate.year){

return false;

}

else{

if(this.month<currentDate.month){

return true;

}

else if(this.month<currentDate.month){

return false;

}

else{

if(this.date<currentDate.date){

return true;

}

else

return false;

}

}

}

int Compare(){

Date currentDate = new Date();

if(this.year==currentDate.year && this.month == currentDate.month && this.date == currentDate.date){

return 0;

}

else{

if(this.After()){

return 1;

}

else {

return -1;

}

}

}

}

/*The following is the class with main function where we going to

* test the Date class we developed above.

*/

public class Main{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("");

Date currentDate = new Date();

System.out.println("Year: "+currentDate.getYear());

System.out.println("Month: "+currentDate.getMonth());

System.out.println("Date: "+currentDate.getDate());

System.out.println("Hours: "+currentDate.getHours());

System.out.println("Minutes: "+currentDate.getMinutes());

Date d = new Date(2022,1,12);

System.out.println("Before: "+d.Before());

System.out.println("After: "+d.Compare());

}

}