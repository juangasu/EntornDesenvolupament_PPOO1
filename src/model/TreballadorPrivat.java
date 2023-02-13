package model;

public class TreballadorPrivat implements Treballador {
    @Override
    public float calcularNomina() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        return 3000;
    }

    @Override // Override sobreescriu d'un objecta superior
    public float calcularIRPF() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        return 17;
    }
}
