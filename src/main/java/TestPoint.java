/**
 * @program: JavaBase
 * @Date: 2020/8/16 13:41
 * @Author: lin.yang
 * @Description:
 */
public class TestPoint {
	public static void main (String args[]) {
		Point p1 = new Point(1,2,3);
		Point p2 = new Point(0,0,0);
		System.out.println(p1.getDistance(p2));
	}

}

class Point  {
	double  x,  y,  z;
	public Point(double _x, double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;
	}

	public void setX (double _x) {
		x = _x;
	}

	public void setY (double _y) {
		y = _y;
	}

	public void setZ (double _z) {
		z = _z;
	}

	double getDistance(Point p) {
		return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
	}
}
