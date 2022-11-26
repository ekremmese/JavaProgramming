package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
//System.out.println(true == !false);
        int score = 40;

        boolean a = score >= 90 && score <= 100,
                b = score >= 80 && !a,
                // boolean b = score >=80 && score <=89  ---- another way of assigning boolean b same goes or c, d, f
                c = score >= 70 && !b,
                d = score >= 60 && !c,
                f = !a && !b && !c && !d;
        if (a) {
            System.out.println("excellent");
        }
        if (b) {
            System.out.println("great");
        }
        if (c) {
            System.out.println("good");
        }
        if(d){
            System.out.println("passed");
        }

        if (f) {
            System.out.println("failed");
        }

        /*

        public static void main(String[] args) {
        int score = 40;
        if (score >= 90) {
            System.out.println("excellent");
        }
        if (score >=80 && score <=89){
            System.out.println("great");
        }
        if (score >=70 && score <=79){
            System.out.println("good");
        }
        if (score >=60 && score <=69){
            System.out.println("passed");
        }
        if (score <60){
            System.out.println("failed");
        }
        }

        This is Ekrem's approach to the question
*/


    }
}
  /*
score

  90 - 100 excellent
  80 - 89 great
  70 - 79 good
  60- 69 passed
  0-59 failed

   */