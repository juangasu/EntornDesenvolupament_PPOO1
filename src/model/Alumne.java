package model;

public class Alumne extends User implements Cloneable {
    private String numExpediente;

    public Alumne(String dni, String nom, String cognom1, String cognom2, String email, String numExpediente) {
        super(dni, nom, cognom1, cognom2, email);
        this.numExpediente = numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    @Override
    protected Alumne clone() throws CloneNotSupportedException {
        return (Alumne) super.clone();
    }
}


