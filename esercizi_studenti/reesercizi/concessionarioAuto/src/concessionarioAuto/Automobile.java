package concessionarioAuto;

public class Automobile {
	private String marca;
	private String nome;
	private int cilindrata;
	private int capacitaSerbatoio;
	private int numeroChilometri;

	public Automobile() {
		super();
	}

	public Automobile(String marca, String nome, int cilindrata, int capacitaSerbatoio, int numeroChilometri) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.cilindrata = cilindrata;
		this.capacitaSerbatoio = capacitaSerbatoio;
		this.numeroChilometri = numeroChilometri;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getCapacitaSerbatoio() {
		return capacitaSerbatoio;
	}

	public void setCapacitaSerbatoio(int capacitaSerbatoio) {
		this.capacitaSerbatoio = capacitaSerbatoio;
	}

	public int getNumeroChilometri() {
		return numeroChilometri;
	}

	public void setNumeroChilometri(int numeroChilometri) {
		this.numeroChilometri = numeroChilometri;
	}

	public void calcoloAutonomia() {

	}
}