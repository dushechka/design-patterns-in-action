package shapes;

import shapes.visitors.ShapeVisitor;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("This is a circle.");
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
