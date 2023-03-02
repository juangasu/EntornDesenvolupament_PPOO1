package model;

public class Escola {
    private String nom;
    private User[] users;
    private static final int Max_Users = 5; // Static a final esta be. i esta refactoritzat per el magic Number perque el nombre 1000 te un significat
    private int last;  // per definir el darrer inserit.


    public String getNom() {
        return nom;
    }

    public Escola(String nom) { // sa de crear un Constructor
        this.nom = nom;
        this.users = new User[Max_Users]; // Es posa Max_Users perque es refactoritza per la forma MagicNumber.
        last = 0;
    }

    public void addUsuari2(User user) {
        try {
            this.users[last] = user;
            last++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Escola Plena.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addUsuari(User user) throws Exception {
        if (last < Max_Users) {
            this.users[last] = user;
            last++;
        } else {
            throw new Exception("Nombre màxim d'users a la escola");

        }
    }

    public void deleteUsuari(User user){
        this.users[last] = user;
        last++;
    }

    public void swapUsuari (User user){
        this.users[last]= user;
        last++;
    }

    public User[] llistarUsuaris() {
        User[] users = new User[last]; // per no tenir nulls
        //Emplenar array amb els uauaris
        for (int i = 0; i < users.length; i++) {
            users[i] = this.users[i];// aquest this es el que selecciona els users private User[] users(sempre apunta a veriables de clase) i el primer users se referencia a la variable local
        }
        //return this.users; // tendrem Nulls.
        return users;

    }
}


