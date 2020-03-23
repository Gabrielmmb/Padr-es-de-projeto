package ifpb.edu.br;

public class Singleton {
    protected static Singleton instancia;
    protected static int cont ;
    protected Singleton() {
    }

    public static Singleton getInstancia() {
        cont++;
        if (instancia == null)
            instancia = new Singleton();
        return instancia;

    }

    public int Cont() {
        return cont;
    }
}
