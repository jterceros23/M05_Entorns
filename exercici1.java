public class exercici1 {
   
   
    public static void Main(String[] args) 
    {
    
        //Declaracion
         int [] array;
     
         // generamos el espacio (el contenedor)
         array = new int [6];
     
     
     //Para generar el random 
     
         
         int max=100;
     
         for (int i=0; i< 10; i++) {
            
          array[i] = (int) Math.random() * ((max-min + 1)) + min;
     
          System.out.println (array[i]);
     
         }
      
     
         }
     
         //hemos hecho un cambio
     }
     

