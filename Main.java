package java_projetos.sistema_banco;

public class Main {

	public static void main(String[] args) {
		Cliente junior = new Cliente();
		junior.setNome("Junior");

		Cliente abreu = new Cliente();
		abreu.setNome("Abreu");

		Cliente juliana = new Cliente();
		juliana.setNome("Juliana");
		
		Conta cc = new ContaCorrente(junior);
		Conta poupanca = new ContaPoupanca(abreu);
		Conta c1 = new ContaCorrente(juliana);

		cc.depositar(100);
		poupanca.depositar(200);
		System.out.println();
		cc.transferir(90, poupanca);
		System.out.println();
		System.out.println();
		poupanca.transferir(290,c1);
		c1.sacar(285);
		System.out.println();
	}

}
