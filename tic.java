import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class tic extends JFrame implements ActionListener
{
	//JFrame f=new JFrame(new tic());;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
  JLabel t;
  Font f;
  static int player=0,game=0;
  int visible=1,visible1=0;
  tic()
  {
	  
   b1=new JButton("b1");
   b2=new JButton("b2");
   b3=new JButton("b3");
    b4=new JButton("b4");
    b5=new JButton("b5");
   b6=new JButton("b6");
   b7=new JButton("b7");
   b8=new JButton("b8");
b9=new JButton("b9");
t=new JLabel();	
f=new Font("rachana",Font.ITALIC,16);
t.setFont(f);
t.setForeground(Color.red);
setLayout(new GridLayout(4,3,8,8)); 
	 add(b1);
	 add(b2);
	 add(b3);
	 add(b4);
	 add(b5);
	 add(b6);
         add(b7);
         add(b8);
         add(b9);
          add(t);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);		   
  }	
  public void actionPerformed(ActionEvent ae)
  {
	 String str=ae.getActionCommand();
	  if(str.equals("b1"))
	  {
		  if(player%2==0 && game<6){
			  b1.setText("x");
			  player++;
			  game++;;
		      playerwon();
			  if(visible==1)
			  //t.setText("player two turn");
		     t.setText("player two turn");}
		  else if(game<6){
		    b1.setText("O");
            player++;
			game++;; 
            playerwon();
			if(visible==0)
		  t.setText("player one turn");}
	     else
			 t.setText("draw!!");
   	  }
         if(str.equals("b2"))
	  {
		  if(player%2==0 && game<6){
			  b2.setText("x");
			 			  player++;
						  game++;;
                                   playerwon();
								   if(visible==1)
								   t.setText("player two turn");
								   }
                  else if(game<6){
                    //b.setText("O");
					b2.setText("O");
					
                    player++;
					game++;; 
                     playerwon();
					 if(visible1==0)
					 t.setText("player one turn");}
				 else
					 t.setText("draw!!");
	  }
           if(str.equals("b3"))
	  {
		  if(player%2==0 && game<6){
			  b3.setText("x");
                          player++;
						  game++;;
                                  playerwon();
								  if(visible==1)
								   t.setText("player two turn");}
                  else{
                    b3.setText("O");
                    player++;
					game++;;
                   playerwon();
				   if(visible1==0)
t.setText("player one turn");				   }
	  }
           if(str.equals("b4"))
	  {
		  if(player%2==0 && game<6){
			  b4.setText("x");
                          player++;
						  game++;;
                          playerwon();
						  if(visible==1)
						   t.setText("player two turn");}
                  else if(game<6){
                    b4.setText("O");
                    player++;
					game++;;
                       playerwon();
					   if(visible1==0)
					   t.setText("player one turn");
					   }
					   else
						   t.setText("draw!!");
	  }
          if(str.equals("b5"))
	  {
		  if(player%2==0 && game<6){
			  b5.setText("x");
                          player++;
						  game++;;
                            playerwon();
							if(visible==1)
							 t.setText("player two turn");}
                  else if(game<6){
                    b5.setText("O");
                    player++;
					game++;;
                          playerwon(); 
						  if(visible1==0)
						  t.setText("player one turn");}
					  else
						  t.setText("draw!!");
	  }
           if(str.equals("b6"))
	  {
		  if(player%2==0 && game<6){
			  b6.setText("x");
                          player++;
						  game++;;
                        playerwon();
						if(visible==1)
						 t.setText("player two turn");}
                  else if(game<6){
                    b6.setText("O");
                    player++;
					game++;; 
                      playerwon();
					  if(visible1==0)
					  t.setText("player one turn");}
				  else
					  t.setText("draw!!");
	  }
          if(str.equals("b7"))
	  {
		  if(player%2==0 && game<6){
			  b7.setText("x");
                          player++;
						  game++;;
                                playerwon();
								 if(visible==1)
								 t.setText("player two turn");}
                  else if(game<6){
                    b7.setText("O");
                    player++;
					game++;; 
                     playerwon();
					 if(visible1==0)
					 t.setText("player one turn");}
				 else
					 t.setText("draw!!");
	  }
          if(str.equals("b8"))
	  {
		  if(player%2==0 && game<6){
			  b8.setText("x");
                          player++;
						  game++;;
                               playerwon();
							    if(visible==1)
								t.setText("player two turn");}
                  else if(game<6){
                    b8.setText("O");
                    player++;
					game++;;
                    playerwon(); 
					if(visible1==0)
					t.setText("player one turn");}
				else
					t.setText("draw!!");
	  }
           if(str.equals("b9"))
	  {
		  if(player%2==0 && game<6){
			  b9.setText("x");
                          player++;
						  game++;;
                               playerwon();
							   if(visible==1)
							    t.setText("player two turn");}
                  else if(game<6){
                    b9.setText("O");
                    player++;
					game++;; 
                         playerwon();
						 if(visible1==0)
						 t.setText("player one turn");}
					 else
						 t.setText("draw!!");
	  }
  }
void playerwon()
{
     int won;
      
    if(b1.getText().equals("x"))
      {
      if(b2.getText().equals("x"))
         {
        if(b3.getText().equals("x"))
          {
            won=0;
            if(won==0){
               t.setText("player one wins");
			   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible=0;
			}}
            else
               t.setText("player two wins");
         }
       }
     }
      if(b1.getText().equals("x"))
      {
      if(b4.getText().equals("x"))
         {
        if(b7.getText().equals("x"))
          {
            won=0;
            if(won==0){
               t.setText("player one wins");
			   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible=0;
			}}
            else
               t.setText("player two wins");
         }
       }
     }
    if(b1.getText().equals("x"))
      {
      if(b5.getText().equals("x"))
         {
        if(b9.getText().equals("x"))
          {
            won=0;
            if(won==0){
               t.setText("player one wins");
		     	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible=0;
		  }}
            else
               t.setText("player two wins");
         }
       }
     }
    if(b7.getText().equals("x"))
      {
      if(b8.getText().equals("x"))
         {
        if(b9.getText().equals("x"))
          {
            won=0;
            if(won==0){
               t.setText("player one wins");
			   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible=0;
			}}
            else
               t.setText("player two wins");
         }
       }
     }
     if(b3.getText().equals("x"))
      {
      if(b6.getText().equals("x"))
         {
        if(b9.getText().equals("x"))
          {
            won=0;
            if(won==0){
               t.setText("player one wins");
			   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible=0;
			}}
            else
               t.setText("player two wins");
         }
       }
     }
	 if(b3.getText().equals("x"))
      {
      if(b5.getText().equals("x"))
         {
        if(b7.getText().equals("x"))
          {
            won=0;
            if(won==0){
               t.setText("player one wins");
			   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible=0;
			} }
            else
               t.setText("player two wins");
         }
       }
}
	  if(b6.getText().equals("x"))
      {
      if(b4.getText().equals("x"))
         {
        if(b5.getText().equals("x"))
          {
            won=0;
            if(won==0){
               t.setText("player one wins");
		   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible=0;
			}
            else
               t.setText("player two wins");
         }
       }
	  }}
     if(b1.getText().equals("O"))
      {
      if(b2.getText().equals("O"))
         {
        if(b3.getText().equals("O"))
          {
            won=0;
            if(won==1)
               t.setText("player one wins");
            else{
               t.setText("player two wins");
		   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
			    visible1=1;
			}
         }
       }
} }
      if(b1.getText().equals("O"))
      {
      if(b4.getText().equals("O"))
         {
        if(b7.getText().equals("O"))
          {
            won=0;
            if(won==1)
               t.setText("player one wins");
            else{
               t.setText("player two wins");
		   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
			        visible1=1;
			}
         }
       }
} }
    if(b1.getText().equals("O"))
      {
      if(b5.getText().equals("O"))
         {
        if(b9.getText().equals("O"))
          {
            won=0;
            if(won==1)
               t.setText("player one wins");
            else{
               t.setText("player two wins");
		   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible1=1;
			}
         }
       }
} }
    if(b7.getText().equals("O"))
      {
      if(b8.getText().equals("O"))
         {
        if(b9.getText().equals("O"))
          {
            won=0;
            if(won==1)
               t.setText("player one wins");
            else{
               t.setText("player two wins");
		   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
                     visible1=1;
					}
         }
       }
} }
     if(b3.getText().equals("O"))
      {
      if(b6.getText().equals("O"))
         {
        if(b9.getText().equals("O"))
          {
            won=0;
            if(won==1)
               t.setText("player one wins");
            else{
               t.setText("player two wins");
		   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
			       visible1=1;
			}
         }
       }
}}
	 if(b3.getText().equals("O"))
      {
      if(b5.getText().equals("O"))
         {
        if(b7.getText().equals("O"))
          {
            won=0;
            if(won==1)
               t.setText("player one wins");
            else{
               t.setText("player two wins");
		   	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
					visible1=1;
			}
         }
       }
	  }}
	  if(b6.getText().equals("O"))
      {
      if(b4.getText().equals("O"))
         {
        if(b5.getText().equals("0"))
          {
            won=0;
            if(won==1){
			t.setText("player one wins");
			
				}
			}
			else{
               t.setText("player two wins");
			  	int a=JOptionPane.showConfirmDialog(null,"are you sure");
				if(a==JOptionPane.YES_OPTION){
					this.setVisible(false);
                      visible1=1;
					}
         }
       }
     }
    
}
public static void main(String args[])
{
  tic c=new tic();
  c.setVisible(true);
  c.setSize(350,350);
  c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}