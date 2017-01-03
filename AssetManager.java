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

    private class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    private class AboutButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(About());
            frame.revalidate();
        }
    }

    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    public JPanel About() {
        JPanel aboutPanel = new JPanel();
        //aboutPanel.setLayout(new BoxLayout());

        JLabel aboutTitle = new JLabel("About This Program");
        aboutTitle.setFont(new Font("Arial", Font.PLAIN, 200));

        JLabel aboutInfo = new JLabel("<html>" + "This project is my first big java program" + "</html>");

        JButton backButton = new JButton("Exit");
        backButton.setFont(new Font("Arial", Font.PLAIN, 40));
        backButton.setPreferredSize(new Dimension(300,100));
        backButton.addActionListener(new BackButtonListener());

        aboutPanel.add(aboutTitle);
        aboutPanel.add(aboutInfo);

        return aboutPanel;
    }

    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Start());
            frame.revalidate();
        }
    }

    public JPanel Menu() {
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new FlowLayout());

        JButton Button1 = new JButton("Button1");
        Button1.setFont(new Font("Arial", Font.PLAIN, 40));
        Button1.setPreferredSize(new Dimension(300,100));
        Button1.addActionListener(new Button1Listener());

        JButton Button2 = new JButton("Button2");
        Button2.setFont(new Font("Arial", Font.PLAIN, 40));
        Button2.setPreferredSize(new Dimension(300,100));
        Button2.addActionListener(new Button2Listener());

        JButton Button3 = new JButton("Button3");
        Button3.setFont(new Font("Arial", Font.PLAIN, 40));
        Button3.setPreferredSize(new Dimension(300,100));
        Button3.addActionListener(new Button3Listener());

        JButton Button4 = new JButton("Button4");
        Button4.setFont(new Font("Arial", Font.PLAIN, 40));
        Button4.setPreferredSize(new Dimension(300,100));
        Button4.addActionListener(new Button4Listener());

        JButton Button5 = new JButton("Button5");
        Button5.setFont(new Font("Arial", Font.PLAIN, 40));
        Button5.setPreferredSize(new Dimension(300,100));
        Button5.addActionListener(new Button5Listener());

        menuPanel.add(new JButton("Button 1"));
        menuPanel.add(new JButton("Button 2"));
        menuPanel.add(new JButton("Button 3"));
        menuPanel.add(new JButton("Button 4"));
        menuPanel.add(new JButton("Button 5"));

        return menuPanel;
    }

    private class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    private class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    private class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    private class Button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }

    private class Button5Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Menu());
            frame.revalidate();
        }
    }
}
