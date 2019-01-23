import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game2 implements ActionListener{

    JFrame myFrame;
      MyPanel2 myPanel2;

      // labels used to display palyers name    
      JLabel lb1, lb2;

      // to count the score of both players
    int score1;
    int score2;
     
      // In which direction to move the ball, val is used for this purpose
    int val=1;
    // constructor  
    public Game2()
    {
           score1 = 0;
           score2 = 0;
          
           initGUI();
         
       }
      // used to set layout of the game 
    private void initGUI( ) {

        myFrame = new JFrame();
            myPanel2 = new MyPanel2();

          lb1 = new JLabel("Player1 = 0  ");
          lb2 = new JLabel("Player2 = 0");

        Container c = myFrame.getContentPane();
        c.setLayout(new BorderLayout());
        
        myPanel2.add(lb1);
        myPanel2.add(lb2);
        myPanel2.setBackground(new Color(174,255,255));

        c.add(myPanel2);

        myFrame.setSize(1600,1000);
        
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.addKeyListener(new KeyboradHandler());
        
        Timer t = new Timer(20,this);
        t.start();          

    }

//*************************************************************************************************
     public void actionPerformed(ActionEvent a)
     {
           determineBallDirection();  
           changeBallDirection();
           myPanel2.repaint();   
    }

//*************************************************************************************************
      // inner class to handle KeyEvents 
    public class KeyboradHandler extends KeyAdapter
    {   
        public void keyPressed(KeyEvent ke)
        {       

            if(ke.getKeyCode()==ke.VK_DOWN)//move the right players downward
            {
                if(myPanel2.p6y != 840)
                {
                    myPanel2.p2y += 30; 
                    myPanel2.p6y += 30;
                    myPanel2.p5y += 30;
                }                 
            }
            if(ke.getKeyCode()==ke.VK_UP)//move the right players Upward
            {
                if(myPanel2.p5y !=10 )
                {
                    myPanel2.p2y -= 30; 
                    myPanel2.p6y -= 30;
                    myPanel2.p5y -= 30;
                }
            }
            
            if(ke.getKeyCode()==ke.VK_S)//move the left players downward
            {
                if(myPanel2.p4y != 840)
                {
                    myPanel2.p1y += 30;
                    myPanel2.p3y += 30; 
                    myPanel2.p4y += 30;
                }
            }
            if(ke.getKeyCode()==ke.VK_W  )//move the left players Upward
            {
                if(myPanel2.p3y != 10)
                {
                    myPanel2.p1y -= 30;
                    myPanel2.p3y -= 30; 
                    myPanel2.p4y -= 30;         
                }
            }

        } // end method keyPressed()

    } // end class KeyBoardHandler

//*****************************************************************************************************
      // method used to determine ball direction
      public void determineBallDirection() {
      /* checking for ball hitting boundries*/
      //hitting bottom boundry
      if(val==1 && myPanel2.by >= myPanel2.getHeight()-30)
      {
        val=3;  
      }

      else if(val==4 && myPanel2.by >= myPanel2.getHeight()-30)
      {
        val=2; 
      }
      //hitting top boundry
      else if(val==3 && myPanel2.by <= 10)
      {
        val=1; 
      }

      else if(val==2 && myPanel2.by <= 10)
      {
        val=4;
      }
      //hitting right boundry
      else if(val==1 && myPanel2.bx >= myPanel2.getWidth()-20)
      {
         val=4;
       }
       else if(val==3 && myPanel2.bx >= myPanel2.getWidth()-20)
      {
         val=2; 
       }
       //hitting left boundry
       else if(val==4 && myPanel2.bx<= 20)
      {
         val=1;
       }
       else if(val==2 && myPanel2.bx <= 20)
      {
         val=3; 
       }
       //hitting right goal back
       else if(val==2 && myPanel2.bx ==1500 && myPanel2.by >=380 && myPanel2.by<=600)
       {
         val=3;
        }
        else if(val==4 && myPanel2.bx ==1500 && myPanel2.by >=380 && myPanel2.by<=600)
       {
         val=1;
        }
        //hitting left goal back
        else if(val==1 && myPanel2.bx ==80 && myPanel2.by >=380 && myPanel2.by<=600)
       {
         val=4;
        }
        else if(val==3 && myPanel2.bx ==80 && myPanel2.by >=380 && myPanel2.by<=600)
       {         
         val=2;
        }
        //hitting left goal top
        else if( val==4 && myPanel2.bx >=80 && myPanel2.bx <=180 && myPanel2.by==370)
       {         
         val=2;
        }
        else if( val==1 && myPanel2.bx >=80 && myPanel2.bx <=180 && myPanel2.by==370)
       {         
         val=3;
        }
        //hitting left goal bottom
        else if( val==3 && myPanel2.bx >=80 && myPanel2.bx <=180 && myPanel2.by==610)
       {         
         val=1;
        }
        else if( val==2 && myPanel2.bx >=80 && myPanel2.bx <=180 && myPanel2.by==610)
       {         
         val=4;
        }
        //hitting right goal top
        else if( val==1 && myPanel2.bx >=1410 && myPanel2.bx <=1520 && myPanel2.by==370)
       {         
         val=3;
        }
         else if( val==4 && myPanel2.bx >=1410 && myPanel2.bx <=1520 && myPanel2.by==370)
       {         
         val=2;
        }
        //hitting right goal bottom
         else if( val==3 && myPanel2.bx >=1410 && myPanel2.bx <=1520 && myPanel2.by==610)
       {         
         val=1;
        }
         else if( val==2 && myPanel2.bx >=1410 && myPanel2.bx <=1520 && myPanel2.by==610)
       {         
         val=4;
        }
      /* *********** checking for ball hitting players *****     */
      //hitting right goalie front 
      if(myPanel2.by >= myPanel2.p2y+63 && myPanel2.by <= myPanel2.p2y+115 && myPanel2.bx+20==1320)
      {
        val=4;
      }

      else if(myPanel2.by >= myPanel2.p2y-10 && myPanel2.by<= myPanel2.p2y+63 && myPanel2.bx+20==1320)
      {
        val=2;
      }
      //hitting right goalie back 
      else if(myPanel2.by >= myPanel2.p2y-10 && myPanel2.by <= myPanel2.p2y+115 && myPanel2.bx==1400 && val==4)
      {
        val=1;
      }
       else if(myPanel2.by >= myPanel2.p2y-10 && myPanel2.by <= myPanel2.p2y+115 && myPanel2.bx==1400 && val==2)
      {
        val=3;
      }
      //hitting right goalie top 
      else if(myPanel2.by+20 == myPanel2.p2y && myPanel2.bx >= 1320 && myPanel2.bx <=1380 && val==1)
      {
        val=4;
      }
       else if(myPanel2.by+20 == myPanel2.p2y && myPanel2.bx >= 1320 && myPanel2.bx <=1380 && val==2)
      {
        val=4;
      }
      //hitting right goalie bottom 
      else if(myPanel2.by == myPanel2.p2y+130 && myPanel2.bx >= 1320 && myPanel2.bx <=1380 && val==3)
      {
        val=1;
      }
       else if(myPanel2.by == myPanel2.p2y+130 && myPanel2.bx >= 1320 && myPanel2.bx <=1380 && val==4)
      {
        val=2;
      }
      //hitting right top player front
      else if(myPanel2.by >= myPanel2.p5y+60 && myPanel2.by <= myPanel2.p5y+130 && myPanel2.bx+20==1000)
      {
        val=4;
      }
      else if(myPanel2.by >= myPanel2.p5y-10 && myPanel2.by <= myPanel2.p5y+60 && myPanel2.bx+20==1000)
      {
        val=2;
      }
      //hitting right top player back
      else if(myPanel2.by >= myPanel2.p5y-10 && myPanel2.by <= myPanel2.p5y+130 && myPanel2.bx==1080 && val==4)
      {
        val=1;
      }
       else if(myPanel2.by >= myPanel2.p5y-10 && myPanel2.by <= myPanel2.p5y+130 && myPanel2.bx==1080 && val==2)
      {
        val=3;
      }
      //hitting right top player top 
      else if(myPanel2.by+20 == myPanel2.p5y && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==1)
      {
        val=4;
      }
       else if(myPanel2.by+20 == myPanel2.p5y && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==2)
      {
        val=4;
      }
      //hitting right top player bottom
      else if(myPanel2.by == myPanel2.p5y+140 && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==3)
      {
        val=1;
      }
       else if(myPanel2.by == myPanel2.p5y+140 && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==4)
      {
        val=2;
      }
      //hitting right bottom player front
      else if(myPanel2.by >= myPanel2.p6y+60 && myPanel2.by <= myPanel2.p6y+130 && myPanel2.bx+20==1000)
      {
        val=4;
      }
      else if(myPanel2.by >= myPanel2.p6y-10 && myPanel2.by <= myPanel2.p6y+60 && myPanel2.bx+20==1000)
      {
        val=2;
      }
      //hitting right bottom player back
      else if(myPanel2.by >= myPanel2.p6y-10 && myPanel2.by <= myPanel2.p6y+130 && myPanel2.bx==1080 && val==4)
      {
        val=1;
      }
       else if(myPanel2.by >= myPanel2.p6y-10 && myPanel2.by <= myPanel2.p6y+130 && myPanel2.bx==1080 && val==2)
      {
        val=3;
      }
      //hitting right bottom player top 
      else if(myPanel2.by+20 == myPanel2.p6y && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==1)
      {
        val=4;
      }
       else if(myPanel2.by+20 == myPanel2.p6y && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==2)
      {
        val=4;
      }
      //hitting right bottom player bottom
      else if(myPanel2.by == myPanel2.p6y+140 && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==3)
      {
        val=1;
      }
       else if(myPanel2.by == myPanel2.p6y+140 && myPanel2.bx >= 1000 && myPanel2.bx <=1060 && val==4)
      {
        val=2;
      }
      //hitting left goalie front
      else if(myPanel2.by >= myPanel2.p1y+63 && myPanel2.by <= myPanel2.p1y+115 && myPanel2.bx==280 )
      {
        val=1;
      }         
      else if(myPanel2.by >= myPanel2.p1y-10 && myPanel2.by <= myPanel2.p1y+63 && myPanel2.bx==280)
      {
        val=3;     
      }
      //hitting left goalie back
      else if(myPanel2.by >= myPanel2.p1y-10 && myPanel2.by <= myPanel2.p1y+115 && myPanel2.bx==200 && val==3)
      {
        val=2;
      }
       else if(myPanel2.by >= myPanel2.p1y-10 && myPanel2.by <= myPanel2.p1y+115 && myPanel2.bx==200 && val==1)
      {
        val=4;
      }
      //hitting left goalie top 
      else if(myPanel2.by+20 == myPanel2.p1y && myPanel2.bx >= 200 && myPanel2.bx <=260 && val==1)
      {
        val=4;
      }
       else if(myPanel2.by+20 == myPanel2.p1y && myPanel2.bx >= 200 && myPanel2.bx <=260 && val==2)
      {
        val=4;
      }
      //hitting left goalie bottom 
      else if(myPanel2.by == myPanel2.p1y+130 && myPanel2.bx >= 200 && myPanel2.bx <=260 && val==3)
      {
        val=1;
      }
       else if(myPanel2.by == myPanel2.p1y+130 && myPanel2.bx >= 200 && myPanel2.bx <=260 && val==4)
      {
        val=2;
      }
      //hitting left top player front
      else if(myPanel2.by >= myPanel2.p3y+60 && myPanel2.by <= myPanel2.p3y+130 && myPanel2.bx==600)
      {
        val=1;
      }

      else if(myPanel2.by >= myPanel2.p3y-10 && myPanel2.by <= myPanel2.p3y+60 && myPanel2.bx==600)
      {
        val=3;
      }
      //hitting left top player back
      else if(myPanel2.by >= myPanel2.p3y-10 && myPanel2.by <= myPanel2.p3y+130 && myPanel2.bx==520 && val==3)
      {
        val=2;
      }
       else if(myPanel2.by >= myPanel2.p3y-10 && myPanel2.by <= myPanel2.p3y+130 && myPanel2.bx==520 && val==1)
      {
        val=4;
      }
      //hitting left top player top 
      else if(myPanel2.by+20 == myPanel2.p3y && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==1)
      {
        val=4;
      }
       else if(myPanel2.by+20 == myPanel2.p3y && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==2)
      {
        val=4;
      }
      //hitting left top player bottom
      else if(myPanel2.by == myPanel2.p3y+140 && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==3)
      {
        val=1;
      }
       else if(myPanel2.by == myPanel2.p3y+140 && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==4)
      {
        val=2;
      }
      //hitting left bottom player front
      else if(myPanel2.by >= myPanel2.p4y+60 && myPanel2.by <= myPanel2.p4y+130 && myPanel2.bx==600)
      {
        val=1;
      }
      else if(myPanel2.by >= myPanel2.p4y-10 && myPanel2.by <= myPanel2.p4y+60 && myPanel2.bx==600)
      {
        val=3;
      }
      //hitting left bottom player back
       else if(myPanel2.by >= myPanel2.p4y-10 && myPanel2.by <= myPanel2.p4y+130 && myPanel2.bx==520 && val==3)
      {
        val=2;
      }
       else if(myPanel2.by >= myPanel2.p4y-10 && myPanel2.by <= myPanel2.p4y+130 && myPanel2.bx==520 && val==1)
      {
        val=4;
      }
      //hitting left bottom player top 
      else if(myPanel2.by+20 == myPanel2.p4y && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==1)
      {
        val=4;
      }
       else if(myPanel2.by+20 == myPanel2.p4y && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==2)
      {
        val=4;
      }
      //hitting left bottom player bottom
      else if(myPanel2.by == myPanel2.p4y+140 && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==3)
      {
        val=1;
      }
       else if(myPanel2.by == myPanel2.p4y+140 && myPanel2.bx >= 520 && myPanel2.bx <=580 && val==4)
      {
        val=2;
      }

      /* if ball scores */
      //right goal
      if(myPanel2.bx >=1400 && myPanel2.bx<=1460 && myPanel2.by>390 && myPanel2.by<590)
      {
        score1++;       
        val=7;
      }
      //left goal
      else if(myPanel2.bx>=140 && myPanel2.bx<=180 && myPanel2.by>390 && myPanel2.by<590)
      {
        score2++;
        val=8; 
      }
     } // end determineBallDirection()
     
//******************************************************************************************************
      // method is used to change the ball direction
      public void changeBallDirection( ) 
      {      
      switch(val)
      {
        //down to the right     
        case 1:
            myPanel2.bx += 20;
            myPanel2.by += 10;
            break;
            
        //up to the left
        case 2:
            myPanel2.bx -= 20;
            myPanel2.by -= 10;
            break;

        //up to the right
        case 3:
            myPanel2.bx += 20;
            myPanel2.by -= 10;
            break;
        
        //down to the left
        case 4:
            myPanel2.bx -= 20;
            myPanel2.by += 10;
            break;
            
        //player 1 score restart
        case 7:
            myPanel2.bx  = 280;
            myPanel2.by  = 480;
            myPanel2.p2y = 425;
            myPanel2.p1y = 425;
            myPanel2.p3y = 190;
            myPanel2.p5y = 190;
            myPanel2.p4y = 690;
            myPanel2.p6y = 690;
            lb1.setText("Player 1 ="+ score1 +"  ");
            break;
            
        //player 2 scores restart
        case 8:
            myPanel2.bx = 1300;
            myPanel2.by  = 480;
            myPanel2.p2y = 425;
            myPanel2.p1y = 425;
            myPanel2.p3y = 190;
            myPanel2.p5y = 190;
            myPanel2.p4y = 690;
            myPanel2.p6y = 690;
            lb2.setText("Player 2 ="+ score2 +"");
            break;  
        }// end switch
    } // end method changeBallDirection()
     
//*********************************************************************************************************
      public static void main(String args[]){

          Game2 game = new Game2();

      }
      
} 