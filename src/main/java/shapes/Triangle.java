package shapes;

import shapes.visitors.ShapeVisitor;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("This is a triangle.");
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
