import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n, key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("\nEnter the element to be found: ");
        key = scanner.nextInt();
        
        for(int i=0; i<n; i++){
            if (arr[i] == key){
                System.out.println("Element found at index: "+ i);
            }
            
        }
        
        
}
}
