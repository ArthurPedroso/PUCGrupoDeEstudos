import java.util.*;
/**
 * Funcoes, estruturas de dados, inicio de tipos abstratos
 */
public class Bloco2_11_06_2020
{
    private static class DadosDoAluno
    {
        public int Nota;
        public String Nome;
        public DadosDoAluno(String _nome, int _nota)
        {
            Nota = _nota;
            Nome = _nome;
        }
    }
    //Metodo que recebe array de DadosDoAluno e retorna o aluno 
    private static DadosDoAluno pegaMelhorAluno(DadosDoAluno[] _dadosDeAlunos)
    {
        DadosDoAluno melhorAluno = _dadosDeAlunos[0];
        for(int i = 1; i < _dadosDeAlunos.length; i++)
        {
            if(_dadosDeAlunos[i].Nota > melhorAluno.Nota) melhorAluno = _dadosDeAlunos[i];
        }
        return melhorAluno;
    }
    //metodo que nao recebe e nao retorna nada
    private static void mandaMensagemLegalNaTela()
    {
        System.out.println("Mensagem legal");
    }
    //metodo que retorna um inteiro, e recebe um inteiro
    private static int calculaFatorial(int _nFatorial)
    {
        int resultado = 1;
        
        while(_nFatorial > 1)
        {
            resultado *= _nFatorial--; //n! = 6 -> 6*5*4*3*2;
        }
        //calculaFatorial(0); recursão = chamar o metodo dentro dele mesmo
        return resultado;
    }
    //sobrecarga de metodos
    private static int calculaFatorial()
    {
        int resultado = 1;
        int nFatorial = 10;
        while(nFatorial > 1)
        {
            resultado *= nFatorial--; //n! = 6 -> 6*5*4*3*2;
        }
        //calculaFatorial(0); recursão = chamar o metodo dentro dele mesmo
        return resultado;
    }
    public static void main(String[] args)
    {
        //-----estrutura de dados-----//
        //Array com capacidade para 10 numeros inteiros;
        int[] arrayDeInteiros = new int[10]; //indice 0~9
        arrayDeInteiros[0] = 1;
        arrayDeInteiros[1] = 11230;
        arrayDeInteiros[2] = 1420;
        arrayDeInteiros[3] = 1042;
        arrayDeInteiros[4] = 1042;
        arrayDeInteiros[5] = 1022;
        arrayDeInteiros[6] = 103453;
        arrayDeInteiros[7] = 1450;
        arrayDeInteiros[8] = 1044;
        arrayDeInteiros[9] = 10;
        System.out.println(arrayDeInteiros[9]); //retorna 10
        
        //array de strings com tamanho determinado em tempo de execucao         
        String[] arrayDeStrings;
        if(true)
        {
            arrayDeStrings = new String[30];
        }
        else
        {
            arrayDeStrings = new String[1];
        }
        System.out.println(arrayDeStrings[0]);
        
        //Declaracao de um array de inteiros ja adicionando seus valores
        int[] arrayDeInteirosComValores = {10, 31, 454, 45};
        
        //selecionanado elementos de um array
        if(arrayDeInteirosComValores[0] == 10) System.out.println("o elemento 0 é igual a 10!");
        
        //Descobrindo o tamanho de um array
        System.out.println(arrayDeInteirosComValores.length + " é o tamanho do array!!");
        
        //percorrendo um array
        for(int indiceDoArray = 0; indiceDoArray < arrayDeInteirosComValores.length; indiceDoArray++)
        {
            System.out.println("posicao "+indiceDoArray+" do array vale "+arrayDeInteirosComValores[indiceDoArray]);
        }     
        
        //arraylist precisa de import java.util.List;
        List<Integer> arrayList = new  ArrayList<Integer>(); //quero adicionar 4, 5, 6, 7
        for(int indice = 0; indice < 4; indice++)
        {
            arrayList.add(indice + 4); //adiciona um bloco para um array com o valor 12
        } 
        //arrayList = {4,5,6,7}
        if(true)//quero aidcionar mais o 8
        {
            arrayList.add(8);
        }
        //arrayList = {4, 5, 6, 7, 8}
        
        for(int index = 0; index < arrayList.size(); index++)
        {
            if(arrayList.get(index) == 4) arrayList.remove(index);
        }
        //arrayList = {5,6,7}
        //-----estrutura de dados-----//
        
        //-----funcoes-----//
        System.out.println("fatorial de 5 = "+ calculaFatorial(5));
        calculaFatorial(); //chama a sobrecarga do metodo que nao recebe parametro
        mandaMensagemLegalNaTela();
        //-----funcoes-----//
        
        //-----Tipos Abstratos-----//
        DadosDoAluno[] arrayDeDados = new DadosDoAluno[5];
        
        arrayDeDados[0] = new DadosDoAluno("Carlos", 6);
        arrayDeDados[1] = new DadosDoAluno("Caio", 5);
        arrayDeDados[2] = new DadosDoAluno("Laura", 2);
        arrayDeDados[3] = new DadosDoAluno("Bruna", 7);
        arrayDeDados[4] = new DadosDoAluno("Joao", 8);
        
        DadosDoAluno melhorAluno = pegaMelhorAluno(arrayDeDados);
        System.out.println("Melhor aluno: "+melhorAluno.Nome);
        //percorre  os arrays e testa quem tem nota maior
        //-----Tipos Abstratos-----//
    }
}
