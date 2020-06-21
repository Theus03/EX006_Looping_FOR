/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

/**
 *
 * @author Matheus
 */
public class Ex006_Looping {
    public static void main(String[] args){
        for (int i=1; i<=15; i++){
            double a = Math.pow(i, 3);
            if (a == 0){
                System.out.println('1');
            }
            if (a <= 1){
                System.out.println('3');
            }
            System.out.println(a);
        }
    }
}
