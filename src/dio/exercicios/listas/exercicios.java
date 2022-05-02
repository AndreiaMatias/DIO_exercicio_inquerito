package dio.exercicios.listas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicios {


    public static void main(String[] args) {
        inquerito();

    }
    /*
        Utilizando listas, faça um programa que faça 5 perguntas para uma
        pessoa sobre um crime. As perguntas são:

        "Telefonou para a vítima?"

        "Esteve no local do crime?"

        "Mora perto da vítima?"

        "Devia para a vítima?"

        "Já trabalhou com a vítima?"

        Se a pessoa responder positivamente a 2 questões ela deve ser
        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
        "Assassina". Caso contrário, ela será classificado como "Inocente".
        */
    public static void inquerito() {
        List<String> perguntas = new ArrayList<>(5);
        Scanner scan = new Scanner(System.in);
        System.out.println("Telefonou para a vítima?");
        String telefonou = scan.nextLine();
        perguntas.add(telefonou);
        System.out.println("Esteve no local do crime?");
        String local = scan.nextLine();
        perguntas.add(local);
        System.out.println("Mora perto da vítima?");
        String mora = scan.nextLine();
        perguntas.add(mora);
        System.out.println("Devia para a vítima?");
        String devia = scan.nextLine();
        perguntas.add(devia);
        System.out.println("Já trabalhou com a vítima?");
        String trabalhou = scan.nextLine();
        perguntas.add(trabalhou);

        int totalSim = 0;

        for(int i = 0; i < perguntas.size(); i++){
            if (perguntas.get(i).equalsIgnoreCase("sim")){
                totalSim += 1;

            }
        }
        if(totalSim == 2){
            System.out.println("Suspeita");
        } else if(totalSim == 3 || totalSim == 4){
            System.out.println("Cúmplice");
        }else if(totalSim == 5){
            System.out.println("Assassina");
        }else{
            System.out.println("Inocente");
        };
    }
}