
    import java.time.LocalDate;

    public class Studenti {
        private String nome;
        private String cognome;
        private String luogoDiNascita;
        private LocalDate dataNascita;

        public Studenti(String nome, String cognome, String luogoDiNascita, LocalDate dataNascita) {
            super();
            this.nome = nome;
            this.cognome = cognome;
            this.luogoDiNascita = luogoDiNascita;
            this.dataNascita = dataNascita;
        }

        public String getNome() {
            return nome;
        }

        public String getCognome() {
            return cognome;
        }

        public String getLuogoDiNascita() {
            return luogoDiNascita;
        }

        public LocalDate getDataNascita() {
            return dataNascita;
        }

    }

