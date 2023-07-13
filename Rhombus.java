public class Rhombus extends Shape{
    public Rhombus(){
        lines = new Line[4];
    }
    @Override
    public void printFigureName() {
        System.out.println("Rhombus");
    }

    @Override
    public void draw() {
        System.out.println("draw Rhombus");
    }
}
