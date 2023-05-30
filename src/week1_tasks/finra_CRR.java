package week1_tasks;

public class finra_CRR {
    public static void main(String[] args) {

        for (int a = 1; a <= 30; a++) {
            if (a % 15 == 30) {
                System.out.println("FINRA");

            } else if (a % 3 == 0) {
                System.out.println("FIN");

            } else if (a % 5 == 0) {
                System.out.println("RA");
            }else{
                System.out.println(a);
            }
        }
    }
}

