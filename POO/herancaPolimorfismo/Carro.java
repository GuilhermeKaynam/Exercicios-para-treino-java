package herancaPolimorfismo;


//a palavra extends é para herdar as caracteristicas de Transporte
public class Carro extends Transporte {

	private int roda;
	private String placa;
	private int chassi;

	// o this é a classe local e o super é a classe mãe.

	public Carro(String nome, int capacidade, int velocidade, int roda, String placa, int chassi) {
		super(nome, capacidade, velocidade);
		this.roda = roda;
		this.placa = placa;
		this.chassi = chassi;
	}

	public int getRoda() {
		return roda;
	}

	public void setRoda(int roda) {
		this.roda = roda;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	
	//usar o Override para realizar a sobrescrita (usar algo que ja tem e sobrescrever)
	@Override
	public void visualizar() {
     super.visualizar();
		System.out.println("Roda: " + this.roda);
		System.out.println("Número de placa: " + this.placa);
		System.out.println("Chassi " + this.chassi);
		
	}

}
