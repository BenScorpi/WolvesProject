package week1_tasks;

public class FINRA {

    public static void main(String[] args) {

        String result = "";
        for (int i = 1; i < 101; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            }else if(i%3==0){
                result += "FIN ";
            }else{
                result += i +" ";
            }

        }

        System.out.println(result);

    }

}



/*write a method which prints out the numbers from 1-30
 but for numbers which are multiple of 3 print "FIN"
instead of the number and for numbers which are a multiple of 5
print "RA" instead of the number for numbers which are multiple
of both 3 and 5 print "FINRA" instead of the number.
*/