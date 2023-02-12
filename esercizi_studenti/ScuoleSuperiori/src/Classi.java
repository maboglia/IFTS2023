

import java.time.LocalDate;
import java.util.ArrayList;

    public class Classi {
        private String nome;
        private int annoAssociato;

        private ArrayList<Studenti>studenti = new ArrayList <Studenti>();


        public Classi(String nome, int annoAssociato) {
            super();
            this.nome = nome;
            this.annoAssociato = annoAssociato;
        }

        public String getNome() {
            return nome;
        }

        public int getAnnoAssociato() {
            return annoAssociato;
        }

        public ArrayList<Studenti> getStudenti() {
            return studenti;
        }

        public void aggiungiStudente(Studenti s) {
            studenti.add(s);
        }

    }


