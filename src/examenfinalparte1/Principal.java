package examenfinalparte1;

public class Principal {

    int i;

    public Principal(int j, int m) {
        i = suma(j, m);
        print();
    }

    public Principal(int j) {
        i = suma(j, j);
        print();
        
    }

    public Principal() {
        i = -1;
        print();
    }

    public int suma(int x, int x1) {
        return x + x1;
    }
    
    public void print(){
        System.out.println("Es:"+this.i);
    
    }
}
