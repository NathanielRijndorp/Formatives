package Lab_4;

import javax.swing.*;

public class DevelopmentalTask {
    public static void main(String[] args) { //Nathaniel P. Rijndorp

        String infancy = "Infancy and Early Childhood";
        String mid = "Middle Childhood";
        String adolescence = "Adolescence";
        String early = "Early Adulthood";
        String midAge = "Middle Age";
        String late = "Later Maturity";
        String devStage = " ";

        byte age = Byte.parseByte(JOptionPane.showInputDialog(null, new JTextArea("Please input age: ")));

        if (age >= 0 && age <= 5 ) {
            devStage = infancy;
        }
        if (age >= 6 && age <= 12) {
            devStage = mid;
        }
        if (age >= 13 && age <= 17) {
            devStage = adolescence;
        }
        if (age >= 18 && age <= 35) {
            devStage = early;
        }
        if (age >= 36 && age <= 60) {
            devStage = midAge;
        }
        if (age > 60) {
            devStage = late ;
        }

        JOptionPane.showMessageDialog(null, new JTextArea("Development Task is at the stage of:  " + devStage));
    }
}
