
public class Auto {
	
	String marca;
	String nome;
	int cilindrata;
	double serbatoio;
	double kmLitro;
	
	public Auto(String marca, String nome, int cilindrata, double serbatoio, double kmLitro) {
		this.marca = marca;
		this.nome = nome;
		this.cilindrata = cilindrata;
		this.serbatoio = serbatoio;
		this.kmLitro = kmLitro;
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

	public double getSerbatoio() {
		return serbatoio;
	}

	public void setSerbatoio(double serbatoio) {
		this.serbatoio = serbatoio;
	}

	public double getKmLitro() {
		return kmLitro;
	}

	public void setKmLitro(double kmLitro) {
		this.kmLitro = kmLitro;
	}
	
	public double Autonomia() {
		System.out.print("Autonomia km = ");
		return  serbatoio*kmLitro;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", nome=" + nome + ", cilindrata=" + cilindrata + ", serbatoio=" + serbatoio
				+ ", kmLitro=" + kmLitro + "]";
	}
	
	
	
		
}