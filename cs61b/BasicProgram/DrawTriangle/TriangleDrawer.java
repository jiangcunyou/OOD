/** This work using * to build a Triangle stuff and u can enter the number of col.*/
package cs61b.BasicProgram.DrawTriangle;

public class TriangleDrawer {
    public static void drawTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        drawTriangle(8);
    }
}
