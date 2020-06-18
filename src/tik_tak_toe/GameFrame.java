
package tik_tak_toe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GameFrame extends JFrame{
    public String whoseTurn = "X";
    public String playerOne = "player one";
    public String playerTwo = "player two";
    public int playerOneCount = 0;
    public int playerTwoCount = 0;
    public String playerTurn = "";
    JButton btn1 = new JButton("");
    JButton btn2 = new JButton("");
    JButton btn3 = new JButton("");
    JButton btn4 = new JButton("");
    JButton btn5 = new JButton("");
    JButton btn6 = new JButton("");
    JButton btn7 = new JButton("");
    JButton btn8 = new JButton("");
    JButton btn9 = new JButton("");
    JLabel label = new JLabel("Label");
    public GameFrame(){
    
        //setSize(1300,600);
        super("Tik_Tak_Toe");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        add(panel);
     
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        //label.setPreferredSize(new Dimension(250,50));
        label.setFont(new Font("sansserif",Font.BOLD, 16));
        //label.setBackground(Color.red);
        //panel1.setBackground(Color.red);
        panel1.add(label);
        add(panel1);
        
//        JPanel panel2 = new JPanel();
//        JMenuBar bar = new JMenuBar();
//        JMenu menu = new JMenu("File");
//        JMenuItem item1 = new JMenuItem("Item1");
//        menu.add(item1);
//        menu.add(bar);
//        JMenu menu2 = new JMenu("Edit");
//        menu2.add(bar);
//        panel.add(bar);
//        add(panel2);
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(10,10));
        //panel3.add(panel2,BorderLayout.NORTH);
        panel3.add(panel,BorderLayout.CENTER);
        panel3.add(panel1,BorderLayout.SOUTH);
        add(panel3);
        
        btn1.addActionListener(new LisentOne());
        btn2.addActionListener(new LisentTwo());
        btn3.addActionListener(new LisentThree());
        btn4.addActionListener(new LisentFour());
        btn5.addActionListener(new LisentFive());
        btn6.addActionListener(new LisentSix());
        btn7.addActionListener(new LisentSeven());
        btn8.addActionListener(new LisentEight());
        btn9.addActionListener(new LisentNine());
        getPlayerName();
        setScore();
        setPlayerName();
    }
    public void tieGame(){
        String one = btn1.getText();
        String two = btn2.getText();
        String three = btn3.getText();
        String four = btn4.getText();
        String five = btn5.getText();
        String six = btn6.getText();
        String seven = btn7.getText();
        String eight = btn8.getText();
        String nine = btn9.getText();
        if(one !="" && two !="" && three !="" && four !="" &&
                five !="" && six !="" && seven !="" && eight !="" && nine !="")
        {
            JOptionPane.showMessageDialog(this,
                    "Game Tie",
                    "Game is tie",
                    JOptionPane.INFORMATION_MESSAGE);
            resetButton();
        }
    }
    public void setScore(){
//        String playerTurn;
       
        label.setText(playerOne + ",s Score is : " + 
                String.valueOf(playerOneCount)
                +""+playerTurn+",s Move"+playerTwo+"s, Score is :"+
                String.valueOf(playerTwoCount));
    }
    public void setPlayerName()
    {
         if(whoseTurn.equalsIgnoreCase("X"))
        {
            playerTurn = playerOne;
        }
        else
        {
            playerTurn = playerTwo;
        }
         label.setText(playerOne + ",s Score is : " + 
                String.valueOf(playerOneCount)+"\t"
                +"    "+playerTurn +",s Move First   "+playerTwo+",s Score is : " +
                String.valueOf(playerTwoCount));
    }
    public void getPlayerName(){
    
        playerOne = JOptionPane.showInputDialog(this,
                "Player One Name",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        
        playerTwo = JOptionPane.showInputDialog(this,
                "Player Two Name",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
           if(playerOne.equals("")) 
           {
               playerOne = "Player One";
           }
           if(playerTwo.equals("")) 
           {
               playerTwo = "Player One";
           }
    }
    public void determineWhoseTurn(){
    
        if(whoseTurn.equalsIgnoreCase("X"))
        {
        
            whoseTurn = "O";
        }
        else
        {
        
            whoseTurn = "X";
        }
    }
    public void xWins()
    {
    
        JOptionPane.showMessageDialog( this,playerOne + " Wins",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        playerOneCount++;
        resetButton();
    }
    public void oWins()
    {
        JOptionPane.showMessageDialog( this,playerTwo + " Wins",
                "Winner"
                ,JOptionPane.INFORMATION_MESSAGE);
        playerTwoCount++;
        resetButton();
    }
    
    public void resetButton(){
    
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        setScore();
    }
    public void deterMinewin()
    {
    
        String one = btn1.getText();
        String two = btn2.getText();
        String three = btn3.getText();
        String four = btn4.getText();
        String five = btn5.getText();
        String six = btn6.getText();
        String seven = btn7.getText();
        String eight = btn8.getText();
        String nine = btn9.getText();
        
        
        //for Xwins 
        
        if(one == "X" && two == "X" && three == "X")
        {
        
            xWins();
        }
        
         if(four == "X" && five == "X" && six == "X")
        {
        
            xWins();
        }
         
          if(seven == "X" && eight == "X" && nine == "X")
        {
        
            xWins();
        }
          
           if(one == "X" && four == "X" && seven == "X")
        {
        
            xWins();
        }
           
            if(two == "X" && five == "X" && eight == "X")
        {
        
            xWins();
        }
            
             if(three == "X" && six == "X" && nine == "X")
        {
        
            xWins();
        }
             
              if(one == "X" && five == "X" && nine == "X")
        {
        
            xWins();
        }
              
               if(three == "X" && five == "X" && seven == "X")
        {
        
            xWins();
        }
               
               
      //for oWins
      if(one == "O" && two == "O" && three == "O")
        {
        
            oWins();
        }
        
         if(four == "O" && five == "O" && six == "O")
        {
        
            oWins();
        }
         
          if(seven == "O" && eight == "O" && nine == "O")
        {
        
            oWins();
        }
          
           if(one == "O" && four == "O" && seven == "O")
        {
        
            oWins();
        }
           
            if(two == "O" && five == "O" && eight == "O")
        {
        
            oWins();
        }
            
             if(three == "O" && six == "O" && nine == "O")
        {
        
            oWins();
        }
             
              if(one == "O" && five == "O" && nine == "O")
        {
        
            oWins();
        }
              
               if(three == "O" && five == "O" && seven == "O")
        {
        
            oWins();
        }
      
    }
    
      class LisentOne implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
         btn1.setText(whoseTurn);
         btn1.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn1.setForeground(Color.red);
             
         }
         else
         {
         
             btn1.setForeground(Color.BLUE);
         }
         determineWhoseTurn();
         deterMinewin();
         tieGame();
         setPlayerName();
        }   
   }
      class LisentTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn2.setText(whoseTurn);
            btn2.setFont(new Font("sansserif",Font.BOLD, 80));
            
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn2.setForeground(Color.red);
         }
         else
         {
         
             btn2.setForeground(Color.BLUE);
         }
            
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        } 
      }
      
      class LisentThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn3.setText(whoseTurn);
            btn3.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn3.setForeground(Color.red);
         }
         else
         {
         
             btn3.setForeground(Color.BLUE);
         }
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        }
          
      }
      
      class LisentFour implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn4.setText(whoseTurn);
            btn4.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn4.setForeground(Color.red);
         }
         else
         {
         
             btn4.setForeground(Color.BLUE);
         }
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        }
          
      }
      
      class LisentFive implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn5.setText(whoseTurn);
            btn5.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn5.setForeground(Color.red);
         }
         else
         {
         
             btn5.setForeground(Color.BLUE);
         }
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        }
          
      }
      
      class LisentSix implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn6.setText(whoseTurn);
            btn6.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn6.setForeground(Color.red);
         }
         else
         {
         
             btn6.setForeground(Color.BLUE);
         }
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        }
          
      }
      
      class LisentSeven implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn7.setText(whoseTurn);
            btn7.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn7.setForeground(Color.red);
         }
         else
         {
         
             btn7.setForeground(Color.BLUE);
         }
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        }
          
      }
      
      class LisentEight implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn8.setText(whoseTurn);
            btn8.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn8.setForeground(Color.red);
         }
         else
         {
         
             btn8.setForeground(Color.BLUE);
         }
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        }
          
      }
      
      class LisentNine implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn9.setText(whoseTurn);
            btn9.setFont(new Font("sansserif",Font.BOLD, 80));
         if(whoseTurn.equalsIgnoreCase("X"))
         {
         
             btn9.setForeground(Color.red);
         }
         else
         {
         
             btn9.setForeground(Color.BLUE);
         }
            determineWhoseTurn();
            deterMinewin();
            tieGame();
            setPlayerName();
        }
          
      }
}
