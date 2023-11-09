
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta - Saldo: " + primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println("Primeira conta - Valor recebido: " + 100d);
		System.out.println("Primeira conta - Saldo: " + primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Segunda conta - Saldo: " + segundaConta.saldo);

	}

}
