
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1123, 1337);

		conta.setAgencia(-50);
		conta.setNumero(-330);

		System.out.println("Conta - Agência: " + conta.getAgencia());
		System.out.println("Conta - Número: " + conta.getNumero());

		Conta conta2 = new Conta(1123, 1338);
		System.out.println("Conta 2 - Agência: " + conta2.getAgencia());
		System.out.println("Conta 2 - Número: " + conta2.getNumero());

		Conta conta3 = new Conta(1123, 1339);
		System.out.println("Conta 3 - Agência: " + conta3.getAgencia());
		System.out.println("Conta 3 - Número: " + conta3.getNumero());

		System.out.println("Total de contas: " + Conta.getTotal());
	}
}
