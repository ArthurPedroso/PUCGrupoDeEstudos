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
            resultado *= _nFatorial--;
        }
        return resultado;
    }
    public static void main(String[] args)
    {
        //-----estrutura de dados-----//
        //Array com capacidade para 10 numeros inteiros;
        int[] arrayDeInteiros = new int[10];
        
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
        //-----estrutura de dados-----//
        
        //-----funcoes-----//
        System.out.println("fatorial de 5 = "+ calculaFatorial(5));
        //-----funcoes-----//
    }
}
