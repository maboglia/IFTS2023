public class Main {
    public static void main(String[] args) {
    Auto a = new Auto("Fiat","Panda",1100,40,150);
        try {
            a.clonaCilindrata(1300);
        } catch (CloneNotSupportedException e) {
           e.printStackTrace();
            System.exit(-1);
        }
        System.out.println(a.calcolaAutonomia());

    }
}