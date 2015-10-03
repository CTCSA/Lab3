/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q1b;
import java.awt.Point;
/**
 *
 * @author a1
 */
public class CircleClassAdapter extends OldCircleImpl implements NewCircle{
    private Point point;
    
    public CircleClassAdapter(double a,double b,double c){
        super(a,b,c);
    }
    
  public double getRadius(){
      return Math.sqrt(getCoeff()[2]);
  }
   
  public Point getCenter(){
      point = new Point((int)getCoeff()[0],(int)getCoeff()[1]);
      return point;
  }
    
    
    
}