public class Utenti {
    private String nome;
    private String cognome;

    public Utenti(String nome,String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString(){
        String output = "{";
        output += "\"nome\":\"" + nome + "\",";
        output += "\"cognome\":\"" + cognome + "\"";
        output += "}";
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
        Utenti utente = (Utenti)(obj);
        return nome.equals(utente.nome) && cognome.equals(utente.cognome);
    }
}