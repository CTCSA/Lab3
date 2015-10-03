/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q1b;

/**
 *
 * @author a1
 */

public class PrintCircle {
	public static void printCircle(NewCircle newCircle) {
		System.out.println(" r = " + newCircle.getRadius( ));
		System.out.println("center = [" + newCircle.getCenter( ).getX() 
+ " , "  + newCircle.getCenter( ).getY() + "]");
	}

      public static void main(String[] args) {
            NewCircle adapter = new CircleClassAdapter(10.0,15.0,25.5);
            PrintCircle printcircle = new PrintCircle();
     printcircle.printCircle(adapter);
  }
}

