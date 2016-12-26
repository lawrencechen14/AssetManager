import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssetManager {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton startButton = new JButton("Continue");
        ActionListener startButtonListener = new StartButtonListener();
        startButton.addActionListener(startButtonListener);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(startButton);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    public static class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("I was pressed!");
        }
    }

}
