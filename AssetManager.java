import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssetManager {
    JFrame frame;

    public static void main(String[] args) {
        AssetManager gui = new AssetManager();
        gui.go();
    }

    public void go() {
        frame = new JFrame(" Asset Manager");
        frame.add(Start());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(3000, 2000);
        frame.setVisible(true);
    }

    public JPanel Start() {
        JPanel startPanel = new JPanel();
        startPanel.setLayout(new GridBagLayout());

        JLabel title = new JLabel("Asset Manager");
        title.setFont(new Font("Arial", Font.PLAIN, 200));

        JLabel bywhom = new JLabel("Created by Lawrence Chen");
        bywhom.setFont(new Font("Arial", Font.PLAIN, 50));

        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Arial", Font.PLAIN, 40));
        startButton.setPreferredSize(new Dimension(300,100));
        startButton.addActionListener(new StartButtonListener());

        JButton aboutButton = new JButton("About");
        aboutButton.setFont(new Font("Arial", Font.PLAIN, 40));
        aboutButton.setPreferredSize(new Dimension(300,100));
        aboutButton.addActionListener(new AboutButtonListener());

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 40));
        exitButton.setPreferredSize(new Dimension(300,100));
        exitButton.addActionListener(new ExitButtonListener());

        GridBagConstraints gTitle = new GridBagConstraints();
        gTitle.anchor = GridBagConstraints.PAGE_START;
        gTitle.ipady = 40;
        gTitle.weightx = 0.5;
        gTitle.weighty = 0.5;
        gTitle.gridx = 3;
        gTitle.gridwidth = 2;
        gTitle.gridheight = 2;
        gTitle.insets = new Insets(200, 100, 0, 100);

        GridBagConstraints gBywhom = new GridBagConstraints();
        gBywhom.anchor = GridBagConstraints.PAGE_START;
        gBywhom.ipady = 10;
        gBywhom.weightx = 1.0;
        gBywhom.weighty = 1.0;
        gBywhom.gridx = 3;
        gBywhom.gridwidth = 2;
        gBywhom.gridheight = 10;

        GridBagConstraints gButton = new GridBagConstraints();
        gButton.anchor = GridBagConstraints.CENTER;
        gButton.ipady = 0;
        gButton.weightx = 1.0;
        gButton.weighty = 0.0;
        gButton.gridx = 2;
        gButton.gridwidth = 4;
        gButton.gridheight = 1;
        gButton.insets = new Insets(0, 0, 250, 0);

        startPanel.add(title, gTitle);
        startPanel.add(bywhom, gBywhom);
        startPanel.add(startButton, gButton);
        startPanel.add(aboutButton, gButton);
        startPanel.add(exitButton, gButton);

        return startPanel;
    }

    class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    class AboutButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    public JPanel Menu() {
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
