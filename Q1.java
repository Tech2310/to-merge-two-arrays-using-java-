public class MergeArrays {

    static void mergeArrays(int[] X, int m, int n, int[] Y) {
        
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

       
        while (j >= 0 && k >= 0) {
            if (i >= 0 && X[i] >= Y[j]) {
                
                X[k] = X[i];
                i--;
            } else {
                
                X[k] = Y[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] X = new int[9]; // X has 3 vacant cells
        X[0] = 1;
        X[1] = 4;
        X[2] = 7;

        int[] Y = {2, 3, 5, 6};
        int m = 3; // Actual number of elements in X
        int n = Y.length;

        mergeArrays(X, m, n, Y);

        System.out.print("Merged array: ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(X[i] + " ");
        }
    }
}

