package model;

public abstract class User implements Comparable<User> {

    private String dni;
    private String name;
    private String cognom1;
    private String cognom2;
    private String email;

    public User(String dni, String name, String cognom1, String cognom2, String email) {
        this.dni = dni;
        this.name = name;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
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

