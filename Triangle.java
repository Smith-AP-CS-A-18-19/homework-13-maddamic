import java.awt.geom.Rectangle2D;

public class Triangle implements SmithShape {

/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */

 private int x, y, width, height;
 private double angle;

/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
public Triangle(int xx, int yy, int widthh, int heightt, double anglee) {
  x = xx;
  y = yy;
  width = widthh;
  height = heightt;
  angle = anglee;
}

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */
 public double getAngle() {
   return angle;
 }

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

 public Rectangle2D toSquare() {
   double side = Math.sqrt(getArea());
   Rectangle2D rect = new Rectangle2D.Double(getX(), getY(), side, side);
   return rect;
 }

/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
 @Override
 public String toString() {
   String string = "Width: " + width + "\nHeight: " + height + "\nAngle: " + angle;
   return string;
 }

 public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public double getArea() {
    return 0.5 * width * height;

}

}
