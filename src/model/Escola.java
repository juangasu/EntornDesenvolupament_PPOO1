package model;

public class Escola {
    private String nom;
    private Usuari[] usuaris;
    private static final int Max_Users = 1000; // Static a final esta be. i esta refactoritzat per el magic Number perque el nombre 1000 te un significat
    private int last;  // per definir el darrer inserit.


    public Escola(String nom) { // sa de crear un Constructor
        this.nom = nom;
        this.usuaris = new Usuari[Max_Users]; // Es posa Max_Users perque es refactoritza per la forma MagicNumber.
        last = 0;
    }

    public void addUsuari2(Usuari usuari) {
        try {
            this.usuaris[last] = usuari;
            last++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Escola Plena.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addUsuari(Usuari usuari) throws Exception {
        if (last < Max_Users) {
            this.usuaris[last] = usuari;
            last++;
        } else {
            throw new Exception("Nombre màxim d'usuaris a la escola");

        }
    }

    public void deleteUsuari(Usuari usuari){
        this.usuaris[last] = usuari;
        last++;
    }

    public void swapUsuari (Usuari usuari){
        this.usuaris[last]= usuari;
        last++;
    }

    public Usuari[] llistaUsuaris() {
        Usuari[] usuaris = new Usuari[last]; // per no tenir nulls
        //Emplenar array amb els uauaris
        for (int i = 0; i < usuaris.length; i++) {
            usuaris[i] = this.usuaris[i];// aquest this es el que selecciona els usuaris private Usuari[] usuaris(sempre apunta a veriables de clase) i el primer usuaris se referencia a la variable local
        }
        //return this.usuaris; // tendrem Nulls.
        return usuaris;

    }
}


