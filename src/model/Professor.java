package model;

public class Professor extends Usuari{

    private String especialitat;
    private String departament;

    private Treballador treballador;

    // amb extends seria: professor.getNom

    // Es extends peque es un usuari i no es un grup o sigui ha d'eser una especialitzacio
    // private model.Usuari usuari; si fos herencia  i se cridaria proferssor.getUsuari().getNom();


    public Professor(Treballador t,String dni, String nom, String cognom1, String cognom2, String email, String especialitat, String info) {
        super(dni, nom, cognom1, cognom2, email);
        this.especialitat = especialitat;
        this.departament = info;
        this.treballador = t;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public String getDepartament() {
        return departament;
    }



    //public int hores
}

