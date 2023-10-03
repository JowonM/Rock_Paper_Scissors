import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockClicker implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("You Chose Rock");

        int randomNum = (int)(Math.random() * (4-1)+1);

        if(randomNum == 1){
            System.out.println("I Chose Rock, We tied");

        }
        if(randomNum == 2){
            System.out.println("I Chose Paper, I Won");

            RockPaperScissorsFrame.mainPnl.add(RockPaperScissorsFrame.playerTwo = new JLabel("CPU Score " + "\n" + RockPaperScissorsFrame.userScore++), BorderLayout.WEST);
        }
        if(randomNum == 3){
            System.out.println("I Chose Scissors, I lose");
            RockPaperScissorsFrame.mainPnl.add(RockPaperScissorsFrame.playerOne = new JLabel("User Score " + "\n" + RockPaperScissorsFrame.userScore++), BorderLayout.EAST);
        }


    }
}
