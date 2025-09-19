import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int r, c, key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        r = scanner.nextInt();
        c = scanner.nextInt();
        int[][] arr= new int[r][c];
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
            arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
            System.out.print(arr[i][j]+ " ");
            
            }
            System.out.println();
        }
        
        System.out.println("\nEnter the element to be found: ");
        key = scanner.nextInt();
        
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
                if (arr[i][j]==key){
                    System.out.println("Element found at\nrow: "+ i + " and column: "+ j);
                }
            }
        }
        
}
}
