public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nomeCompleto = "Enzo Gabriel Barbosa Franco";

        Data hoje = new Data();
        hoje.dia = 25;
        hoje.mes = 4;
        hoje.ano = 2022;

        Conta contaCorrente = new Conta();
        contaCorrente.agencia = "0001";
        contaCorrente.numero = "12345-6";
        contaCorrente.ativa = true;
        contaCorrente.cliente = cliente;
        contaCorrente.dataDeAbertura = hoje;
        contaCorrente.limite = 300;
        contaCorrente.saldo = 100;
        contaCorrente.tipo = "Conta Corrente";

        double rendimentoAbril = contaCorrente.calcularRendimentoMensal(0.1);
        System.out.println("O rendimento de abril é: R$ " + rendimentoAbril);

        System.out.println(contaCorrente.recuperarDadosParaImpressao());

        Conta contaPoupança = new Conta();
        contaPoupança.agencia = "0002";
        contaPoupança.numero = "12345-7";
        contaPoupança.ativa = true;
        contaPoupança.cliente = cliente;
        contaPoupança.dataDeAbertura = hoje;
        contaPoupança.limite = 0;
        contaPoupança.saldo = 150;
        contaPoupança.tipo = "Poupança";

        if (contaCorrente == contaPoupança) {
            System.out.println("Contas iguais.");
        } else {
            System.out.println("Contas Diferentes.");
        }
    }
}
    