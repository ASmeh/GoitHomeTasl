public class Circle extends Shape{

    public Circle(){
        lines = new Line[0];
    }
    @Override
    public void printFigureName(){
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}
