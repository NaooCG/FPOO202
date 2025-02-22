import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //crea el primer objeto
        password password=new password();
        //usar atributos
        password.id = Integer.parseInt(JOptionPane.showInputDialog("ingrese ID de la cuenta: "));
        password.numeros = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la contraseña: "));


        int specialCharsOption = JOptionPane.showConfirmDialog(null, "incluir caracteres especiales?");
        boolean includeSpecialChars = (specialCharsOption == JOptionPane.YES_OPTION);

        int upperCaseOption = JOptionPane.showConfirmDialog(null, "incluir mayusculas?");
        boolean includeUpperCase = (upperCaseOption == JOptionPane.YES_OPTION);

        password.minusculas=includeSpecialChars? " si ":" no ";
        password.mayusculas=includeUpperCase? " si ":" no ";

        String passwordGenerated = password.generador(password.numeros, includeSpecialChars, includeSpecialChars);
        JOptionPane.showMessageDialog(null, "tu contraseña es " + passwordGenerated);
    }
}   