package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3d = new Point3D(10,20,30);
		
		
		
		
		
	}
}

class Point2{
	
	int x;
	int y;
	
	Point2(int x, int y){
		this.x =x;
		this.x =y;
		
	}
}

class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x,y);
		super.x = 100;// this.x라고 해도 됨 없으니까 부모것으로 찾아감
		super.y = 200; //this.y라고 해도 됨 없으니까 부모것으로 찾아감
		this.z = z;
	}
	
}

