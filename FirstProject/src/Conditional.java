public class Conditional {
    public static void main(String args[]) {
//    int n = 10;
//    if(n <= 5)
//            {
//        System.out.println("Yes n is less than 10");
//            }
//    else
//            {
//                System.out.println("n is greater than 10");
//            }

        int testScore = 98;
        char grade;

        if (testScore >= 90){
            grade = 'A';
        }
        else if (testScore>=80) {
            grade = 'B';
        } else if (testScore>= 70) {
            grade = 'C';

        }
        else {
            grade = 'F';
        }
        System.out.println("My score is " + grade);
    }
}