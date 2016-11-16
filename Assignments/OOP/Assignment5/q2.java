import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/* <applet code="q2" width=500 height=500> </applet> */

public class q2 extends JApplet{

public void start()
{
setLayout(new FlowLayout());
repaint();

}


public void paint(Graphics g)
{

g.setColor(Color.BLACK);

g.drawOval(0,0,50,50);
g.fillOval(60,0,50,50);
g.drawOval(120,0,50,50);

g.fillOval(0,60,50,50);
g.drawOval(60,60,50,50);
g.fillOval(120,60,50,50);

g.drawOval(0,120,50,50);
g.fillOval(60,120,50,50);
g.drawOval(120,120,50,50);

}

}

/* Theory: drawOval(int left,int top,int width, int height) fillOval->same where left, top-> coordinates of bounding rectangle.
Rectangle=square for circle. */
