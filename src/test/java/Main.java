class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }

}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing triangle");
    }
}

public class Main{
    public static void main(String[] args) {
        Circle wre = new Circle();
        Rectangle otxkutxedi= new Rectangle();
        Triangle samkutxedi = new Triangle();
        DrawingApp.startDrawing(otxkutxedi);
        DrawingApp.startDrawing(samkutxedi);
        DrawingApp.startDrawing(wre);



    }
}
//Task1