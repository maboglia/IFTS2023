
    import java.util.ArrayList;

    public class Scuole implements InterfacciaScuole{

        private String nomeScuola;
        private ArrayList<Classi>classi = new ArrayList <Classi>();

        public Scuole(String nomeScuola) {
            super();
            this.nomeScuola = nomeScuola;
        }

        public String getNomeScuola() {
            return nomeScuola;
        }

        public ArrayList<Classi> getClassi() {
            return classi;
        }

        public void aggiungiClasse(Classi c) {
            classi.add(c);

        }

        @Override
        public int controllaBocciature(String nomeClasse) {
            int n = -1;
            for(Classi c : classi) {
                if(c.getNome().equals(nomeClasse)) {//il metodo equals ci permette di confrontare due stringhe
                    n = 0;
                    for(Studenti s : c.getStudenti()) {
                        if(s.getDataNascita().getYear() < c.getAnnoAssociato()) {
                            n++;
                        }
                    }
                }

            }
            return n;
        }

        @Override
        public int numeroStudenti(String nomeClasse) {
            int n = -1;
            for(Classi c : classi) {
                if(c.getNome().equals(nomeClasse)) {//il metodo equals ci permette di confrontare due stringhe
                    n = c.getStudenti().size(); //salva dentro n il numero di studenti della classe
                    // il metodo size della classe arraylist ritorna il numero di elementi dell'arrayList
                }
            }
            return n;
        }



    }


