package org.example;

//Criação da classe 'Bebe'
class Bebe {
    //Definição de variáveis
    int qtd;
    String nome = "ainda não sabemos seu(s) nome(s)";

    //Iniciando o construtor sem argumentos
    Bebe() {
        qtd = 1;
        System.out.println("Hoje um bebê nasceu!");
    }

    //Iniciando o construtor com um int como argumento
    Bebe(String n) {
        qtd = 1;
        nome = n;
        System.out.println("Hoje um bebê chamado " + nome + " nasceu!");
    }

    //Iniciando o construtor com uma String como argumento
    Bebe(int q) {
        qtd = q;
        System.out.println("Hoje nasceram " + qtd + " bebês!");

    }

    //Configuração do metodo 'info'
    void info() {
        System.out.println("Nasceram " + qtd + " bebê(s) e seu(s) nome(s) são: " + nome);
    }
}
public class Main{
    public static void main(String[] args){
        //Instanciando o objeto sem argumentos
        System.out.println("Teste 1:");
        Bebe b1 = new Bebe();
        b1.info();

        System.out.println();

        //Instanciando o objeto com um 'int' como argumento
        System.out.println("Teste 2:");
        Bebe b2 = new Bebe(5);
        b2.info();

        System.out.println();

        //Instanciando o objeto com uma 'String' como argumento
        System.out.println("Teste 3:");
        Bebe b3 = new Bebe("João de Santo Cristo");
        b3.info();

    }
    /*Output
        Teste 1:
        Hoje um bebê nasceu!
        Nasceram 1 bebê(s) e seu(s) nome(s) são: ainda não sabemos seu(s) nome(s)

        Teste 2:
        Hoje nasceram 5 bebês!
        Nasceram 5 bebê(s) e seu(s) nome(s) são: ainda não sabemos seu(s) nome(s)

        Teste 3:
        Hoje um bebê chamado João de Santo Cristo nasceu!
        Nasceram 1 bebê(s) e seu(s) nome(s) são: João de Santo Cristo
     */

}