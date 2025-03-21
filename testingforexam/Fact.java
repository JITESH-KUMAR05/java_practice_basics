import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fact extends JFrame implements ActionListener{
    JTextField I;
    JTextField R;
    JButton B;
    public Fact(){
        super("Factorial Calculator");
        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout());
        
        // Add labels and properly size components
        jp1.add(new JLabel("Enter a number:"));
        I = new JTextField(10);
        jp1.add(I);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout());
        jp2.add(new JLabel("Result:"));
        R = new JTextField(15);
        R.setEditable(false);
        jp2.add(R);

        JPanel jp3 = new JPanel();
        jp3.setLayout(new FlowLayout());
        B = new JButton("Calculate Factorial");
        B.addActionListener(this);
        jp3.add(B);
        
        // Add panel to frame
        this.setLayout(new BorderLayout());
        this.add(jp1, BorderLayout.NORTH);
        this.add(jp2, BorderLayout.CENTER);
        this.add(jp3, BorderLayout.SOUTH);
        
        // Set frame properties
        setSize(300, 200);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            int num = Integer.parseInt(I.getText());
            if (num < 0) {
                R.setText("Cannot calculate factorial of negative number");
            } else {
                R.setText(String.valueOf(factorial(num)));
            }
        } catch (NumberFormatException ex){
            R.setText("Please enter a valid integer");
        } catch (Exception ex){
            R.setText("Error: " + ex.getMessage());
        }
    }
    
    public int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
    
    public static void main(String args[]){
        new Fact();
    }
}