
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(1123, 1337);
		primeiraConta.deposita(200);
		System.out.println("Primeira conta - Saldo: " + primeiraConta.getSaldo());

		primeiraConta.deposita(100);
		primeiraConta.setAgencia(146);
		System.out.println("Primeira conta - Valor recebido: " + 100d);
		System.out.println("Primeira conta - Saldo: " + primeiraConta.getSaldo());
		System.out.println("Primeira conta - Agência: " + primeiraConta.getAgencia());
		System.out.println("Primeira conta - Número: " + primeiraConta.getNumero());

		Conta segundaConta = new Conta(1123, 1338);
		segundaConta.deposita(300);
		System.out.println("Segunda conta - Saldo: " + segundaConta.getSaldo());
		System.out.println("Segunda conta - Agência: " + segundaConta.getAgencia());
		System.out.println("Segunda conta - Número: " + segundaConta.getNumero());

		segundaConta.setAgencia(146);
		System.out.println("Segunda conta - Agência alterada para: " + 146);
		System.out.println("Segunda conta - Agência: " + segundaConta.getAgencia());

		if (primeiraConta == segundaConta)
			System.out.println("São a mesma conta!");
		else
			System.out.println("São contas diferentes!");

		System.out.println("Referência primeira conta: " + primeiraConta);
		System.out.println("Referência segunda conta: " + segundaConta);
	}

}
