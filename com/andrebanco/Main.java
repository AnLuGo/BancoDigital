
public class Main {

    public static void main(String[] args) {
        Cliente andre = new Cliente();
        andre.setNome("Andre");
        andre.setCpf("111.222.333-00");

        Conta corrente = new ContaCorrente(andre);
        Conta poupanca = new ContaPoupanca(andre);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
    
}
