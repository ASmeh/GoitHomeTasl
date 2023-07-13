public class Main {
    public static void main(String[] args) {
        PrintFigure pf = new PrintFigure();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape quad = new Quad();
        Shape square = new Square();
        Shape rhombus = new Rhombus();
        pf.printFigureName(circle);
        pf.printFigureName(triangle);
        pf.printFigureName(quad);
        pf.printFigureName(square);
        pf.printFigureName(rhombus);
    }
}