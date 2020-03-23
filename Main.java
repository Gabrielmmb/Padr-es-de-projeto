package ifpb.edu.br;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();
        Singleton singleton3 = Singleton.getInstancia();
        Singleton singleton4 = Singleton.getInstancia();
        System.out.println(singleton.Cont());
    }
}
