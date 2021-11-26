import org.junit.jupiter.api.Test;
import shapes.*;
import shapes.visitors.ShapeDrawer;
import shapes.visitors.ShapeVisitor;

import java.util.List;

public class VisitorTest {
    @Test
    public void testVisitor() {
        List<Shape> shapes = List.of(new Circle(), new Triangle(), new Square());
        ShapeVisitor drawer = new ShapeDrawer();

        for (Shape shape : shapes) {
            shape.accept(drawer);
        }
    }
}
