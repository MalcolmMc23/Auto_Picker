import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        // Robot robot = new Robot();
        // int x = 100;
        // int y = 30;
        // int button = InputEvent.BUTTON1_DOWN_MASK;
        // robot.mouseMove(x, y);
        // robot.mousePress(button);
        // Thread.sleep(400);
        // robot.mouseRelease(button);

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        frame.setVisible(true);

    }
}
