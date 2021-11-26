package shapes.visitors;

import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

public interface ShapeVisitor {
    public void visit(Circle circle);
    public void visit(Square square);
    public void visit(Triangle triangle);
}
