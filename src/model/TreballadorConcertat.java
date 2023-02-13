package model;

public class TreballadorConcertat implements Treballador {
    @Override
    public float calcularNomina() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        return 1300 + 100;
    }

    @Override // Override sobreescriu d'un objecta superior
    public float calcularIRPF() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        return 17;
    }
}
