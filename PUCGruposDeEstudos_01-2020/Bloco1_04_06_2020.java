

/*
 *Doc codigo
 */
public class Bloco1_04_06_2020
{
    public static void main(String[] args)
    {
        //comenatarios//
        
        //camelCase vs snake_case
        
        //-----variaveis-----//        
        
        //Número inteiro. tem precisão de (32 bits) 
        int inteiro = 0;
        //byte short long//
        
        //Número que pode conter casas decimais. tem precisão de (32 bits)
        float pontoFlutuante = 12.4f; //2345243647568546574564657845363456345668568.54680f;
        
        //Mesma coisa que o float só que com o dobro da precisão (64 bits)
        double doubleFloat = 2345.24364756854657456465784536345634566856854680;
        
        //Booleanos aceitam só dois valores true ou false
        boolean booleano = false;
        
        //Characteres 
        char character = 'A';
        
        //String 
        String conjuntoDeChars = "eu não gosto muito do editor do bluej";
        
        //System.out.println("println imprime coisas");
        
        //-----variaveis-----//
        
        //-----Operadores----//
        
        //Soma
        int somaX = 2;
        int somaY = 3;
        somaX = somaX + somaY;
        somaX += somaY;
        
        //Subtracao
        float floatSubX = 5.3544f;
        int intSubZ = 5;
        
        floatSubX = floatSubX - intSubZ;    
        //System.out.println(floatSubX);
        
        //Multiplicacao
        int multX = 4;
        int multY = 3;
        
        float resultadoMult = multX * multY;
        
        //Divisao
        double divX = 5;
        double divY = 2.;
        
        double resultadoDiv = divX / divY;
        //System.out.println(resultadoDiv);
        
        //Resto
        int restX = 9;
        int restY = 2;
        int resultadoRest = restX % restY;
        
        //Incremento e decremento
        int inc = 3;
        inc++;//=4
        
        int dec = 5;
        dec--;//=4
        
        //Operadores logicos
        
        //and só fica true se os dois operandos forem true
        boolean andX = true;
        boolean andY = false;
        boolean resultBool;
        resultBool = andX && andY;
        
        //or só fica false se os operandos forem false  
        boolean orX = false;
        boolean orY = true;
        resultBool = orX || orY;
        
        //not inverte o booleano
        resultBool = !false;
        
        //Operadores de comparacao
        int xComp = 10;
        int yComp = 5;
        
        resultBool = xComp == yComp; //um é comparavel ao outro
        resultBool = xComp != yComp; //um não é comparavel ao outro
        resultBool = xComp > yComp; //um é maior que o outro
        resultBool = xComp < yComp; //um é menor que o outro
        resultBool = xComp >= yComp; //x é maior ou igual que y
        resultBool = xComp <= yComp; //x é menor ou igual que y     
        
        //-----Operadores----//
        
        //----Condicionais---//
        
        //if, else, else if
        boolean condicao1 = false;
        boolean condicao2 = true;
        boolean condicao3 = false;
        
        if(condicao1)
        {
            if(condicao3)
            {
                //1
            }
            else
            {
               //2 
            }
        }
        else if(condicao2)
        {
            if(condicao3)
            {
                //3
            }
            else
            {
                //4
            }
        }    
        else
        {
            //5
        }
        
        //switch
        int numeroParaSwitch = 5;
        switch(numeroParaSwitch)
        {
            case 2:
            System.out.println("o numero é 2");
                break;
            case 5:
            System.out.println("o numero é 5");
                break;
            case 10:
            //System.out.println("o numero é 10");
                break;
            default:
            //awdawdawdwadw
                break;
        }
        
        //while
        boolean condicaoWhile = true;
        while(!condicaoWhile) // false == false
        {
            System.out.println("to dentro do while >:)");            
        }
        
        do
        {
            System.out.println("to dentro do do while >:)");    
        }while(!condicaoWhile);
        
        
        int indice = 0;
        while(indice < 10)
        {
            indice++;
        }
        //for
        for(int i = 0; i < 10; i++)
        {            
            System.out.println("to dentro do for >:| "+i);
            if(i == 5) break;
            //fodase
            System.out.println("to dentro do for >:O "+i);  
        }
        
        //comandos de loop: continue, break;
        for(int i = 0; i < 10; i++)
        {            
            System.out.println("to dentro do for >:| "+i);
            if(i == 5) break; //ejeta
            //fodase
            System.out.println("to dentro do for >:O "+i);  
        }
        for(int i = 0; i < 10; i++)
        {            
            System.out.println("to dentro do for >:| "+i);
            if(i == 5) continue; //skipa
            //fodase
            System.out.println("to dentro do for >:O "+i);  
        }
        //----Condicionais---//
    }
}
