import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    /**
     * Una biblioteca ha la necessità di tenere traccia dei prestiti dei libri e dei DVD in catalogo.
     * Ad ogni libro o DVD sarà quindi associata una sequenza di prestiti, ad ognuno dei quali
     * corrispondono la 1data di inizio prestito, la data di riconsegna, il nome e cognome dell'utente.
     * Inoltre, per i DVD occorrerà tenere traccia della durata, mentre per i libri occorrerà tenere
     * traccia del numero di pagine. Ad entrambi i tipi di supporti, infine, bisogna associare il titolo
     * e l'anno di pubblicazione. Il bibliotecario potrebbe essere interessato a calcolare il periodo più
     * lungo (in giorni) in cui un libro o un DVD è rimasto a prestito ad una persona. Occorre, infinte,
     * permettere al bibliotecario di controllare se nella lista di prestiti relativi ad un libro ad un
     * DVD esistano inconsistenze, ovvero se un prestito nella lista sia iniziato prima che un altro
     * prestito fosse concluso.
     */

    public static String stampaDateOre(Calendar dataOra){
        int giorno = dataOra.get(Calendar.DAY_OF_MONTH);
        int mese = dataOra.get(Calendar.MONTH) + 1;
        int anno = dataOra.get(Calendar.YEAR);
        int ore = dataOra.get(Calendar.HOUR_OF_DAY);
        int minuti = dataOra.get(Calendar.MINUTE);
        int secondi = dataOra.get(Calendar.SECOND);
        String output = "{";
        output += "\"giorno\":" + giorno + ",";
        output += "\"mese\":" + mese + ",";
        output += "\"anno\":" + anno + ",";
        output += "\"ore\":" + ore + ",";
        output += "\"minuti\":" + minuti + ",";
        output += "\"secondi\":" + secondi;
        output += "}";
        return output;
    }

    public static void main(String[] args) {
        Libri libro1 = new Libri("L'isola del tesoro",1998,30);
        Libri libro2 = new Libri("Peter pan",1995,65);
        Libri libro3 = new Libri("Pinocchio",1994,50);
        DVD dvd1 = new DVD("I promessi sposi",1976,240);
        DVD dvd2 = new DVD("Pinocchio",1965,120);
        DVD dvd3 = new DVD("Nuovo cinema paradiso",1976,180);
        Utenti utente = new Utenti("Antonio","Tassone");
        Calendar data1 = new GregorianCalendar();
        Calendar data2 = new GregorianCalendar();
        data2.add(Calendar.DAY_OF_MONTH,10);
        Calendar data3 = new GregorianCalendar();
        data3.add(Calendar.DAY_OF_MONTH,11);
        Calendar data4 = new GregorianCalendar();
        data4.add(Calendar.DAY_OF_MONTH,20);
        Calendar data5 = new GregorianCalendar();
        data5.add(Calendar.DAY_OF_MONTH,30);
        Calendar data6 = new GregorianCalendar();
        data6.add(Calendar.DAY_OF_MONTH,40);
        Calendar data7 = new GregorianCalendar();
        data7.add(Calendar.DAY_OF_MONTH,55);
        Calendar data8 = new GregorianCalendar();
        data8.add(Calendar.DAY_OF_MONTH,70);
        Calendar data9 = new GregorianCalendar();
        data9.add(Calendar.DAY_OF_MONTH,80);
        Calendar data10 = new GregorianCalendar();
        data10.add(Calendar.DAY_OF_MONTH,100);
        Calendar data11 = new GregorianCalendar();
        data11.add(Calendar.DAY_OF_MONTH,120);
        Calendar data12 = new GregorianCalendar();
        data12.add(Calendar.DAY_OF_MONTH,125);
        Prestiti prestito1 = new Prestiti(data1,data2,utente,libro1);
        Prestiti prestito2 = new Prestiti(data3,data4,utente,libro2);
        Prestiti prestito3 = new Prestiti(data5,data6,utente,libro3);
        Prestiti prestito4 = new Prestiti(data7,data8,utente,dvd1);
        Prestiti prestito5 = new Prestiti(data9,data10,utente,dvd2);
        Prestiti prestito6 = new Prestiti(data11,data12,utente,dvd3);
        Biblioteche biblioteca = new Biblioteche();
        biblioteca.aggiungiPrestito(prestito1);
        biblioteca.aggiungiPrestito(prestito2);
        biblioteca.aggiungiPrestito(prestito3);
        biblioteca.aggiungiPrestito(prestito4);
        biblioteca.aggiungiPrestito(prestito5);
        biblioteca.aggiungiPrestito(prestito6);
        System.out.println("Giorni di prestito più lunghi per utente e libro2: " + biblioteca.periodoPiuLungoGiorni(utente,libro2));
        System.out.println("Libro3 inconsistente: " + biblioteca.prestitiInconsistenti(libro3));
    }
}