package model;

public class WorkerConcertat implements Worker {
    public static final float PI = 3.14159f;
    // 1- Rename refactor- rename y
    // 2-Extreure una constant refactoritzacio (magicNumber) seleccionam lo que volem Refactor- introduceConstant


    // 3 - Extreure una variable.
    //4 - Extreure un mètode (molt utilitzat a segon tema de seguritat)(per no duplicar es mateix codi, el treim i es posa dins un metoda a part)

    @Override
    public float calcularNomina() {
        comprovarPermisos();
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)
        int nomina = 1300 + 100; // refactor - introduir variable i cambiar i per el nom que volem i crea una variable
        return nomina * PI;
    }

    private static void comprovarPermisos() {
        boolean treballador = true;
        if(treballador && 3 < PI){
            int x = 45;
        }
    }

    @Override // Override sobreescriu d'un objecta superior
    public float calcularIRPF() {
        comprovarPermisos();
        // Connexió HTTP Conselleria (imaginam i ens retorna nombre)

        int irpf = 17;
        return irpf * PI;
    }
}
