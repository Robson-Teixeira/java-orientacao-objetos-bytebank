
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		System.out.println("Primeira conta - Saldo: " + primeiraConta.getSaldo());

		Conta segundaConta = primeiraConta;
		System.out.println("Segunda conta - Saldo: " + segundaConta.getSaldo());

		segundaConta.deposita(100);
		System.out.println("Segunda conta - Saldo: " + segundaConta.getSaldo());

		System.out.println("Primeira conta - Saldo: " + primeiraConta.getSaldo());

		if (primeiraConta == segundaConta)
			System.out.println("São a mesma conta!");
		else
			System.out.println("São contas diferentes!");

		System.out.println("Referência primeira conta: " + primeiraConta);
		System.out.println("Referência segunda conta: " + segundaConta);
	}
}
