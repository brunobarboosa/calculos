package javaapplication5;
import javax.swing.JOptionPane;
public class JavaApplication5 {

    public static void main(String[] args) {
        
        int num[] = new int[3];
        
        num[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        num[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        num[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        if(num[0] < num[1] && num[1] < num[2]) {
            JOptionPane.showMessageDialog(null, num[2] + " " + num[1] + " " + num[0]);
        } else if(num[0] > num[1] && num[2] < num[1]) {
            JOptionPane.showMessageDialog(null, num[0] + " " + num[1] + " " + num[2]);
        } else if(num[0] > num[1] && num[2] > num[0]) {
            JOptionPane.showMessageDialog(null, num[2] + " " + num[0] + " " + num[1]);
        } else if(num[1] < num[2] && num[0] > num[2]) {
            JOptionPane.showMessageDialog(null, num[0] + " " + num[2] + " " + num[1]);
        } else if(num[0] < num[2] && num[1] > num[2]) {
            JOptionPane.showMessageDialog(null, num[1] + " " + num[2] + " " + num[0]);
        } else {
            JOptionPane.showMessageDialog(null, num[1] + " " + num[0] + " " + num[2]);
        }
        
    }
    
}