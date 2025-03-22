import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JFrame implements ActionListener {
    private JRadioButton redBtn, yellowBtn, greenBtn;
    private Color red = Color.GRAY, yellow = Color.GRAY, green = Color.GRAY;

    TrafficLight() {
        setTitle("Traffic Light");
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        redBtn = new JRadioButton("Red");
        yellowBtn = new JRadioButton("Yellow");
        greenBtn = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redBtn);
        group.add(yellowBtn);
        group.add(greenBtn);

        redBtn.addActionListener(this);
        yellowBtn.addActionListener(this);
        greenBtn.addActionListener(this);

        add(redBtn);
        add(yellowBtn);
        add(greenBtn);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(90, 60, 70, 180);
        g.setColor(red);
        g.fillOval(110, 70, 30, 30);
        g.setColor(yellow);
        g.fillOval(110, 120, 30, 30);
        g.setColor(green);
        g.fillOval(110, 170, 30, 30);
    }

    public void actionPerformed(ActionEvent e) {
        red = yellow = green = Color.GRAY;
        if (redBtn.isSelected()) red = Color.RED;
        if (yellowBtn.isSelected()) yellow = Color.YELLOW;
        if (greenBtn.isSelected()) green = Color.GREEN;
        repaint();
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
