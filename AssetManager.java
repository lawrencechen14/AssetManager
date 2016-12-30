import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssetManager implements ActionListener {
    static AssetManager gui = new AssetManager();
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        frame.add(Start());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(3000, 2000);
        frame.setVisible(true);
    }

    public static JPanel Start() {
        JPanel start = new JPanel();
        start.setLayout(new GridLayout(3, 4));

        JLabel title = new JLabel("Asset Manager");
        title.setFont(new Font("Arial", Font.PLAIN, 200));
        start.add(title);

        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Arial", Font.PLAIN, 40));
        startButton.setPreferredSize(new Dimension(300,100));
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(Menu());
                frame.revalidate();
            }
        });

        JButton aboutButton = new JButton("About");
        aboutButton.setFont(new Font("Arial", Font.PLAIN, 40));
        aboutButton.setPreferredSize(new Dimension(300,100));
        aboutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(Menu());
                frame.revalidate();
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy = 3;
        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        start.add(startButton, gbc);
        start.add(aboutButton, gbc);

        return start;
    }

    public static JPanel Menu() {
        JPanel menu = new JPanel();
        menu.setLayout(new FlowLayout());

        menu.add(new JButton("Button 1"));
        menu.add(new JButton("Button 2"));
        menu.add(new JButton("Button 3"));
        menu.add(new JButton("Button 4"));
        menu.add(new JButton("Button 5"));

        return menu;
    }

    public void actionPerformed(ActionEvent event) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(Menu());
        frame.revalidate();
    }
}
