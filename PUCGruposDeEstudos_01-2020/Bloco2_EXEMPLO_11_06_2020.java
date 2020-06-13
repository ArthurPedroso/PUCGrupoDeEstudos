import java.util.*;

/**
 * 
 */
public class Bloco2_EXEMPLO_11_06_2020
{
    private static class DadosDeObjeto
    {
        public char CharDoObjeto;
        public int XPos;
        public int YPos;
        public DadosDeObjeto(char _CharDoObjeto, int _XPos, int _YPos)
        {
            CharDoObjeto = _CharDoObjeto;
            XPos = _XPos;
            YPos = _YPos;
        }
    }
    //Funcao void sem parametro.  Não retorna nada e não recebe nada
    private static void limpaTerminal()
    {
        System.out.println('\u000C');
    }
    //Funcao void com parametro. Não retorna nada, mas recebe uma string
    private static void print(String _textToPrint)
    {
        System.out.println(_textToPrint);
    }
    //Funcao void com parametro. Não retorna nada, mas recebe um array de chars e arrays de inteiros para a posicao x e y dos objetos.
    private static void renderizaCanvas(List<DadosDeObjeto> _dadosDeObjeto)
    {
        String buffer = "";
        char[][]canvas = new char[10][10];
        
        limpaTerminal();
        
        for(int i = 0; i < _dadosDeObjeto.size(); i++)
        {
            canvas[_dadosDeObjeto.get(i).XPos][_dadosDeObjeto.get(i).YPos] = _dadosDeObjeto.get(i).CharDoObjeto;
        }
        
        for(int x = 0; x < canvas.length; x++)
        {
            for(int y = 0; y < canvas.length; y++)
            {
                if(canvas[x][y] == '\u0000') buffer += '.';
                else buffer += canvas[x][y];
            }
            buffer += '\n';
        }
        
        print(buffer);   
        
        
        try
        {
            PausaPor33MilSec();
        }catch(InterruptedException exception)
        {
        }
    }
    private static void PausaPor33MilSec() throws InterruptedException
    {        
        Thread.sleep(66);//pausa por 33 milisec
    }
    private static void adicionaObjeto(List<DadosDeObjeto> _dadosDeObjeto, char _doObjeto, int _xPos, int _yPos)
    {
        _dadosDeObjeto.add(new DadosDeObjeto(_doObjeto, _xPos, _yPos));
    }
    public static void main(String[] args)
    {
        
        List<DadosDeObjeto> dadosDeObjeto = new ArrayList<DadosDeObjeto>();
        
        int posXDoObjetoTeste = 0;
        
        while(true)
        {
            adicionaObjeto(dadosDeObjeto, 'X', (posXDoObjetoTeste++) % 10, 5);
            adicionaObjeto(dadosDeObjeto, 'Y', (posXDoObjetoTeste) % 10, 6);
            
            
            renderizaCanvas(dadosDeObjeto);
            
            dadosDeObjeto.clear();
        }        
    }
}
