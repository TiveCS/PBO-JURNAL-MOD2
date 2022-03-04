/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.mod2.no1;

/**
 *
 * @author Fathan
 */
public class PBOMOD2NO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Matrix 3x2
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6}
        };

        printMatrix(matrix);
        System.out.println(" ");
        printMatrix(transpose(matrix));
    }

    static int[][] transpose(int[][] matrix){
        int[][] nMatrix = new int[matrix[0].length][];

        // Isi nMatrix sesuai dengan ukuran kolom tiap row dari matrix
        for (int i = 0; i < nMatrix.length; i++){
            nMatrix[i] = new int[matrix.length];
        }

        // Lakukan tranverse
        for (int row = 0; row < nMatrix.length; row++){
            for (int col = 0; col < nMatrix[row].length; col++){
                nMatrix[row][col] = matrix[col][row];
            }
        }

        return nMatrix;
    }

    static void printMatrix(int[][] matrix){
        // Loop row matrix
        for (int i = 0; i < matrix.length; i++){
            // Loop column matrix
            for (int num : matrix[i]){
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }
    
}
