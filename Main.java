public class Main {

    public static void main(String[] args) {
        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
    
}
