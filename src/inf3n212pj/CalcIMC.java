/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 182110084
 */
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float peso, altura, IMC;
        string classificacao;

        System.out.println("--IMC--");
        System.out.print("informe seu peso :");
        peso = leia.nextFloat();
        System.out.println("informe sua altura :");
        altura = leia.nextFloat();

        IMC = peso / (altura * altura);
        System.out.printf("seu Índice de massa corporal é %.2f", IMC);
        if (IMC <= 18.5); {
            classificacao = "abaixo do peso";
        } else if (IMC <= 29.9); {

        }

    }
