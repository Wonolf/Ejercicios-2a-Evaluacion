/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricessinhilos;

/**
 *
 * @author Bonoso
 */
public class MatricesSinHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrizA[][] = new int [300][300];
        int matrizB[][] = new int [300][300];
        int matrizMulti[][] = new int [300][300];
        int matrizRes[][] = new int [300][300];
        int vecSuma[] = new int [1];
        
        //Declara las matrices A y B con números aleatorios del 1 al 5
        for(int i = 0; i < 300; i++){
            for(int j = 0; j < 300; j++){
                matrizA[i][j] = (int) (Math.random() * 9) + 1;
                matrizB[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        
        //Cálculo de la matriz resultado del producto
        for(int i = 0; i < 300; i++){
            for(int j = 0; j < 300; j++){
                for(int k = 0; k < 300; k++){
                    matrizMulti[i][k] = matrizA[i][k] * matrizB[k][j];
                    vecSuma[0] += matrizMulti[i][k];
                }
                
                matrizRes[i][j] = vecSuma[0];
                vecSuma[0] = 0;
            }
        }
        
        //Muestra la matriz A
        System.out.println("Matriz A: ");
        for(int i = 0; i < 300; i++){
            for(int j = 0; j < 300; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        
        //Muestra la matriz B
        System.out.println("Matriz B: ");
        for(int i = 0; i < 300; i++){
            for(int j = 0; j < 300; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        
        //Muestra la matriz resultado del producto de A y B
        System.out.println("Matriz RESULTADO: ");
        for(int i = 0; i < 300; i++){
            for(int j = 0; j < 300; j++){
                System.out.print(matrizRes[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
