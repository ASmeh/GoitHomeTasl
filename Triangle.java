public class Triangle extends Shape{

    public Triangle(){
        lines = new Line[3];
    }
    @Override
    public void printFigureName() {
        System.out.println("Triangle");
    }

    @Override
    public void draw() {
        System.out.println("draw Triangle");
    }
}
