import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*<applet code="eventhandling" width="400" height="250">
</applet>*/
public class eventhandling extends Applet implements MouseListener,MouseMotionListener{
    int mx=0;
    int my=0;
    String msg=" ";
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void MouseClicked(MouseEvent me){
        mx=20;
        my=40;
        msg="MouseClicked";
        repaint();
    } 
    public void MousePressed(MouseEvent me){
        mx=30;
        my=60;
        msg="MousePressed";
        repaint();
    }
    public void MouseReleased(MouseEvent me){
        mx=30;
        my=60;
        msg="MouseReleased";
        repaint();
    }
    public void MouseEntered(MouseEvent me){
        mx=40;
        my=80;
        msg="MouseEntered";
        repaint();
    }
    public void MouseExited(MouseEvent me){
        mx=40;
        my=80;
        msg="MouseExited";
        repaint();
    }
    public void MouseDragged(MouseEvent me){
        mx=me.getX();
        my=me.getY();
        showStatus("Currently mouse at "+mx+ "and "+my);
        repaint();
    }
    public void MouseMoved(MouseEvent me){
    mx=me.getX();
    my=me.getY();
    showStatus("Currently mouse at "+mx+ "and "+my);
        repaint();
        }
    
    public void paint(Graphics g){
        g.drawString("Handling mouse events",30,20);
        g.drawString(msg, 60, 40);
    }
}
