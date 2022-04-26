import java.time.LocalDate;
import java.time.Month;

public class TestaConta {
    public static void main(String[] args) {
        LocalDate dataNascimentLocalDate = LocalDate.of(2003, Month.DECEMBER, 8);
        Cliente cliente = new Cliente("Enzo Gabriel Barbosa Franco", "123456", dataNascimentLocalDate, new Endereco());

        Conta contaCorrente = new Conta(cliente, "0001", "12345-6", "Conta Corrente");
        contaCorrente.depositar(100);
        System.out.println(Conta.getTotalDeContas());
        

        double rendimentoAbril = contaCorrente.calcularRendimentoMensal(0.1);
        System.out.println("O rendimento de abril é: R$ " + rendimentoAbril);

        System.out.println(contaCorrente.toString());

        Conta contaPoupança = new Conta(cliente, "0002", "12345-7", "Conta Poupança");
        contaPoupança.depositar(100);
        System.out.println(Conta.getTotalDeContas());
    }
}
    