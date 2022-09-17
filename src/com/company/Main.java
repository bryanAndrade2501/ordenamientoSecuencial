package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matriz[][] = cargar();
        imprimir(matriz);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea buscar");
        int numBuscado = scanner.nextInt();
        ordenamientoSecuencial(matriz,numBuscado);
    }
    public static void ordenamientoSecuencial (int matriz[][], int clave){
        int existe = 0;
        for(int i =0; i<matriz.length;i++){
            for(int j =0; j<matriz[0].length;j++){
                if(matriz[i][j]==clave){
                    System.out.println("El numero si existe y esta en la fila " + (i+1) + " y columna " + (j+1));
                    existe =1;
                    break;
                }else{
                    existe = 2;
                }
            }
        }
        if(existe == 2){
            System.out.println("El elemento no existe");
        }
    }
    public static int[][] cargar() {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas filas tiene la matriz: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.print("Cuantas columnas tiene la matriz: ");
        m = Integer.parseInt(scanner.nextLine());
        int matriz[][] = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int randomValue = (int) ((Math.random() * 60) + 1);
                matriz[i][j] = (randomValue);
            }
        }
        return matriz;
    }
    public static void imprimir(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            //System.out.print("Fila "+i+" --> ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
