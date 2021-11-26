package shapes;

import shapes.visitors.ShapeVisitor;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("This is a square.");
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
