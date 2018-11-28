package F_OOP2;

import java.awt.Color; //도형그리기~
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame {
	public static void main(String[] args) {
		// DrawShape ds = new DrawShape();
		DrawShape ds = new DrawShape("아이고");
		// ds.paint(new Graphics());

	}

	public void paint(Graphics g) {
		// 1. 원 객체를 만드세요 (매개변수 두개짜리 생성자를 이용해주세요)
		// (매개변수 두개짜리 생성자를 이용해주세요)
		// 150,150, 50

		Point p1 = new Point(150, 150);
		Circle c = new Circle(p1, 50);

		// 2.원을 그려주세요
		// g,drawOval(int,int,int,int)
		g.drawOval(p1.x, p1.y, c.r * 2, c.r * 2); // 타원을 만들어주는 메서드 원을 만들려고함 x,y는
													// 좌표 width, height는 같은값으로

		// 3.삼각형 객체를 만드세요
		// 매개변수 하나짜리 생성자를 이용해주세요
		// 100,100 200,200 200,100점은 이렇게 세개
		Point p2 = new Point(100, 100);
		Point p3 = new Point(200, 200);
		Point p4 = new Point(200, 100);
		Point[] pp = new Point[3];
		pp[0] = p2;
		pp[1] = p3;
		pp[2] = p4;
		Triangle t1 = new Triangle(pp);
		// 4.삼각형을 그려주세요
		// g.drawLine(int,int,int,int) <== 3번써서 만들어줌
		g.drawLine(t1.p[0].x, t1.p[0].y, t1.p[1].x, t1.p[1].y);
		g.drawLine(t1.p[1].x, t1.p[1].y, t1.p[2].x, t1.p[2].y);
		g.drawLine(t1.p[2].x, t1.p[2].y, t1.p[0].x, t1.p[0].y);
	}

	// 메인에서 사용자가 타이틀을 입력하면 타이틀이 나오게
	DrawShape() {
		setTitle("그냥 만들었어");
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.blue);
		setResizable(false);

	}

	DrawShape(String title) {
		setTitle(title);
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.cyan);
		setResizable(false);

	}

}

class Point {

	int x;
	int y;

	// 매개변수 두개짜리 생성자 만들기
	Point(int x, int y) {
		this.x = x;
		this.y = y; // 지역변수와 인스턴스 변수를 구별하는 방법 : this
	}

}

class Circle {
	// 1.점 하나를 저장할 수 있는 변수 center를 선언하세요
	Point center; // Circle이라는 class안에 클래스안에 포인트라는 클래스가 들어가있으므로 포함관계!

	// 2.반지름(정수)을 저장할 수 있는 변수 r을 선언하세요
	int r;

	// 3.매개변수가 두개인 생성자를 만드세요
	// 단 매개변수 두개로 center와 r을 초기화해주세요
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	// 4.기본생성자를 만들어주세요
	// 단, 매개변수가 두개인 생성자를 이용하여 점은 50,50 으로, 반지름은 100으로 만들어주세요
	Circle() {
		this(new Point(50,50), 100);
	}
}

class Triangle {
	// 1.점 세 개를 저장할 수 있는 변수 p를 선언하세요
	Point[] p; //점 세개, 점 하나당 2개의 변수 주소 세개가 들어가는 배열

	// 2.매개변수가 하나인 생성자를 만드세요
	// 단 매개변수의 값으로 p를 초기화해주세요
	Triangle(Point[] p) {
		this.p = p;
	}

	// 3.매개변수가 세개인 생성자를 만드세요
	// 단, 매개변수 세개로 p를 초기화해주세요
	Triangle(Point x, Point y, Point z) {
		this.p = new Point[3];
		p[0] = x;
		p[1] = y;
		p[2] = z;
	}

}
