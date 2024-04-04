public class MaxSumPath {

    public static int findMaxSumPath(int[] X, int m, int[] Y, int n) {
        int i = 0, j = 0, maxSum = 0, currentSum = 0;

       
        while (i < m && j < n) {
            
            if (X[i] == Y[j]) {
                currentSum += X[i];
                i++;
                j++;
            } else if (X[i] < Y[j]) {
                
                currentSum += X[i];
                i++;
            } else {
                
                currentSum += Y[j];
                j++;
            }

           
            maxSum = Math.max(maxSum, currentSum);
        }

        
        while (i < m) {
            currentSum += X[i++];
            maxSum = Math.max(maxSum, currentSum);
        }

        
        while (j < n) {
            currentSum += Y[j++];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int maxSum = findMaxSumPath(X, X.length, Y, Y.length);

        System.out.println("Maximum sum path: " + maxSum);
    }
}
