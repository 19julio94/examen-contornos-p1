package examenfinalparte1;

public class Principal {
/**
 * 
 * Suma los parametros y los imprime por pantalla
 * @param x
 * @param x1 
 */
   public static void metodo(int x,int x1){
   
   Imprimir(x+x1);
   
   }
   /**
    * Multiplica por 2 el parametro y a continuacion lo muestra por pantalla
    * @param x 
    */
   public static void metodo(int x){
   
   metodo(x,x);
   
   }
   /**
    * imprime por pantalla el numero -1
    */
   public static void metodo(){
   
   Imprimir(-1);
   
   }
   
   
    
    /**
     * Metodo que imprime el resultado recibe una variable de tipo int llamado valor que es el resultado de las otras operaciones
     * @param valor 
     */
    public static void Imprimir(int valor){
        System.out.println("El resultado es:"+valor);
    
    }
}
