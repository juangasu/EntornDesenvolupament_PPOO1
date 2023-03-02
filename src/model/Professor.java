package model;

public class Professor extends User {

    private String especialitat;
    private String departament;

    private Worker worker;

    // amb extends seria: professor.getNom

    // Es extends peque es un usuari i no es un grup o sigui ha d'eser una especialitzacio
    // private model.User usuari; si fos herencia  i se cridaria proferssor.getUsuari().getNom();


    public Professor(Worker t, String dni, String nom, String cognom1, String cognom2, String email, String especialitat, String info) {
        super(dni, nom, cognom1, cognom2, email);
        this.especialitat = especialitat;
        this.departament = info;
        this.worker = t;
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

