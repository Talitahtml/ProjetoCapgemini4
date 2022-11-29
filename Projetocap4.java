package projetocap4;

import javax.swing.JOptionPane;

/**
 *
 * @author elica
 */
public class Projetocap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 2:"));  
      
        int soma = x + y;
        
        System.out.println("A soma do numero 1 e do numero 2 é = " + soma);
    }
    
}
