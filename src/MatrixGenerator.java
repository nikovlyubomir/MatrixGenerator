import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatrixGenerator{

    public static int matrix[][];

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int z=0;
    	while(z==0) {
    	System.out.println("Please enter N value:");
    	int n = sc.nextInt();
    	
    	System.out.println("Please enter M value:");
    	int m = sc.nextInt();
    	
    	if(n>0 && m>0) {
    		System.out.println("Output:");
    		createMatrix(n,m);
    		System.out.println("--------------------------");
    		print();
    		System.out.println("--------------------------");
    	} else{
    		System.out.println("--------------------------");
    		System.out.println("Please remember that n and m should be positive values in order to create a matrix!");
    		System.out.println("--------------------------");
    	}
    	}
        
    }
    
// creating the matrix     
    public static void createMatrix(int rows, int columns) {
        //create a list (1,3,5, ...) with size = columns - 1
        List<Integer> list = IntStream.iterate(1, i -> i + 2)
                .limit(columns - 1).boxed()
                .collect(Collectors.toList());

        matrix = new int[rows][columns];
        int square = Math.min(rows, columns);
        
        for (int i = 0; i < square; i++) {
            int temp = (i + 1) * (i + 1);
            for (int j = 0; j < square; j++) {
                if (j == 0) {
                    matrix[i][j] = temp;
                } else {
                    matrix[i][j] = matrix[i][j - 1] + list.get(j - 1);                   
                }
             
            }
            if (i < columns - 1) {
                list.set(i, -1);
            }           
        }                
        
//The method below is dealing with cases n!=m              
        int counter = (int) Math.pow(Math.min(rows, columns), 2);
        int sqrt = (int) Math.sqrt(counter);
        
        
        if(rows > columns) {            
            for (int i = sqrt; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = ++counter;
                }
            }
        } 
        else if (rows < columns) {
            for (int i = sqrt; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    matrix[j][i] = ++counter;                 
                }                
            }
        }        
    }
    
//The method below prints the matrix      
    public static void print() {
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.printf("%4d ", i);
            }
            System.out.println();
        }
    }
    
    
 //The method below is used for JUnit testing
    public static ArrayList<Integer> expetedArray() {    	
    	ArrayList<Integer> arr = new ArrayList<>();
        for (int[] row : matrix) {
            for (int i : row) {
                arr.add(i);
            }
            System.out.println();
        }
        
        return arr;
    }
}