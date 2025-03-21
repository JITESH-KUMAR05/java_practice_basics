import java.awt.Graphics;
import  java.applet.Applet;

/* <applet code="Hello.class" width="300" height="300"> </applet> */
public class Hello extends Applet
{
    public void paint(Graphics g){
        g.drawString("Hello World", 50, 50);
    }
}