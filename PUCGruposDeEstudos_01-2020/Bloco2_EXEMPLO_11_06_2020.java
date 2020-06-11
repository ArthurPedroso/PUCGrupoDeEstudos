import java.util.*;

/**
 * 
 */
public class Bloco2_EXEMPLO_11_06_2020
{
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
    private static void renderizaCanvas(List<Character> _charDosObjetos, List<Integer> _xPosList, List<Integer> _yPosList)
    {
        String buffer = "";
        char[][]canvas = new char[10][10];
        
        limpaTerminal();
        
        for(int i = 0; i < _charDosObjetos.size(); i++)
        {
            canvas[_yPosList.get(i)][_xPosList.get(i)] = _charDosObjetos.get(i);
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
    private static void adicionaObjeto(List<Character> _charDosObjetos, List<Integer> _xPosList, List<Integer> _yPosList, char _doObjeto, int _xPos, int _yPos)
    {
        _charDosObjetos.add(_doObjeto);
        _xPosList.add(_xPos);
        _yPosList.add(_yPos);
    }
    public static void main(String[] args)
    {
        List<Character> charListDosObjetos = new ArrayList<Character>();
        List<Integer> xPosList = new ArrayList<Integer>();
        List<Integer> yPosList = new ArrayList<Integer>();
        
        int posXDoObjetoTeste = 0;
        
        while(true)
        {
            adicionaObjeto(charListDosObjetos, xPosList, yPosList, 'X', (posXDoObjetoTeste++) % 10, 5);
            adicionaObjeto(charListDosObjetos, xPosList, yPosList, 'Y', (posXDoObjetoTeste) % 10, 6);
            
            
            renderizaCanvas(charListDosObjetos, xPosList, yPosList);
            
            charListDosObjetos.clear();
            xPosList.clear();
            yPosList.clear();
        }        
    }
}
