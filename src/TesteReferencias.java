
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Primeira conta - Saldo: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Segunda conta - Saldo: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("Segunda conta - Saldo: " + segundaConta.saldo);

		System.out.println("Primeira conta - Saldo: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta)
			System.out.println("São a mesma conta!");
		else
			System.out.println("São contas diferentes!");

		System.out.println("Referência primeira conta: " + primeiraConta);
		System.out.println("Referência segunda conta: " + segundaConta);
	}
}
