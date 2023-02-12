import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    /**
     * 0.3. Esercizio azienda di trasporti
     * Si supponga di voler progettare e implementare parte del sistema informativo di una azienda di trasporti
     * su rotaia. Per ogni treno occorrerà tenere traccia delle stazioni di fermata, della stazione di partenza
     * e di quella di arrivo, oltre che dei relativi orari. Occorre poi che ad ogni treno sia associato il numero
     * dei posti a sedere disponibili e il numero totale di chilometri percorsi. Nei treni espressi, infine,
     * è previsto anche un servizio ristorante, e anche per questo servizio è necessario tenere traccia del numero
     * di posti disponibili. Un utente di questo sistema informativo potrebbe essere interessato a determinare il
     * numero di fermate effettuate da ciascun treno. Inoltre, chi utilizza tale sistema informativo potrebbe essere
     * interessato a determinare il massimo ricavo realizzabile nell'erogazione di questo servizio. Tale ricavo
     * dipende chiaramente da un parametro, ovvero dal prezzo che ogni passeggero dovrà pagare per percorrere un
     * chilometro. Nei treni espressi occorrerà tenere conto anche del ricavo che si presume di ottenere in ogni
     * chilometro da ognuno dei posti disponibili nel vagone ristorante (anch'esso fornito come parametro).
     * @param args
     */
    public static void main(String[] args) {
        Calendar orarioPartenza = new GregorianCalendar();
        Calendar orarioFermata1 = new GregorianCalendar();
        orarioFermata1.add(Calendar.HOUR_OF_DAY,0);
        orarioFermata1.add(Calendar.MINUTE,30);
        Calendar orarioFermata2 = new GregorianCalendar();
        orarioFermata2.add(Calendar.HOUR_OF_DAY,1);
        orarioFermata2.add(Calendar.MINUTE,40);
        Calendar orarioFermata3 = new GregorianCalendar();
        orarioFermata3.add(Calendar.HOUR_OF_DAY,2);
        orarioFermata3.add(Calendar.MINUTE,40);
        Calendar orarioFermata4 = new GregorianCalendar();
        orarioFermata4.add(Calendar.HOUR_OF_DAY,3);
        orarioFermata4.add(Calendar.MINUTE,30);
        Calendar orarioFermata5 = new GregorianCalendar();
        orarioFermata5.add(Calendar.HOUR_OF_DAY,4);
        orarioFermata5.add(Calendar.MINUTE,0);
        Calendar orarioFermata6 = new GregorianCalendar();
        orarioFermata6.add(Calendar.HOUR_OF_DAY,5);
        orarioFermata6.add(Calendar.MINUTE,10);
        Calendar orarioArrivo = new GregorianCalendar();
        orarioArrivo.add(Calendar.HOUR_OF_DAY,5);
        orarioArrivo.add(Calendar.MINUTE,40);
        String[] fermate = {"Bologna centrale","Firenze santa maria novella","Roma termini","Napoli centrale","Salerno","Paola"};
        Calendar[] oraFermate = {orarioFermata1,orarioFermata2,orarioFermata3,orarioFermata4,orarioFermata5,orarioFermata6};
        Treni treno1 = new Treni("Ferrara",fermate,"Lamezia terme centrale",orarioPartenza,oraFermate,orarioArrivo,2000,300,1000);
        System.out.println(treno1.numeroFermate());
        System.out.println(treno1.ricavoTotale(100));
        TreniEspressi treno2 = new TreniEspressi("Ferrara",fermate,"Lamezia terme centrale",orarioPartenza,oraFermate,orarioArrivo,2000,300,1000,50,45);
        System.out.println(treno2.ricavoTotale(150,300));
    }
}