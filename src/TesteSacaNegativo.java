
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(1123, 1337);
		conta.deposita(100);
		System.out.println("Saque realizado: " + conta.saca(101));
		System.out.println("Conta - Saldo: " + conta.getSaldo());
	}
}
