
        //import sun.text.resources.nl.JavaTimeSupplementary_nl;

        import java.awt.*;
        //import java.awt.event.*;
        import javax.swing.*;

public class start {
    public JPanel createContentPane(){
        // Create a bottom JPanel to place everything
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10,0);
        titlePanel.setSize(1000,30);
        totalGUI.add(titlePanel);

        JLabel redLabel = new JLabel("Red Team");
        redLabel.setLocation(400,0);
        redLabel.setSize(100,30);
        redLabel.setHorizontalAlignment(0);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);

        JLabel blueLabel = new JLabel("Blue Team");
        blueLabel.setLocation(520,0);
        blueLabel.setSize(100,30);
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue);
        titlePanel.add(blueLabel);

        //Creates score panels
        JLabel scorePanel = new JLabel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(400,40);
        scorePanel.setSize(250,30);
        totalGUI.add(scorePanel);

        JLabel redScoreLabel = new JLabel("0");
        redScoreLabel.setLocation(0,0);
        redScoreLabel.setSize(100,30);
        redScoreLabel.setHorizontalAlignment(0);
        scorePanel.add(redScoreLabel);

        JLabel blueScoreLabel = new JLabel("0");
        blueScoreLabel.setLocation(120,0);
        blueScoreLabel.setSize(100,30);
        blueScoreLabel.setHorizontalAlignment(0);
        scorePanel.add(blueScoreLabel);

        //Creates label to contain all JButtons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(400, 0);
        buttonPanel.setSize(400, 400);
        //buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        totalGUI.add(buttonPanel);
        Font buttonFont = new Font("Seriff",Font.BOLD, 16);
        //Creates buttons
        JButton redButton = new JButton("0");
        redButton.setLocation(260,310);
        redButton.setSize(60, 60);
        redButton.setFont(buttonFont);
        buttonPanel.add(redButton);

        JButton blueButton = new JButton("1");
        blueButton.setLocation(190,310);
        blueButton.setSize(60,60);
        blueButton.setFont(buttonFont);
        buttonPanel.add(blueButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setLocation(0,40);
        resetButton.setSize(220,30);
        buttonPanel.add(resetButton);

        totalGUI.setOpaque(true);
        return totalGUI;


    }

    private static void createAndShowGUI()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Tax Sale");

        //Creates context pane
        start demo = new start();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }


}