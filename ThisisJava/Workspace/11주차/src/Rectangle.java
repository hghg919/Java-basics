class Shape1{
	protected int x,y;
	void print() {
		System.out.println(x+", "+y);
	}
}

public class Rectangle extends Shape1 {
    int width, height;

    public Rectangle(int x, int y, int width, int height) {
    	this.x=x;
    	this.y=y;
    	this.width=width;
    	this.height=height;
    }

    double calcArea() {
    	return width*height;
    }
    
    void draw() {
    	System.out.println(x+","+y+","+width+","+height);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r= new Rectangle(10,20,30,40);
		r.draw();
		System.out.println(r.calcArea());
		r.print();
	}
}

