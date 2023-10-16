package ExemplosJava;

public class OperadoresLogicosExemplo {
    public static void main(String[] args) {
        boolean ehEstudante = true;
        boolean temNotaBoa = false;

        boolean podeParticipar = ehEstudante && temNotaBoa;
        boolean precisaMelhorar = ehEstudante || temNotaBoa;
        boolean naoEhEstudante = ! ehEstudante;

        System.out.println("Pode Participar: " + podeParticipar);
        System.out.println("Precisa Melhorar: " + precisaMelhorar);
        System.out.println("Não é estudante: " + naoEhEstudante);
    }
}
