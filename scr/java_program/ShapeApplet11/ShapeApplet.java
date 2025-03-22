import java.applet.Applet;
import java.awt.*;

public class ShapeApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 50);
        g.setColor(Color.RED);
        g.drawOval(200, 50, 100, 50);
        g.setColor(Color.GREEN);
        g.fillOval(100, 150, 50, 50);
    }
}
