package model;

public class WorkerConcertat implements Worker {
    // 1- Rename refactor- rename y
    // 2-Extreure una constant refactoritzacio (magicNumber) seleccionam lo que volem Refactor- introduceConstant

    private static final float PI = 3.14159f;
    // 3 - Extreure una variable.

    @Override
    public float calcularNomina() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        int nomina = 1300 + 100; // refactor - introduir variable i cambiar i per el nom que volem i crea una variable
        return nomina * PI;
    }

    @Override // Override sobreescriu d'un objecta superior
    public float calcularIRPF() {
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)

        return 17 * PI;
    }
}
