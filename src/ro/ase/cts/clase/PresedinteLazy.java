package ro.ase.cts.clase;

public class PresedinteLazy {

    private String nume;
    private int varsta;
    private int mandat;

    private static PresedinteLazy instance=null;


    private PresedinteLazy() {
        this.nume="Putin";
        this.varsta=40;
        this.mandat=2;
    }

   private PresedinteLazy(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }


    public static synchronized PresedinteLazy getInstance(String nume,int varsta, int mandat) {
        if(instance==null) {
            instance = new PresedinteLazy(nume, varsta, mandat);

        }
        return instance;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }
}
