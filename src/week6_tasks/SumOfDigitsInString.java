package week6_tasks;

public class SumOfDigitsInString {
    public static int sumOfDigits(String str){
        int sum = 0;
        String result ="";

        for (char c : str.toCharArray()) {
            if(c>=48 && c<=57){
                result=c+"";
                sum += Integer.parseInt(result);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sumOfDigits(\"v1e2s3n4a5\") = " + sumOfDigits("v1e2s3n4a5"));
    }
}
