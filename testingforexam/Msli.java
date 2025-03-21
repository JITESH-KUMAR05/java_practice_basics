import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Msli extends JFrame implements MouseListener{
    JLabel label;
    public Msli(){
        JFrame frame = new JFrame("Testing mouse moments");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        label = new JLabel("Mouse not in frame");
        frame.add(label, BorderLayout.NORTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse clicked");
        label.setText("Mouse clicked");        
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse entered");
        label.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Mouse exited");
        label.setText("Mouse exited");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse pressed");
        label.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse released");
        label.setText("Mouse released");
    }
    public static void main(String [] Args){
        new Msli();
    }
}