import javax.swing.*;
import java.awt.*;

public class MyPanel2 extends JPanel{

  // ball coordinates 
  int bx,by;

  // player1 handle coordinate
  int p1x,p1y;

  // palyer2 handle coordiante
  int p2x,p2y;
  
  // palyer2 handle coordiante
  int p3x,p3y;
  
  // palyer2 handle coordiante
  int p4x,p4y;
  
  // palyer2 handle coordiante
  int p5x,p5y;
  
  // palyer2 handle coordiante
  int p6x,p6y;


  // constructor
  public MyPanel2( ){

      bx=280;
      by=480;

        p1x = 0;
        p1y = 425; 

        p2x = 1116;
        p2y = 425;
        
        p3x = -4;
        p3y = 190; 

        p4x = -4;
        p4y = 690;
        
        p5x = 486;
        p5y = 190; 

        p6x = 486;
        p6y = 690;
        

  }

  // overriding paintComponent() method to perform custom painting
  public void paintComponent(Graphics g) {

      // erasing any previous painting  
    super.paintComponent(g);
    
    //drawing rink
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, 20, getHeight());
    g.fillRect(0, 0, getWidth(), 10);
    g.fillRect(getWidth()-20, 0, 20, getHeight());
    g.fillRect(0, getHeight()-10, getWidth(), 10);
    
    g.setColor(Color.RED);
    g.fillRoundRect(100,(getHeight()-220)/2, 10, 220, 10, 10);
    g.fillRoundRect(100,(getHeight()-220)/2, 100, 10, 10, 10);
    g.fillRoundRect(100,(getHeight()-220)/2+210, 100, 10, 10, 10);
    g.fillRoundRect(1500,(getHeight()-220)/2, 10, 220, 10, 10);
    g.fillRoundRect(1410,(getHeight()-220)/2, 100, 10, 10, 10);
    g.fillRoundRect(1410,(getHeight()-220)/2+210, 100, 10, 10, 10);
    g.fillRect(800,0,1, 1000);
    g.fillRect(200,0,1, 1000);
    g.fillRect(1410,0,1, 1000);
    g.drawOval(300,100,200,200);
    g.drawOval(300,700,200,200);
    g.drawOval(1100,100,200,200);
    g.drawOval(1100,700,200,200);
    g.fillOval(380,180,40,40);
    g.fillOval(380,780,40,40);
    g.fillOval(1180,180,40,40);
    g.fillOval(1180,780,40,40);
    g.fillOval(780,480,40,40);
    
    g.setColor(Color.BLUE);
    g.drawOval(700,400,200,200);
    g.fillRect(600,0,1, 1000);
    g.fillRect(1000,0,1, 1000);
    g.fillArc(126,390,150,200,-90,180);
    g.fillArc(1335,390,150,200,90,180);
    
     // drawing players
     //bodies
    g.setColor(new Color(7,103,30));
    
    g.fillRoundRect(p3x+524,p3y+50,15,30,5,5);
    g.fillRoundRect(p3x+539,p3y+50,40,60,10,10);
    g.fillRoundRect(p3x+579,p3y+50,15,30,5,5);
    g.fillRoundRect(p3x+539,p3y+110,15,30,5,5);
    g.fillRoundRect(p3x+564,p3y+110,15,30,5,5);
    
    g.fillRoundRect(p4x+524,p4y+50,15,30,5,5);
    g.fillRoundRect(p4x+539,p4y+50,40,60,10,10);
    g.fillRoundRect(p4x+579,p4y+50,15,30,5,5);
    g.fillRoundRect(p4x+539,p4y+110,15,30,5,5);
    g.fillRoundRect(p4x+564,p4y+110,15,30,5,5);
    
    g.fillRoundRect(p1x+210,p1y+35,15,30,5,5);
    g.fillRoundRect(p1x+225,p1y+35,40,50,10,10);
    g.fillRoundRect(p1x+265,p1y+35,15,30,5,5);
    
    g.setColor(new Color(242,125,8));
    
    g.fillRoundRect(p5x+524,p5y+50,15,30,5,5);
    g.fillRoundRect(p5x+539,p5y+50,40,60,10,10);
    g.fillRoundRect(p5x+579,p5y+50,15,30,5,5);
    g.fillRoundRect(p5x+539,p5y+110,15,30,5,5);
    g.fillRoundRect(p5x+564,p5y+110,15,30,5,5);
    
    g.fillRoundRect(p6x+524,p6y+50,15,30,5,5);
    g.fillRoundRect(p6x+539,p6y+50,40,60,10,10);
    g.fillRoundRect(p6x+579,p6y+50,15,30,5,5);
    g.fillRoundRect(p6x+539,p6y+110,15,30,5,5);
    g.fillRoundRect(p6x+564,p6y+110,15,30,5,5);
    
    g.fillRoundRect(p2x+204,p2y+35,15,30,5,5);
    g.fillRoundRect(p2x+219,p2y+35,40,50,10,10);
    g.fillRoundRect(p2x+259,p2y+35,15,30,5,5);
    
    //heads
    g.setColor(new Color(243,203,132));
    g.fillOval(p5x+544,p5y+10,30,40);
    g.fillOval(p6x+544,p6y+10,30,40);
    g.fillOval(p4x+544,p4y+10,30,40);
    g.fillOval(p3x+544,p3y+10,30,40);
    
    //goalie masks,pads,gloves,and blockers
    g.setColor(Color.WHITE);
    g.fillRoundRect(p1x+225,p1y+85,20,40,5,5);
    g.fillRoundRect(p1x+245,p1y+85,20,40,5,5);
    g.fillOval(p1x+230,p1y,30,35);
    g.fillRoundRect(p1x+205,p1y+60,25,35,10,10);
    g.fillOval(p1x+260,p1y+60,25,35);
    
    g.fillRoundRect(p2x+219,p2y+85,20,40,5,5);
    g.fillRoundRect(p2x+239,p2y+85,20,40,5,5);
    g.fillOval(p2x+224,p2y,30,35);
    g.fillRoundRect(p2x+199,p2y+60,25,35,10,10);
    g.fillOval(p2x+254,p2y+60,25,35);
    
    //helmets and goalie features
    g.setColor(Color.BLACK);
    g.fillRoundRect(p3x+542,p3y,34,20,20,20);
    g.fillRect(p3x+540,p3y+10,38,10);
    g.fillRoundRect(p3x+540,p3y+15,4,12,2,2);
    g.fillRoundRect(p3x+574,p3y+15,4,12,2,2);
    
    g.fillRoundRect(p4x+542,p4y,34,20,20,20);
    g.fillRect(p4x+540,p4y+10,38,10);
    g.fillRoundRect(p4x+540,p4y+15,4,12,2,2);
    g.fillRoundRect(p4x+574,p4y+15,4,12,2,2);
    
    g.fillRoundRect(p5x+542,p5y,34,20,20,20);
    g.fillRect(p5x+540,p5y+10,38,10);
    g.fillRoundRect(p5x+540,p5y+15,4,12,2,2);
    g.fillRoundRect(p5x+574,p5y+15,4,12,2,2);
    
    g.fillRoundRect(p6x+542,p6y,34,20,20,20);
    g.fillRect(p6x+540,p6y+10,38,10);
    g.fillRoundRect(p6x+540,p6y+15,4,12,2,2);
    g.fillRoundRect(p6x+574,p6y+15,4,12,2,2);
    
    g.drawRoundRect(p1x+225,p1y+85,20,40,5,5);
    g.drawRoundRect(p1x+245,p1y+85,20,40,5,5);
    g.drawOval(p1x+230,p1y,30,35);
    g.drawRoundRect(p1x+205,p1y+60,25,35,10,10);
    g.drawOval(p1x+260,p1y+60,25,35);
    g.fillOval(p1x+235,p1y+10,8,8);
    g.fillOval(p1x+245,p1y+10,8,8);
    g.fillOval(p1x+237,p1y+23,4,4);
    g.fillOval(p1x+247,p1y+23,4,4);
    g.fillOval(p1x+242,p1y+20,4,4);
    g.fillOval(p1x+242,p1y+26,4,4);
    
    g.drawRoundRect(p2x+219,p2y+85,20,40,5,5);
    g.drawRoundRect(p2x+239,p2y+85,20,40,5,5);
    g.drawOval(p2x+224,p2y,30,35);
    g.drawRoundRect(p2x+199,p2y+60,25,35,10,10);
    g.drawOval(p2x+254,p2y+60,25,35);
    g.fillOval(p2x+229,p2y+10,8,8);
    g.fillOval(p2x+239,p2y+10,8,8);
    g.fillOval(p2x+231,p2y+23,4,4);
    g.fillOval(p2x+241,p2y+23,4,4);
    g.fillOval(p2x+236,p2y+20,4,4);
    g.fillOval(p2x+236,p2y+26,4,4);
    
    //hockey sticks
    g.setColor(new Color(139,69,19));
    g.fillRect(p3x+519,p3y+80,80,5);
    g.fillRect(p3x+599,p3y+60,10,25);
    g.fillRect(p4x+519,p4y+80,80,5);
    g.fillRect(p4x+599,p4y+60,10,25);
    g.fillRect(p5x+519,p5y+80,80,5);
    g.fillRect(p5x+509,p5y+60,10,25);
    g.fillRect(p6x+519,p6y+80,80,5);
    g.fillRect(p6x+509,p6y+60,10,25);
    
    // drawing ball  
    g.setColor(Color.BLACK);
    g.fillOval(bx, by, 20, 20);

 }

} 