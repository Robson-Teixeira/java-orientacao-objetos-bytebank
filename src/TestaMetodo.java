
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.deposita(50);

		System.out.println("Saldo: " + conta.getSaldo());

		boolean conseguiuRetirar = conta.saca(20);
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta conta2 = new Conta();
		conta2.deposita(1000);

		boolean sucessoTransfrencia = conta2.transfere(100, conta);

		if (sucessoTransfrencia)
			System.out.println("Transferência com sucesso");
		else
			System.out.println("Faltou dinheiro");

		System.out.println("Conta 1 - Saldo: " + conta.getSaldo());
		System.out.println("Conta 2 - Saldo: " + conta2.getSaldo());

		// conta.cliente = "Robson Teixeira";
		// System.out.println("Titular: " + conta.cliente);
	}
}
