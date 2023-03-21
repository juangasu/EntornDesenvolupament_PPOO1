package model;

public abstract class User implements Comparable<User> {

    private String dni;
    private String name;
    private String cognom1;
    private String cognom2;
    private String email;

    /*
        Nom, cognom1 i cognom2
        1- No poden tenir espais en blanc devant ni darrera |  Pep  | --> |Pep|
        2- Totes les paraules han de començar en majúscula i la resta en minuscula |JOAN TONI| --> |Joan Toni|
        3- No ha d'admetre cap accent ni ç ni ñ |Llorenç| --> |Llorenc|
     */
    public User(String dni, String name, String cognom1, String cognom2, String email) {
        this.dni = dni;
        this.name = name;
        //1
        this.name = this.name.trim();
        //2
        String[] nomCompost = this.name.split(" ");// split per separar noms compost "regex" li deim hon ha de xepar
        String nomCapitalitzat = "";
        for (int i = 0; i <nomCompost.length; i++) {
            nomCapitalitzat += nomCompost[i].toUpperCase().charAt(0) + nomCompost[i].toLowerCase().substring(1);
        }
        this.name= nomCapitalitzat;

        //3
        this.name =  this.name.replaceAll("ñ", "n");
        this.name =  this.name.replaceAll("Ñ", "N");
        this.name =  this.name.replaceAll("ç", "c");
        this.name =  this.name.replaceAll("Ç", "C");
        this.name =  this.name.replaceAll("à", "a");
        this.name =  this.name.replaceAll("À", "A");
        this.name =  this.name.replaceAll("á", "a");
        this.name =  this.name.replaceAll("Á", "A");
        this.name =  this.name.replaceAll("è", "e");
        this.name =  this.name.replaceAll("é", "e");
        this.name =  this.name.replaceAll("È", "E");
        this.name =  this.name.replaceAll("É", "E");
        this.name =  this.name.replaceAll("í", "i");
        this.name =  this.name.replaceAll("Í", "I");
        this.name =  this.name.replaceAll("ò", "o");
        this.name =  this.name.replaceAll("Ò", "O");
        this.name =  this.name.replaceAll("ó", "o");
        this.name =  this.name.replaceAll("Ó", "O");
        this.name =  this.name.replaceAll("ú", "u");
        this.name =  this.name.replaceAll("Ú", "U");
        this.cognom1 = cognom1;
        this.cognom1 = this.cognom1.trim();
        this.cognom2 = cognom2;
        this.cognom2 = this.cognom2.trim();
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public String getEmail() {
        return email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    /*
     0 si U i this son igual
     1 si this > u
     -1 si this< u
      */

    @Override

    public int compareTo(User u) {

        if (this.getCognom1().compareTo(u.getCognom1()) == 0) {

            String u1 = this.getCognom1() + this.getCognom2() + this.getName();
            String u2 = u.cognom1 + u.cognom2 + u.name;

            return u1.compareTo(u2);
        }
        return 2; //

    }

}

