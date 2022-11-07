import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App implements AncestorListener, java.awt.event.ActionListener {

    int clicks = 0;
    // ################
    int ready_X = 400;// ! change to the x,y of ready in val
    int ready_Y = 400;

    int jett_X = 200; // ! change to the x,y of jett in val
    int jett_Y = 400;

    int fade_X = 200;// ! change to the x,y of jett in val
    int fade_Y = 400;
    // ###############

    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public App() throws AWTException {
        frame = new JFrame();
        panel = new JPanel();
        Robot robot = new Robot();
        int button = InputEvent.BUTTON1_DOWN_MASK;
        label = new JLabel("number of clicks: " + clicks);

        // * &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& start of Jett button
        JButton jettButt = new JButton(new AbstractAction("Jett") {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 50; i++) {
                    try {
                        robot.mouseMove(jett_X, jett_Y);
                        robot.mousePress(button);
                        Thread.sleep(1);
                        robot.mouseRelease(button);
                        clicks++;

                        robot.mouseMove(ready_X, ready_Y);
                        robot.mousePress(button);
                        Thread.sleep(1);
                        robot.mouseRelease(button);
                        clicks++;
                        label.setText("number of clicks: " + clicks);
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
        // * &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& end of Jett button

        // * &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& start of Fade button
        JButton fadeButt = new JButton(new AbstractAction("Fade") {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 50; i++) {
                    try {
                        robot.mouseMove(fade_X, fade_Y);
                        robot.mousePress(button);
                        Thread.sleep(1);
                        robot.mouseRelease(button);
                        clicks++;

                        robot.mouseMove(ready_X, ready_Y);
                        robot.mousePress(button);
                        Thread.sleep(1);
                        robot.mouseRelease(button);
                        clicks++;
                        label.setText("number of clicks: " + clicks);
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
        // * &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& end of Fade button

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        // panel.setLayout(new GridLayout(0, 1));

        panel.add(jettButt); // runs the jett button
        panel.add(fadeButt); // runs the fade button
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("my GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) throws AWTException {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub

    }

}
