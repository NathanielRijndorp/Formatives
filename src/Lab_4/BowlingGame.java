package Lab_4;

import javax.swing.*;

public class BowlingGame {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String score_1, score_2;
        byte p1_score = 0, p2_score = 0;

        score_1 = (JOptionPane.showInputDialog("Round 1\n" + "Player 1 enter your score: "));
        p1_score += Byte.parseByte(score_1);
        score_2 = (JOptionPane.showInputDialog("Round 1\n" + "Player 2 enter your score: "));
        p2_score += Byte.parseByte(score_2);

        score_1 = (JOptionPane.showInputDialog("Round 2\n" + "Player 1 enter your score: "));
        p1_score += Byte.parseByte(score_1);
        score_2 = (JOptionPane.showInputDialog("Round 2\n" + "Player 2 enter your score: "));
        p2_score += Byte.parseByte(score_2);

        score_1 = (JOptionPane.showInputDialog("Round 3\n" + "Player 1 enter your score: "));
        p1_score += Byte.parseByte(score_1);
        score_2 = (JOptionPane.showInputDialog("Round 3\n" + "Player 2 enter your score: "));
        p2_score += Byte.parseByte(score_2);

        if (p1_score > p2_score) {
            JOptionPane.showMessageDialog(null, new JTextArea("\nNathaniel P. Rijndorp" + "\nPlayer 1 Total Score: " + p1_score + "\nPlayer 2 Total Score: " + p2_score + "\nCongratulations, Player 1. You won."));
        } else {
            JOptionPane.showMessageDialog(null, new JTextArea("\nNathaniel P. Rijndorp" + "\nPlayer 1 Total Score: " + p1_score + "\nPlayer 2 Total Score: " + p2_score + "\nCongratulations, Player 2. You won."));
        }

    }
}
