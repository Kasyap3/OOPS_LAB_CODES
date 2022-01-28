package Extra_credit_OOPs;
import java.util.*;
public class Collisions {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int times = 0;
        RandomWalk particle1 = new RandomWalk(100000, 2000000, -3, 0);
        RandomWalk particle2 = new RandomWalk(100000, 2000000, 3, 0);
        for (int i = 1; i <= 100000; i++) {
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1,particle2)) {
                times++;
            }
        }
        System.out.println("the number of times the two particles collide is: "
                + times);
    }

    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        return (p1.getX() == p2.getX() && p1.getY() == p2.getY()) ? true
                : false;
    }

}






package Extra_credit_OOPs;

import java.util.Scanner;

public class DrunkenWalk {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      int maxSteps; // maximum number of steps in a walk
      int maxCoord; // the maximum x and y coordinate
      int numDrunks;
      int numfall = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("\nDrunks Walk  Program");
      System.out.println();
      System.out.print("Enter the boundary for the square: ");
      maxCoord = scan.nextInt();
      System.out.print("Enter the maximum number of steps: ");
      maxSteps = scan.nextInt();
      System.out.print("Enter the number of drunks: ");
      numDrunks = scan.nextInt();
      
      for(int i=1;i <= numDrunks;i++){
          RandomWalk drunk = new RandomWalk(maxSteps,maxCoord);
          drunk.walk();
          System.out.println(drunk);
          if(!drunk.inBounds()){
              numfall++;
          }
      }
      System.out.println("The times of the drunk falling off is " + numfall);
    }

}






package Extra_credit_OOPs;

import java.util.Random;

public class RandomWalk {
    private int xcd;
    private int ycd;
    private int maxsteps;
    private int numsteps;
    private int edge;
    private int maxDistance;

    public RandomWalk(int max, int e) {
        maxsteps = max;
        edge = e;
        xcd = 0;
        ycd = 0;
        numsteps = 0;
        maxDistance = 0;
    }

    public RandomWalk(int max, int e, int startX, int startY) {
        maxsteps = max;
        edge = e;
        xcd = startX;
        ycd = startY;
        numsteps = 0;
        maxDistance = 0;
    }

    public int getX() {
        return xcd;
    }

    public int getY() {
        return ycd;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public String toString() {
        return "steps: " + numsteps + "; Position: (" + xcd + "," + ycd + ")";
    }

    public void takeStep() {
        int step;
        Random walk = new Random();
        step = walk.nextInt(4);
        switch (step) {
        case 0:
            xcd++;
            maxDistance = max(maxDistance, xcd);
            numsteps++;
            break;
        case 1:
            ycd++;
            maxDistance = max(maxDistance, ycd);
            numsteps++;
            break;
        case 2:
            xcd--;
            maxDistance = max(maxDistance, xcd);
            numsteps++;
            break;
        case 3:
            ycd--;
            maxDistance = max(maxDistance, ycd);
            numsteps++;
            break;
        }
    }

    public boolean moreSteps() {
        return (numsteps < maxsteps) ? true : false;
    }

    public boolean inBounds() {
        return (xcd <= edge && xcd >= edge * (-1) && ycd <= edge && ycd >= edge
                * (-1)) ? true : false;
    }

    public void walk() {
        while (this.moreSteps() && this.inBounds()) {
            this.takeStep();
        }
    }

    private int max(int num1, int num2) {
        return Math.abs((Math.abs(num1) >= Math.abs(num2)) ? num1 : num2);
    }

}







package Extra_credit_OOPs;

import java.util.Scanner;

public class TestWalk {
    public static void main(String[] args) {
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int x, y; // starting x and y coordinates for a walk
        Scanner scan = new Scanner(System.in);
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the starting x and y coordinates with "
                + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        RandomWalk rw1 = new RandomWalk(10,5);
        RandomWalk rw2 = new RandomWalk(maxSteps,maxCoord,x,y);
        
        for(int i=1;i <=5; i++){
            rw1.takeStep();
            rw2.takeStep();
            System.out.println(rw1);
            System.out.println(rw2);
        }
        
        System.out.println(rw1.getMaxDistance());
        System.out.println(rw2.getMaxDistance());
        
      RandomWalk rw3 = new RandomWalk(200,10);
       rw3.walk();
     System.out.println(rw3);
        
        
    }
}
