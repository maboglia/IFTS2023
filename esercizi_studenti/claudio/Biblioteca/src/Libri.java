public class Libri extends Pubblicazioni{
    private int numeroPagine;

    public Libri(String titolo,int annoPubblicazione,int numeroPagine){
        super(titolo,annoPubblicazione);
        this.numeroPagine = numeroPagine;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString(){
        String output = "{";
        output += super.toString();
        output += "\"numeroPagine\":" + numeroPagine;
        output += "}";
        return output;
    }

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(!getClass().getName().equals(obj.getClass().getName())){
            return false;
        }
        Libri libro = (Libri)(obj);
        return numeroPagine == libro.numeroPagine;
    }
}