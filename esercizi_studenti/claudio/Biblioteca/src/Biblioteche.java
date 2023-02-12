import java.util.ArrayList;

public class Biblioteche {
    private ArrayList<Prestiti> elencoPrestiti;

    public Biblioteche(){
        elencoPrestiti = new ArrayList<>();
    }

    public ArrayList<Prestiti> getElencoPrestiti() {
        return elencoPrestiti;
    }

    public void setElencoPrestiti(ArrayList<Prestiti> elencoPrestiti) {
        this.elencoPrestiti = elencoPrestiti;
    }

    public boolean aggiungiPrestito(Prestiti prestito){
        return elencoPrestiti.add(prestito);
    }

    public boolean eliminaPrestito(Prestiti prestito){
        return elencoPrestiti.remove(prestito);
    }

    public long periodoPiuLungoGiorni(Utenti utente,Pubblicazioni pubblicazione){
        ArrayList<Prestiti> elencoRidotto = new ArrayList<>();
        for(Prestiti prestito:elencoPrestiti){
            if(prestito.getPubblicazione().equals(pubblicazione) && prestito.getUtente().equals(utente)){
                elencoRidotto.add(prestito);
            }
        }
        long[] durate = new long[elencoRidotto.size()];
        int i = 0;
        for(Prestiti prestito:elencoRidotto){
            long durata = prestito.getFinePrestito().getTimeInMillis() - prestito.getInizioPrestito().getTimeInMillis();
            durate[i] = durata;
            i++;
        }
        long max = 0;
        for (int j = 0; j < durate.length; j++) {
            if(durate[j] > max){
                max = durate[j];
            }
        }
        return max / 1000 / 60 / 60 / 24;
    }

    public boolean prestitiInconsistenti(Pubblicazioni pubblicazione){
        ArrayList<Prestiti> elencoRidotto = new ArrayList<>();
        for(Prestiti prestito:elencoPrestiti){
            if(prestito.getPubblicazione().equals(pubblicazione)){
                elencoRidotto.add(prestito);
            }
        }
        for(int i = 0;i < elencoRidotto.size() - 1;i++){
            if(elencoRidotto.get(i).getFinePrestito().after(elencoRidotto.get(i+1).getInizioPrestito())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String output = "[";
        int i = 0;
        for (Prestiti prestito:elencoPrestiti) {
            output += prestito.toString();
            if(i < (elencoPrestiti.size() - 1)){
                output += ",";
            }
            i++;
        }
        output += "]";
        return output;
    }
}