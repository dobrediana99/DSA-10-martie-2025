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

    public static void main(String[] args) {
        PrintingPatterns.printNumberTriangle(5);
    }
}