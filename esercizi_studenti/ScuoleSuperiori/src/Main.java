
    import java.time.LocalDate;

        public class Main {

            public static void main(String[] args) {
                // TODO Auto-generated method stub
                Studenti s1 = new Studenti("mario","rossi","pinerolo",LocalDate.of(2003, 6, 30));
                Studenti s2 = new Studenti("mario","rossi","pinerolo",LocalDate.of(2004, 6, 30));
                Studenti s3 = new Studenti("mario","rossi","pinerolo",LocalDate.of(2003, 6, 30));
                Studenti s4 = new Studenti("mario","rossi","pinerolo",LocalDate.of(2005, 6, 30));

                Classi c1 = new Classi("4b",2003);
                Classi c2 = new Classi("2b",2005);
                c1.aggiungiStudente(s1);
                c1.aggiungiStudente(s3);
                c2.aggiungiStudente(s2);
                c2.aggiungiStudente(s4);

                Scuole sc1 = new Scuole("Pininfarina");
                sc1.aggiungiClasse(c1);
                sc1.aggiungiClasse(c2);

                int cnt1 = sc1.numeroStudenti("4b");
                int cnt2 = sc1.numeroStudenti("2b");
                int cnt3 = sc1.numeroStudenti("5b");

                System.out.println(String.format(" 2b : %d, 4b : %d, 5b : %d ", cnt2,cnt1,cnt3));

                int cntb1 = sc1.controllaBocciature("4b");
                int cntb2= sc1.controllaBocciature("2b");
                int cntb3= sc1.controllaBocciature("5b");

                System.out.println(String.format(" 2b : %d, 4b : %d, 5b : %d ", cntb2,cntb1,cntb3));


            }

        }


