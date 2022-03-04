/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.mod2.no2;

import java.util.*;

/**
 *
 * @author Fathan
 */
public class PBOMOD2NO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] array = new int[4][];

        isiArray(array);
        printArray(array);

        // Input user
        Scanner in = new Scanner(System.in);

        System.out.print("Bilangan yang dicari: ");
        int searchNum1 = in.nextInt();
        search(array, searchNum1);

        System.out.print("Bilangan yang dicari: ");
        int searchNum2 = in.nextInt();
        search(array, searchNum2);

        in.close();
    }

    static void search(int[][] array, int x){
        List<String> founds = new ArrayList<>();

        // Loop tiap elemen pada array
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                int current = array[row][col];

                // Jika elemen pada index saat ini adalah x, maka simpan pesan pada ArrayList
                if (current == x){
                    String foundMsg = "Baris ke-" + (row + 1) + " kolom ke-" + (col + 1);
                    founds.add(foundMsg);
                }
            }
        }

        // Print array list
        for (String dicari : founds){
            System.out.println(dicari);
        }
    }

    // Isi array dengan ketentuan jurnal
    static int[][] isiArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            int size = 3 + i;
            array[i] = new int[size];

            switch (i){
                case 0:
                    for (int j = 0; j < size; j++) array[i][j] = (j + 1) * 5;
                    break;
                case 1:
                    for (int j = 0; j < size; j++) array[i][j] = (j + 1) * 2;
                    break;
                case 2:
                    for (int j = 0; j < size; j++) array[i][j] = (j + 1) * (j + 1);
                    break;
                case 3:
                    for (int j = 0; j < size; j++) array[i][j] = (j + 1) + 2;
                    break;
            }
        }

        return array;
    }
    
    // Print array
    static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
