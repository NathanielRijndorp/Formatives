import javax.swing.*;
import java.util.Arrays;




public class TestJava {

    public static void main(String[] args) {
        // Initialization
        String title = "Adrian Carlo A. Menguita", output;
        TestJava set = new TestJava();
        int[] A = {1, 2, 3}, B = {3, 4, 5};
        // Output
        output = String.format("""
                Union: %s
                UnionAll: %s
                Intersect: %s
                Difference: %s
                A`: %s
                B`: %s
                Symmetric Difference: %s""",
                Arrays.toString(set.union(A, B)),
                Arrays.toString(set.unionAll(A, B)),
                Arrays.toString(set.intersection(A, B)),
                Arrays.toString(set.difference(A, B)),
                Arrays.toString(set.complement(A, B, A)),
                Arrays.toString(set.complement(A, B, B)),
                Arrays.toString(set.symDiff(A, B)));
        JOptionPane.showMessageDialog(null, output, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1, tmp; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    public int[] dupeRemover(int[] arr){
        int dupe = 0;
        for (int x = 0; x < arr.length - 1; x++){
            if (arr[x] == arr[x+1]){
                dupe++;
            }
        }
        int[] noDupe = new int[arr.length - dupe];
        for (int x = 0, y = 0; x < arr.length; x++){
            if (!(arr[x] == arr[(x+1 < arr.length)? x+1: 0])){
                noDupe[y] = arr[x];
                y++;
            }
        }
        return noDupe;
    }
    public int[] unionAll(int[] a, int[] b){
        int[] set1 = sortArr(a), set2 = sortArr(b);
        int length = set1.length + set2.length;
        int[] combined = new int[length];

        for (int x = 0, y = 0, z = 0; x < length; x++){
            if(y < set1.length && set1[y] < ((z != set2.length)? set2[z]: Integer.MAX_VALUE)){
                combined[x] = set1[y];
                y++;
            } else if (z < set2.length){
                combined[x] = set2[z];
                z++;
            }
        }
        return combined;
    }
    public int[] union(int[] a, int[] b){
        int[] combined = unionAll(a, b);
        return dupeRemover(combined);
    }
    public int[] intersection(int[] a, int[] b){
        int[] set1 = dupeRemover(sortArr(a));
        boolean[] duplicate = new boolean[set1.length];
        int dupe = 0;
        for (int x = 0; x < set1.length; x++){
            for (int y = 0; y < b.length; y++){
                if (a[x] == b[y]){
                    duplicate[x] = true;
                    dupe++;
                    break;
                }
            }
        }
        int[] intersect = new int[dupe];
        for (int x = 0, y = 0; x < set1.length; x++){
            if (duplicate[x]){
                intersect[y] = set1[x];
                y++;
            }
        }
        return intersect;
    }
    public int[] difference(int[] a, int[] b){
        int[] set1 = dupeRemover(sortArr(a));
        boolean[] duplicate = new boolean[set1.length];
        int dupe = 0;
        for (int x = 0; x < set1.length; x++){
            for (int y = 0; y < b.length; y++){
                if (a[x] == b[y]){
                    duplicate[x] = true;
                    dupe++;
                    break;
                }
            }
        }
        int[] difference = new int[set1.length-dupe];
        for (int x = 0, y = 0; x < set1.length; x++){
            if (!duplicate[x]){
                difference[y] = set1[x];
                y++;
            }
        }
        return difference;
    }
    public int[] complement(int[] a, int[] b, int[] c){
        int[] union = union(a, b);
        return difference(union, c);
    }
    public int[] symDiff(int[] a, int []b){
        int[] set1 = complement(a, b, a), set2 = complement(a, b, b);
        System.out.println(Arrays.toString(set1));
        System.out.println(Arrays.toString(set2));
        return unionAll(set1, set2);
    }
}