package com.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Bem vindo ao progama!" );
        programa();
    }

    public static void programa(){
        String nome="";
        int numero;
        int continua=1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite seu nome: ");
            nome=scanner.nextLine();
            System.out.println("Digite um número positivo: ");
            numero=Integer.parseInt(scanner.nextLine());
            if(numero<=0){
                System.out.println("Número invalido. Tente novamente!");
                numero=0;
                continue;
            }else{
                System.out.println("EXIBIR NOME");
                mostrNome(verificaNome(nome), nome);
                System.out.println("=============");
                System.out.println("ORDEM CRESCENTE");
                ordemCrescente(numero);
                System.out.println("=============");
                System.out.println("ORDEM DECRESCENTE");
                ordemDescrescente(numero);
                System.out.println("=============");
                System.out.println("=============");
                System.out.println("=============");
                System.out.println("Deseja continuar? Digite 1 para sim e 2 para não: ");
                continua=Integer.parseInt(scanner.nextLine());
            }
        }while(continua==1);
        System.out.println("FIM DO PROGRAMA");
        scanner.close();
    }

    public static int verificaNome(String nome){
        char [] caracteres = nome.toCharArray();
        int quantidade=0;
        for(int i=0; i<caracteres.length;i++){
            char c = caracteres[i];
            if(Character.isLetter(c)){
                quantidade +=1;
            }
        }
        return quantidade;
    }

    public static void mostrNome(int quantidade, String nome){
        if(quantidade>6){
            System.out.println("o nome tem "+quantidade+" letras");
            int numero=1;
            for(int i=0;i<quantidade;i++){
                System.out.println(numero + " - "+nome);
                numero+=1;
            }
        }else{
            System.out.println(" nome tem "+quantidade+" letras");
            System.out.println(nome);
        }
    }

    public static void ordemCrescente(int vezes){
        int numero=0;
        for(int i=0;i<=vezes;i++){
            System.out.println(numero);
            numero+=1;
        }
    }

    public static void ordemDescrescente(int vezes){
        int numero = vezes;
        for(int i=vezes; i>=0;i--){
            System.out.println(numero);
            numero-=1;
        }
    }
}
