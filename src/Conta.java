
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada: " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}

		return false;
	}

	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		}

		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agência não pode ser menor ou igual a 0!");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número não pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
