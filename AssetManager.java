import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssetManager extends JPanel implements ActionListener {
    static AssetManager gui = new AssetManager();
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        frame.add(Start());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(3000, 2000);
        frame.setVisible(true);
    }

    public static JPanel Start() {
        JPanel startPanel = new JPanel();
        startPanel.setLayout(new GridBagLayout());

        JLabel title = new JLabel("Asset Manager");
        title.setFont(new Font("Arial", Font.PLAIN, 200));
        //startPanel.add(title);

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

        GridBagConstraints gTitle = new GridBagConstraints();
        gTitle.fill = GridBagConstraints.CENTER;
        //gbc.anchor = GridBagConstraints.CENTER;
        gTitle.ipady = 40;
        gTitle.weightx = 1.0;
        gTitle.weighty = 1.0;
        //gbc.gridy = 3;
        //gbc.gridx = 3;
        gTitle.gridwidth = 2;
        gTitle.gridheight = 2;
        //gbc.insets = new Insets(100, 100, 100, 100);

        GridBagConstraints gButton = new GridBagConstraints();
        gButton.fill = GridBagConstraints.HORIZONTAL;
        //gbc.anchor = GridBagConstraints.CENTER;
        gButton.ipady = 20;
        gButton.weightx = 1.0;
        gButton.weighty = 1.0;
        //gbc.gridy = 3;
        //gbc.gridx = 3;
        gButton.gridwidth = 3;
        gButton.gridheight = 4;

        startPanel.add(title, gTitle);
        startPanel.add(startButton, gButton);
        startPanel.add(aboutButton, gButton);

        return startPanel;
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
