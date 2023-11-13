
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1123, 1337);

		conta.setAgencia(-50);
		conta.setNumero(-330);

		System.out.println("Conta - Agência: " + conta.getAgencia());
		System.out.println("Conta - Número: " + conta.getNumero());
	}
}
