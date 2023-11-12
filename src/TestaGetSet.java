
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia(1123);
		conta.setNumero(1337);
		System.out.println("Conta - Saldo: " + conta.getSaldo());
		System.out.println("Conta - Agência: " + conta.getAgencia());
		System.out.println("Conta - Número: " + conta.getNumero());
	}
}
