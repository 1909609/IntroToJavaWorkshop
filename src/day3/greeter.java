package day3;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
String sarika;
sarika=JOptionPane.showInputDialog("what is your name");	
JOptionPane.showMessageDialog(null, "hi "+sarika);
String age=JOptionPane.showInputDialog(";what is your age");
String address=JOptionPane.showInputDialog("what is your address");
String work=JOptionPane.showInputDialog(";where do you work");
JOptionPane.showMessageDialog(null,"I know your age is "+age+",your address,and where you work next time be careful") ;
}



}
