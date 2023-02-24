
package labs;

import java.util.*;


public class Labs {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[], nElementos, seleccion=0;
        
        
        System.out.println("Ingrese el numero de elementos");
        
        nElementos = entrada.nextInt();
        
        arreglo = new int [nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            
            arreglo[i] = (int)(Math.random() * (100+1));
            
        }
        
      
    }
    public static void VarianzaYDesviacion (int arreglo [], int r)
    {
        double promedio = 0, sumatoria = 0;
        
        //CALCULO DE PROMEDIO
        for (int i = 0; i < r; i++)
            promedio +=  arreglo [i];
        promedio /=r;
        
        for (int i = 0; i < r; i++)
            sumatoria +=  Math.pow(arreglo[i] - promedio, 2);
        
        
    }
    
    
    public  static void  MediayMediana (int arreglo [], int nElementos)
    {
        int media, mediana;
        int aux = 0;
        media = 0;
        for (int i = 0; i < nElementos; i++ )
          media = arreglo [i] + media;
        media = media / nElementos;
       
        for(int i = 0; i < nElementos; i++)
        {
           for (int j = 0; j < nElementos; j++)
           {
               if(arreglo[j] > arreglo[i])
               {  aux = arreglo[j];
                  arreglo[j] = arreglo[i];
                  arreglo[i] = aux;
               }
           }
        }
}}
