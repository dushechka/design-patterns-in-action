package shapes;

import shapes.visitors.ShapeVisitor;

public abstract class Shape {
    public abstract void draw();
    public abstract void accept(ShapeVisitor visitor);
}
