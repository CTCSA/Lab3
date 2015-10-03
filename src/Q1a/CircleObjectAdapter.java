package Q1a;

import java.awt.*;

/**
 *
 * @author a1
 */


public class CircleObjectAdapter implements NewCircle{
    // 
      public OldCircle oldcircle;
      public Point point;
      
  public CircleObjectAdapter(OldCircle newcircle) {
    this.oldcircle = newcircle;
  }
  
  public double[] getCoeff(){
      return oldcircle.getCoeff();
  }

  @Override
  public double getRadius(){
      return Math.sqrt(getCoeff()[2]);
  }
  @Override      
  public Point getCenter(){
      point = new Point((int)getCoeff()[0],(int)getCoeff()[1]);
      return point;
  }
  
  
}

