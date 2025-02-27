import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //crear el primer objeto
        password password = new password();

        //usar atributos
        password.setId(Integer.parseInt(JOptionPane.showInputDialog("ingrese ID de la cuenta: ")));
        password.setNumeros(Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la contraseña: ")));


        int specialCharsOption = JOptionPane.showConfirmDialog(null, "incluir caracteres especiales?");
        boolean includeSpecialChars = (specialCharsOption == JOptionPane.YES_OPTION);

        int upperCaseOption = JOptionPane.showConfirmDialog(null, "incluir mayúsculas?");
        boolean includeUpperCase = (upperCaseOption == JOptionPane.YES_OPTION);

        password.setMinusculas(includeSpecialChars ? "sí" : "no");
        password.setMayusculas(includeUpperCase ? "sí" : "no");

        String passwordGenerated = password.generador(password.getNumeros(), includeSpecialChars, includeUpperCase);
        JOptionPane.showMessageDialog(null, "tu contraseña es: " + passwordGenerated);
    }
}