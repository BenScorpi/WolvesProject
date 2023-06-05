package week3_tasks;

public class ReverseNegNumber {

    public static int reverseNegNum(int number) {

        boolean isNegative = number<0;
        String strNumber = Integer.toString(Math.abs(number));
        String strReversed = "";

        for (int i = strNumber.length()-1; i >= 0  ; i--) {
            strReversed += strNumber.charAt(i);
        }

        int intReversed = Integer.parseInt(strReversed);

        return isNegative? -intReversed : intReversed;

    }

}
