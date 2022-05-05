package dio.exercicios.listas;

        /*Faça um programa que receba a temperatura média dos 6
        primeiros meses do ano e armazene-as em uma lista.

        Após isto, calcule a média semestral das temperaturas e
        mostre todas as temperaturas acima desta média, e em que
        mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
        – Fevereiro e etc).*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperaturas {


    public static void main(String [] args){
        ArrayList <Double> temperatura = new ArrayList<>(6);
        Iterator <Double> it = temperatura.iterator();
        Double soma = 0d;

        temperatura.add(30.0);
        temperatura.add(25.0);
        temperatura.add(31.5);
        temperatura.add(18.5);
        temperatura.add(21.0);
        temperatura.add(15.5);

        for(int i = 0; i < temperatura.size(); i++){
            soma += temperatura.get(i);
        }

        Double media = soma/temperatura.size();

        System.out.println("A temperatura média é " + media);

        for(int j = 0; j < temperatura.size(); j++){
            String mes = "";
            if (temperatura.get(j) > media){
                if(j == 0){
                    mes = "janeiro";
                }else if (j == 1){
                    mes = "fevereiro";
                }else if (j == 2){
                    mes = "março";
                }else if (j == 3){
                    mes = "abril";
                }else if (j == 4){
                    mes = "maio";
                }else if (j == 5){
                    mes = "junho";
                }
                System.out.println("A temperatura em " + mes + " foi de " + temperatura.get(j) );
            }
        }


    }
}
