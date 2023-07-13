public class Quad extends Shape{

    public Quad(){
        lines = new Line[4];
    }
    @Override
    public void printFigureName() {
        System.out.println("Quad");
    }

    @Override
    public void draw() {
        System.out.println("draw Quad");
    }
}
