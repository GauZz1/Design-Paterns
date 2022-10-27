package Singleton;

class Incremental {
    private static int count = 0;
    private static int numero;

    private static Incremental incremental;

    public static Incremental getIncremental() {
        if(incremental == null) {
            incremental = new Incremental();
            numero = ++count;
        }


        return incremental;
    }

    public String toString() {
        return "Incremental " + numero;
    }
}

public class TesteIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Incremental inc = new Incremental();
            Incremental.getIncremental();
            System.out.println(inc);
        }
    }
}
