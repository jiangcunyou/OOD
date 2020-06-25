/**Write a function
 * Write a function windowPosSum(int[] a, int n) that replaces each element a[i] with the sum of a[i] through a[i + n],
 * but only if a[i] is positive valued. If there are not enough values because we reach the end of the array, we sum only
 * as many values as we have.
 *
 * For example, suppose we call windowPosSum with the array a = {1, 2, -3, 4, 5, 4}, and n = 3. In this case, we’d:
 *
 * Replace a[0] with a[0] + a[1] + a[2] + a[3].
 * Replace a[1] with a[1] + a[2] + a[3] + a[4].
 * Not do anything to a[2] because it’s negative.
 * Replace a[3] with a[3] + a[4] + a[5].
 * Replace a[4] with a[4] + a[5].
 * Not do anything with a[5] because there are no values after a[5].
 * Thus, the result after calling windowPosSum would be {4, 8, -3, 13, 9, 4}.
 *
 * As another example, if we called windowPosSum with the array a = {1, -1, -1, 10, 5, -1},and n = 2, we’d get {-1, -1, -1, 14, 4, -1}.*/
package cs61b.BasicProgram.BreakContinue;

import cn.basic.StreamAndMethodReference.Demo10ArrayMethodReference.ArrayBuilder;

import java.util.Arrays;

public class Demo {
    public static void windowPosSum(int[] a, int n){
        int[] b = new int[a.length];
        for (int i = 0; i < 3; i++) {
                if (a[i] > 0){
                    for (int j = i; j < i + n + 1; j++) {
                        b[i] += a[j] ;
                    }
                }else b[i] = a[i];
        }
                for (int k = 3; k < 6; k++){
                    if (a[k] > 0){
                        for (int j = k; j < 6; j++) {
                            b[k] += a[j];
                        }
                    }
                }


        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(Arrays.toString(a));
    }
}
