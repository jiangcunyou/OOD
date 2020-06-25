/** This work using * to build a Triangle stuff.*/
package cs61b.BasicProgram.DrawTriangle;

public class Demo01 {
    public static void main(String[] args) {
        for (int col = 0; col < 5; col++) {
            for (int row =0; row < col +1; row++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
