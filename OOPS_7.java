import java.util.Scanner;

public class Square {

int[][] square;

int size;

// --------------------------------------

// create new square of given size

// --------------------------------------

public Square(int size) {

square = new int[size][size];

this.size = size;

}

// --------------------------------------

// return the sum of the values in the given row

// --------------------------------------

public int sumRow(int row) {

int rowsum = 0;

for (int i = 0; i < square[row].length; i++) {

rowsum += square[row][i];

}

return rowsum;

}

// --------------------------------------

// return the sum of the values in the given column

// --------------------------------------

public int sumCol(int col) {

int csum = 0;

for (int i = 0; i < square[col].length; i++) {

csum += square[i][col];

}

return csum;

}

// --------------------------------------

// return the sum of the values in the main diagonal

// --------------------------------------

public int sumMainDiag() {

int mdsum = 0;

for (int i = 0; i < size; i++) {

mdsum += square[i][i];

}

return mdsum;

}

// --------------------------------------

// return the sum of the values in the other ("reverse") diagonal

// --------------------------------------

public int sumOtherDiag() {

int odsum = 0;

for (int i = 0; i < size; i++) {

odsum += square[i][size - 1 - i];

}

return odsum;

}

// --------------------------------------

// return true if the square is magic (all rows, cols, and diags have

// same sum), false otherwise

// --------------------------------------

public boolean magic() {

int sum;

sum = sumMainDiag();

if (this.sumOtherDiag() != sum) {

return false;

} else {

for (int i = 0; i < size; i++) {

if (sumRow(i) != sum || sumCol(i) != sum) {

return false;

}

}

return true;

}

}

// --------------------------------------

// read info into the square from the input stream associated with the

// Scanner parameter

// --------------------------------------

public void readSquare(Scanner scan) {

for (int row = 0; row < square.length; row++)

for (int col = 0; col < square.length; col++)

square[row][col] = scan.nextInt();

}

// ----------------------------------------

// print the contents of the square, neatly formatted

// ----------------------------------------

public void printSquare() {

for (int row = 0; row < square.length; row++) {

for (int col = 0; col < square.length; col++) {

System.out.print(square[row][col] + "\t");

}

System.out.println();

}

}

}

Square Test-

package mypack2;

import static java.io.File.separator;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

public class SquareTest {

public static void main(String[] args) throws IOException {

Scanner scan = new Scanner(new File("C:\\Users\\data.txt"));

int count = 1; // count which square we're on

int size = scan.nextInt(); // size of next square

while (size != -1) {

Square square = new Square(size);

// create a new Square of the given

// size

square.readSquare(scan);// call its read method to read the values

// of the square

System.out.println("\n**** Square " + count + " ****");

square.printSquare();// print the square

// print the sums of its rows

for (int row = 0; row < size; row++) {

System.out.println("The sum of row " + (row + 1) + " is "

+ square.sumRow(row));

}

// print the sums of its columns

for (int col = 0; col < size; col++) {

System.out.println("The sum of col " + (col + 1) + " is "

+ square.sumCol(col));

}

// print the sum of the main diagonal

System.out.println("The sum of main diagonal is "

+ square.sumMainDiag());

// print the sum of the other diagonal

System.out.println("The sum of the other diagonal is "

+ square.sumOtherDiag());

// determine and print whether it is a magic square

System.out.println("The square "

+ ((square.magic()) ? "is " : "is not ")

+ "a magic square.");

// get size of next square

size = scan.nextInt();

count++;

}

}

}