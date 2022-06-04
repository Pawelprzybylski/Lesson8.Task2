public class Square extends Shape {

private  int a;

    Square(int a) {
        this.a = a;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public  double getArea() {
        return Math.pow(a,2);
    }


    @Override
    public double getPerimeter() {
        return 4*a;
    }

}
