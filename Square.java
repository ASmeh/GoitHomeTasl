public class Square extends Shape{
    public Square(){
        lines = new Line[4];
    }
    @Override
    public void printFigureName() {
        System.out.println("Square");
    }

    @Override
    public void draw() {
        System.out.println("draw Square");
    }
}
