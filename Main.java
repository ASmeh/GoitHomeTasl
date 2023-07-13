public class Main {
    public static void main(String[] args) {
        PrintFigure pf = new PrintFigure();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape quad = new Quad();
        Shape square = new Square();
        Shape rhombus = new Rhombus();
        pf.printFigure(circle);
        pf.printFigure(triangle);
        pf.printFigure(quad);
        pf.printFigure(square);
        pf.printFigure(rhombus);

    }
}