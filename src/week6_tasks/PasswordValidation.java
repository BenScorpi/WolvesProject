package week6_tasks;

public class PasswordValidation {

    //String -- Password Validation Task
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns false

    public static boolean passwordValidation(String password) {

        if (password.length() >= 6 || !password.contains(" ")) {

            boolean hasSpecialCharacter = false;
            boolean hasUpperLetter = false;
            boolean hasLowerLetter = false;
            boolean hasDigit = false;

            for (char each : password.toCharArray()) {

                if (!Character.isLetterOrDigit(each)) {
                    hasSpecialCharacter = true;
                } else if (Character.isUpperCase(each)) {
                    hasUpperLetter = true;
                } else if (Character.isLowerCase(each)) {
                    hasLowerLetter = true;
                } else if (Character.isDigit(each)) {
                    hasDigit = true;
                }
            }
            return hasDigit && hasLowerLetter && hasUpperLetter && hasSpecialCharacter;
        }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidation("232wdjwA@"));
    }
}

