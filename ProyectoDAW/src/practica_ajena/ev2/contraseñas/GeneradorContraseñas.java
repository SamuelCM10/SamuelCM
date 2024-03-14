package practica_ajena.ev2.contraseñas;

import java.security.SecureRandom;
import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Ejercicio 5

public class GeneradorContraseñas {
    // Enumerador para caracteres especiales permitidos
    enum SpecialCharacter {
        EXCLAMATION_MARK('!'), HASH('#'), DOLLAR('$'), PERCENT('%'), AMPERSAND('&');

        private final char character;

        SpecialCharacter(char character) {
            this.character = character;
        }

        public char getCharacter() {
            return character;
        }
    }

    // Método para generar contraseña aleatoria
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        // Añadir caracteres aleatorios (letras, números y caracteres especiales)
        for (int i = 0; i < length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    password.append((char) (random.nextInt(26) + 'a')); // Letra minúscula
                    break;
                case 1:
                    password.append((char) (random.nextInt(26) + 'A')); // Letra mayúscula
                    break;
                case 2:
                    password.append(random.nextInt(10)); // Número
                    break;
            }
        }

        // Añadir año actual como componente de fecha
        password.append(Year.now().getValue());

        // Añadir un carácter especial
        password.append(SpecialCharacter.values()[random.nextInt(SpecialCharacter.values().length)].getCharacter());

        return password.toString();
    }

    // Método para validar la fortaleza de la contraseña
    public static boolean validatePasswordStrength(String password) {
        // Expresión regular para validar la contraseña
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        int passwordLength = 10;
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Contraseña generada: " + generatedPassword);

        boolean isStrong = validatePasswordStrength(generatedPassword);
        System.out.println("¿Es una contraseña fuerte? " + isStrong);
    }
}