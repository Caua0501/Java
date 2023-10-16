package ExemplosJava;

public class EscopoVisibilidadeExemplo {
    private int variavelPrivada = 10;
    public int variavelPublica = 20;

    public void metodoExemplo() {
        int variavelLocal = 30;
        System.out.println("Variável Privada: " + variavelPrivada);
        System.out.println("Variável Pública: " + variavelPublica);
        System.out.println("Variável Privada: " + variavelLocal);
    }

    public static void main(String[] args) {
        EscopoVisibilidadeExemplo exemplo = new EscopoVisibilidadeExemplo();
        exemplo.metodoExemplo();
        System.out.println("Variável Pública: " + exemplo.variavelPublica);
    }
}
