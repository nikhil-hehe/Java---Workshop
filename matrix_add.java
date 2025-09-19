import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int r, c, key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of both matrices: ");
        r = scanner.nextInt();
        c = scanner.nextInt();
        int[][] arr1= new int[r][c];
        int[][] arr2= new int[r][c];
        int[][] arr= new int[r][c];
        System.out.println("Enter the elements in matrix 1: ");
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
            arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements in matrix 2: ");
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
            arr2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
            System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2: ");
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
            System.out.print(arr2[i][j]+ " ");
            
            }
            System.out.println();
        }
        
        
        
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
                arr[i][j] = arr1[i][j] +arr2[i][j];
                }
            }
        
        
        System.out.println("Matrix Addition: ");
        for(int i=0; i<r; i++){
            for (int j=0; j<c;j++){
            System.out.print(arr[i][j]+ " ");
            
            }
            System.out.println();
        }
    }   
}

