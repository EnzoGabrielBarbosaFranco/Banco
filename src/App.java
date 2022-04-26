public class App {
    public static void main(String[] args) throws Exception {
        /*
        Conta conta = new Conta();
        conta.agencia = "08123";
        conta.ativa = true;
        conta.tipo = "Conta Corrente";
        conta.limite = 1000d;
        conta.depositar(10);
        conta.numero = "12084";

        Conta novaConta = new Conta();
        novaConta.agencia = "08124";
        novaConta.ativa = true;
        novaConta.tipo = "Conta Poupança";
        novaConta.limite = 1010d;
        novaConta.depositar(11d);
        novaConta.limite = 1010d;
        novaConta.numero = "12085";

        conta.pix(90, novaConta);

        System.out.println("Saldo na conta é: " + conta.saldo);
        System.out.println("Saldo na nova conta é: " + novaConta.saldo);

        System.out.println("Tenho " + conta.saldo);
        conta.sacar(300);
        System.out.println("Depois do saque eu tenho " + conta.saldo);

        Cliente cliente = new Cliente();
        cliente.nomeCompleto = "Enzo Eletropau";
        cliente.cpf = "08828922";
        cliente.dataNascimento = "08/12/2003";
        Endereco endereco = new Endereco();
        endereco.cep = "67676767";
        endereco.rua = "Rua das Cachoeiras";
        endereco.bairro = "Centro";
        endereco.complemento = "Logo Ali";
        endereco.numero = "139";
        cliente.endereco = endereco;
        conta.cliente = cliente;
        
        System.out.println("Nome do cliente é: " + conta.cliente.nomeCompleto);
        System.out.println("O seu saldo é: " + String.format("%.2f", conta.saldo));
        System.out.println("Seu CPF é: " + conta.cliente.cpf);
        System.out.println("Sua data de nascimento é: " + conta.cliente.dataNascimento);
        System.out.println("Seu Cep é: " + conta.cliente.endereco.cep);
        System.out.println("Sua rua é: " + conta.cliente.endereco.rua);
        System.out.println("Seu bairro é: " + conta.cliente.endereco.bairro);
        System.out.println("Seu complemento é: " + conta.cliente.endereco.complemento);
        System.out.println("O número da sua residência é: " + conta.cliente.endereco.numero);
        
        /*System.out.println("O nome do clienet é: " + conta.cliente.nomeCompleto);
        System.out.println("O seu saldo é: R$" + String.format("%.2f", conta.saldo));
        System.out.println("O número do seu CPF é: " + cliente.cpf);
        System.out.println("Sua data de nascimento é: " + cliente.dataNascimento);
        System.out.println("Seu endereço é: " + cliente.endereco);
        */

    }
}
