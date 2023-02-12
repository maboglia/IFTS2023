public class Auto implements Cloneable {

    private String marca;
    private String nome;
    private int cilindrata;
    private double capacitaSerbatoio;
    private double kmPerLitro;

    public Auto(String marca, String nome, int cilindrata, double capacitaSerbatoio, double kmPerLitro) {
        this.marca = marca;
        this.nome = nome;
        this.cilindrata = cilindrata;
        this.capacitaSerbatoio = capacitaSerbatoio;
        this.kmPerLitro = kmPerLitro;
    }
    public int calcolaAutonomia(){
        return (int)(capacitaSerbatoio * kmPerLitro );
    }

    @Override
    public Auto clone() throws CloneNotSupportedException {
        return (Auto) super.clone();
    }

    public Auto clonaCilindrata(int nuovaCilindrata) throws CloneNotSupportedException {
        Auto clone = this.clone();
        clone.cilindrata = nuovaCilindrata;
        return clone;
    }
}
