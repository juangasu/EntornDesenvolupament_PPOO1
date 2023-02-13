package model;

public class TreballadorPublic implements Treballador {
    public TreballadorPublic(int numFuncionari) {
        this.numFuncionari = numFuncionari;
    }

    private int numFuncionari;

    @Override
    public float calcularNomina() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        return 1500;
    }

    @Override // Override sobreescriu d'un objecta superior
    public float calcularIRPF() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        return 17;
    }
}
