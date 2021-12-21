package oo.intellij;
import javax.swing.JOptionPane; //Caixa de Ferramentas_Diálogo
public class Main  {

    public static void main (String[] args) {
        int codeg; //Variable Input
        String region = " ";
        //Open Dialog + warning attention
        codeg = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, type source code:", JOptionPane.WARNING_MESSAGE));
        switch (codeg) // Recognize the value and then make a decision
        {
            case 1: region = "South"; break;
            case 2: region = "North"; break;
            case 3: region = "East"; break;
            case 4: region = "West"; break;
            case 5: region = "Northeast"; break;
            case 6: region = "Southeast"; break;
            case 7: region = "Midwest"; break;
            case 8: region = "Northwest"; break;
            default:region = "Invalid"; break;
        }
        //Answer Dialog Box
        JOptionPane.showMessageDialog(null, "The Region is: "+ region);

    }
}
