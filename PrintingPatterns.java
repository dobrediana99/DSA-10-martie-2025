public class PrintingPatterns{
    public static void printNumberTriangle(int numberOfRows){
        if(numberOfRows<=0){
            System.out.println("Number of rows must be positive!");
        }
        
        int current_number = 1;

        for(int i = 1; i<=numberOfRows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(current_number+" ");
                current_number++;
            }
            System.out.println("");
        }
    }

    public static void printPascalsTriangle(int n) {
        int[][] triangle = new int[n + 1][n + 1];

        // Build the triangle
        for (int i = 0; i <= n; i++) {
            triangle[i][0] = triangle[i][i] = 1; // First and last element of each row is 1
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the triangle in pyramid form
        for (int i = 0; i <= n; i++) {
            // Centering spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingPatterns.printNumberTriangle(5);
        PrintingPatterns.printNumberTriangle(-12);
        PrintingPatterns.printPascalsTriangle(3);
    }
}