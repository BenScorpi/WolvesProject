package week6_tasks;

public class PasswordValidationTaskString {
    public static boolean validatePassword(String password){
        if(password.length()<6 || password.contains(" ")){
            return false;
        }
        int up = 0;
        int low=0;
        int spec=0;
        int digit=0;
        for (char ch:password.toCharArray()) {
            if(ch>=65 && ch<=90){
                up++;
            }else if (ch>=97 && ch<=122){
                low++;
            } else if(ch>=48 && ch<=57){
                digit++;
            }else{
                spec++;
            }
        }
        if(up <1||low<1||spec<1||digit<1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("validatePassword(\"cydeoUSA2023!\") = " + validatePassword("cydeoUSA2023!"));

        System.out.println("validatePassword(\"cydeo\") = " + validatePassword("cydeo"));

    }
}
