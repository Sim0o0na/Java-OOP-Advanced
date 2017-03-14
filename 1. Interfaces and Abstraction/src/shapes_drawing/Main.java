package shapes_drawing;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rect = new Rectangle(4, 5);
        rect.draw();
        circle.draw();
    }
}
