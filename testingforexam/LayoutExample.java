import javax.swing.*;
import java.awt.*;

public class LayoutExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Layout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panels with different layouts
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // North panel with FlowLayout
        JPanel northPanel = new JPanel(new FlowLayout());
        northPanel.add(new JButton("Button 1"));
        northPanel.add(new JButton("Button 2"));
        northPanel.add(new JButton("Button 3"));

        // Center panel with GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new JButton("1"));
        centerPanel.add(new JButton("2"));
        centerPanel.add(new JButton("3"));
        centerPanel.add(new JButton("4"));

        // Add panels to main panel
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Add main panel to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}