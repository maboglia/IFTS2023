public class DVD extends Pubblicazioni{
    private double durata;

    public DVD (String titolo,int annoPubblicazione,double durata){
        super(titolo,annoPubblicazione);
        this.durata = durata;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    @Override
    public String toString(){
        String output = "{";
        output += super.toString();
        output += "\"durata\":" + durata;
        output += "}";
        return output;
    }

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(!getClass().getName().equals(obj.getClass().getName())){
            return false;
        }
        DVD dvd = (DVD)(obj);
        return durata == dvd.durata;
    }
}