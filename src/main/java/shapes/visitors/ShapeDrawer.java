package shapes.visitors;

import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

public class ShapeDrawer implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a circle:");
        circle.draw();
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Drawing a triangle:");
        triangle.draw();
    }

    @Override
    public void visit(Square square) {
        System.out.println("Drawing a square:");
        square.draw();
    }
}
