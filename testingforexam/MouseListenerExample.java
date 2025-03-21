import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerExample extends JFrame implements MouseListener {
    private JLabel statusLabel;

    public MouseListenerExample() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a drawing panel
        JPanel drawPanel = new JPanel();
        drawPanel.setBackground(Color.WHITE);
        drawPanel.addMouseListener(this);

        // Create status label
        statusLabel = new JLabel("Mouse Events will appear here");
        statusLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to frame
        add(drawPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // MouseListener methods

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked on a component
        statusLabel.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() +
                ") Clicks: " + e.getClickCount());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        statusLabel.setText("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        statusLabel.setText("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        statusLabel.setText("Mouse Entered drawing area");
        ((JPanel)e.getSource()).setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        statusLabel.setText("Mouse Exited drawing area");
        ((JPanel)e.getSource()).setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}