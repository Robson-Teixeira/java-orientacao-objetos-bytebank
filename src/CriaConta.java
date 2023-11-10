
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta - Saldo: " + primeiraConta.saldo);

		primeiraConta.saldo += 100;
		primeiraConta.agencia = 146;
		System.out.println("Primeira conta - Valor recebido: " + 100d);
		System.out.println("Primeira conta - Saldo: " + primeiraConta.saldo);
		System.out.println("Primeira conta - Agência: " + primeiraConta.agencia);
		System.out.println("Primeira conta - Número: " + primeiraConta.numero);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Segunda conta - Saldo: " + segundaConta.saldo);
		System.out.println("Segunda conta - Agência: " + segundaConta.agencia);
		System.out.println("Segunda conta - Número: " + segundaConta.numero);

		segundaConta.agencia = 146;
		System.out.println("Segunda conta - Agência alterada para: " + 146);
		System.out.println("Segunda conta - Agência: " + segundaConta.agencia);

		if (primeiraConta == segundaConta)
			System.out.println("São a mesma conta!");
		else
			System.out.println("São contas diferentes!");

		System.out.println("Referência primeira conta: " + primeiraConta);
		System.out.println("Referência segunda conta: " + segundaConta);
	}

}
