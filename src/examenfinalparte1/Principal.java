package examenfinalparte1;

public class Principal {

   public static void metodo(int x,int x1){
   
   Imprimir(x+x1);
   
   }
   
   public static void metodo(int x){
   
   metodo(x,x);
   
   }
   
   public static void metodo(){
   
   Imprimir(-1);
   
   }
    
    public static void Imprimir(int valor){
        System.out.println("El resultado es:"+valor);
    
    }
}
