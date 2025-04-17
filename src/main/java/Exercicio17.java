import javax.swing.JOptionPane;

public class Exercicio17{

    public static void main(String[] args) {
    String palavra;
    int vezes;
    
        palavra = JOptionPane.showInputDialog("Coloque uma palavra: ");
    
        vezes = Integer.parseInt(JOptionPane.showInputDialog("Coloque quantas vezes quer repetir sua palavra: ")); 
            
            for (int i= 1; i < vezes; i++){
                
                JOptionPane.showMessageDialog(null,  palavra);
    
    }
}
}