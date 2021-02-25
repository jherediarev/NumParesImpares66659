/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares66659;

/**
 *
 * @author Johnny Reveles
 */
public class NumParesImpares66659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        int sumapar = 0;
        int sumaimpar = 0;
        
        while (num <= 100) {
        if (num % 2 == 0) {
        sumapar += num;
        
        } else {
        sumaimpar += num;
        
        }
        num++;
    }
        System.out.println("La suma de los numeros pares es " + sumapar);
        System.out.println("La suma de los numeros impares es " + sumaimpar);
        
        
}

}
