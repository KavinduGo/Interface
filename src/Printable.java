public interface Printable {
    abstract void print();
}
interface Showable {
    abstract void show();
}
class Human implements Printable,Showable {
    int name;
    int age;

    @Override
    public void print() {
        System.out.println( name + age);
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.print();h.show();
        h.age = 10;
        h.name = 20;

    }
}
