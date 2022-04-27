package br.com.digix.modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conta {
    private static int id;
    private double saldo;
    private String tipo;
    private String numero;
    private String agencia;
    private double limite;
    private boolean ativa;
    private LocalDateTime dataDeAbertura;
    private Cliente cliente;
    private static int contador;

    public Conta(Cliente cliente, String agencia, String numero, String tipo) {
        Conta.id++;
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0;
        this.limite = 0;
        this.ativa = true;
        this.dataDeAbertura = LocalDateTime.now();
        Conta.contador++;
    }

    public Conta(Cliente cliente, String agencia, String numero, String tipo, double limite) {
        this(cliente, agencia, numero, tipo);
        this.limite = limite;
    }

    public static int getId() {
        return id;
    }

   public boolean sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        if (novoSaldo >= 0) {
            this.saldo = novoSaldo;
            return true;
        } else {
            mensagemSaldoInsuficiente();
            return false;
        }
    }

    private void mensagemSaldoInsuficiente() {
        System.out.println("Saldo Insuficiente!");
    }

    public void depositar(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo += quantidade;
        }
    }

    public void pix(double valorPIX, Conta contaDestino) {
        if (this.sacar(valorPIX)) {
            contaDestino.depositar(valorPIX);
        } else {
            mensagemSaldoInsuficiente();
        }
    }

    public double getRendimentoMensal(double taxa) {
        return this.saldo * taxa;
    }

    public void aumentarLimite(double valor) {
        this.limite += valor;
    }

    public static int getTotalDeContas() {
        return Conta.contador;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataDeAbertura() {
        return dataDeAbertura;
    }

    public double getLimite() {
        return limite;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo + this.getLimite();
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    @Override
    public String toString() {
        return this.cliente + "\n" +
                "AG: " + this.agencia + "\n" +
                "CC: " + this.numero + "\n" +
                "Data de abertura: " + this.dataDeAbertura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Saldo: R$ " + String.format("%.2f", this.saldo);
    }

}
