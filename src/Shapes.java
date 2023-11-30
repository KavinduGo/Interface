public interface Shapes {
    abstract void getArea ();
    default void getSides() {
        System.out.println("Sides of this Shape");
    }

}
class Rectangle implements Shapes {
    @Override
    public void getArea() {
        int length = 10,width = 15,area=length * width ;
        System.out.println("Area of Rectangle "+area);

    }

    @Override
    public void getSides() {
        System.out.println("I Have 2 Sides");
    }
}
class Square implements Shapes {
    @Override
    public void getArea() {
        int length = 20,area = length * length;
        System.out.println("Area of Square "+area);
    }
}
class Test1 {
    public static void main(String[] args) {
        Shapes s;
        s = new Rectangle();
        s.getArea();s.getSides();
        s = new Square();
        s.getArea();
    }
}