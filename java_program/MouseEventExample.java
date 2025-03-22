import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame {
    private String event = "No Event";

    MouseEventExample() {
        setTitle("Mouse Event ");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new Font("Arial", Font.BOLD, 20));
                g.drawString(event, 80, 100);
            }
        };

        panel.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                event = "Mouse Clicked";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                event = "Mouse Entered";
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                event = "Mouse Exited";
                repaint();
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
