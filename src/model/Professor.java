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


    public void donarNotes(String nomDepartament, String aprovat, String suspes){
        if(this.departament.equals(nomDepartament)){
            System.out.println("suspes");

        }else {
            System.out.println("aprovat");
        }
        //Imprimir Bulleti
        System.out.println("El teu Bullati");
    }

    public void calcularNotes(){
        if(this.departament.equals("Informatica")){
            System.out.println("suspes");

        }else {
            System.out.println("aprovat");
        }
        //calculant les notes...
        System.out.println("Calculant...");
    }

    public int passarLlista(String dniAlumne, int faltes){
        int faltesAux = faltes; // per NO tenir que MODIFICAR un parametre sino es una variable AUXILIARdins una funció
        //comprovar si l'alumne assisteix
        return faltes++;
    }

    public void  passarLlista(Alumne a) throws CloneNotSupportedException {
       Alumne b = new Alumne(a.getDni(),a.getName(),a.getCognom1(),a.getCognom2(), a.getEmail(),a.getNumExpediente());
       Alumne c =a.clone();
        //Comprovar si l'alumne assisteix

        a.setCognom1("Cognom Modificat");
        System.out.println("Alumne dins funcio: " + b.getCognom1());

    }
    //Expulsar he posar el seu nom " -EXPULSAT"
    //Joan -EXPULSAT

    public String expulsar(Alumne alumne){
        return alumne.getName() + "- EXPULSAT";

    }
    }


