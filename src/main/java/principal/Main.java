package principal;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

        if(a % b == 0 || b % a == 0){
            JOptionPane.showMessageDialog(null,"São Multiplos");
        }else{
            JOptionPane.showMessageDialog(null,"Não são multiplos");
        }
    }
}