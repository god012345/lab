import java.applet.Applet;
import java.awt.Graphics;

/*
 * <applet code ="MovingText.class" width="500" height="200"></applet>
 */
public class MovingText extends Applet implements Runnable {
    String msg = "welcome to java applet";
    int x = 0;
    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                x += 10;
                if (x > getWidth()) {
                    x = 0;
                }
                repaint();
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {

        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, 100);
    }

}
