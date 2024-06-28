import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int arr1[][] = new int [3][2];
        int arr2[][] = new int [3][2];
        //int arr3[][] = new int [3][2];
        input(arr1, sc);
        input(arr2, sc);
        int arr3[][]=add(arr1, arr2);
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

        static void input(int mat[][], Scanner sc) {
                
            System.out.print("Enter 3*2 matrix");
            for(int i=0; i<mat.length; i++) {
                for(int j=0; j<mat[0].length; j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            
        }

        static int[][] add(int mat1[][], int mat2[][]) {
            int mat3[][] = new int[3][2]; 
            for(int i=0; i<mat3.length; i++) {
                for(int j=0; j<mat3[0].length; j++) {
                    mat3[i][j] = mat1[i][j]+mat2[i][j];
                }
            }
            return mat3;
        }

    
}