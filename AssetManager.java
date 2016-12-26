import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssetManager {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton startButton = new JButton("Continue");
        JButton nextButton = new JButton("Next");
        ActionListener startButtonListener = new StartButtonListener();
        startButton.addActionListener(startButtonListener);
        ActionListener nextButtonListener = new NextButtonListener();
        startButton.addActionListener(nextButtonListener);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(startButton);
        frame.getContentPane().add(nextButton);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    public static class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("I was pressed!");
        }
    }

    public static class NextButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("I was pressed too!");
        }
    }

}
