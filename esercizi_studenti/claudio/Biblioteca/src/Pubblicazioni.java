public abstract class Pubblicazioni {
    private String titolo;
    private int annoPubblicazione;

    public Pubblicazioni(String titolo,int annoPubblicazione){
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    @Override
    public String toString(){
        String output = "\"titolo\":\"" + titolo + "\",";
        output += "\"annoPubblicazione\":" + annoPubblicazione + ",";
        return output;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(!getClass().getName().equals(obj.getClass().getName())){
            return false;
        }
        Pubblicazioni pubblicazione = (Pubblicazioni)(obj);
        return titolo.equals(pubblicazione.titolo) && annoPubblicazione == pubblicazione.annoPubblicazione;
    }
}