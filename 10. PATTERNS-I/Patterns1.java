public class Patterns1 {

    public static void InvertedPat(int num) {
        
        for(int i = num; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HalfPyramid(int num) {
        
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void CharPattern(int num) {
        
        char ch = 'A';

        for(int i = 1; i <= num; i++) {
            for(int j = 1 ; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }




    public static void main(String args[]) {

       // InvertedPat(4);

       //  HalfPyramid(4);

       // CharPattern(5);
        
    }
}