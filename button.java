import java.awt.*;
import java.awt.event.*;

class button extends Frame implements ActionListener
{
 String msg = "Frame Window";
 Button r,g,b;
 Color bcolor = new Color(108,210,220);
 Color gcolor = Color.green;
 Color rcolor = Color.red;
 Color wcolor = Color.white;

 public button()
 {
  r = new Button("red");
  g = new Button("green");
  b = new Button("blue");

  add(r);
  add(g);
  add(b);

  r.addActionListener(this);
  g.addActionListener(this);
  b.addActionListener(this);

  setBackground(wcolor);
  setLayout(new FlowLayout());
  this.addWindowListener(new WindowHandler());
 }

 public static void main(String args[])
 {
  button bf = new button();
  bf.setTitle("Frame Window");
  bf.setSize(400,500);
  bf.setVisible(true);
 }

 public void actionPerformed(ActionEvent e)
 {
  String str = e.getActionCommand();
 
  if(str.equals("red"))
  {
   setBackground(rcolor);
   r.setBackground(rcolor);
   g.setBackground(wcolor);
   b.setBackground(wcolor);
  }
  else if(str.equals("green"))
  {
   setBackground(gcolor);
   r.setBackground(wcolor);
   g.setBackground(gcolor);
   b.setBackground(wcolor); 
  }
  else if(str.equals("blue"))
  {
   setBackground(bcolor);
   r.setBackground(wcolor);
   g.setBackground(wcolor);
   b.setBackground(bcolor);
  }
 }

 public void paint(Graphics g) 
 {
  g.drawString(msg,150,150);
 }

 public class WindowHandler extends WindowAdapter
 {
  public void windowClosing(WindowEvent e) 
  {
   System.exit(0);
  }
 }

}