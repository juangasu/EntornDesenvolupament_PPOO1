package interficie;

import model.Alumne;
import model.Escola;
import model.Professor;
import model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal implements UserInterface {
    private boolean exit = false;
    private Escola escola;

    public Terminal(Escola escola) {
        this.escola = escola; // injeccio de dependencia IMPORTANT mirar be

    }


    @Override
    public void pintaMenu() { // pintaMenu es perque ho hem acordat aquest nom.
        System.out.println("Benvinguts a lescola " + this.escola.getNom());
        Scanner opcio = new Scanner(System.in);

        int option;
        while (!exit) {
            System.out.println("1. Afegir");
            System.out.println("2. Llistar");
            System.out.println("3. Sortir");

            try {
                System.out.println("Tria una opcio");
                option = opcio.nextInt();


                switch (option) {
                    case 1:
                        System.out.println("Has triat l'opcio de Afegir");
                        this.afegirUsuari();

                        break;
                    case 2:
                        System.out.println("Has triat l'opcio de Llistar");
                        this.llistarUsuaris();
                        break;

                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.print("Opcio no valida");
                        System.out.println("Eligeix entre 1 i 3");
                }
            } catch (InputMismatchException e) {

                System.out.println("Debes insertar un número");
                opcio.next();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void afegirUsuari() throws Exception { //throws Exception es posa si no es fa un try-catch anteriorment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Afegim alummne");
        System.out.println("Introdueix Nom: ");
        String nom = scanner.nextLine();
        System.out.println("Introdueix Cognom1: ");
        String Cognom1 = scanner.nextLine();
        System.out.println("Introduex Cognom2: ");
        String Cognom2 = scanner.nextLine();
        System.out.println("Introduex email: ");
        String email = scanner.nextLine();
        System.out.println("Introdueix Numer Expedient: ");
        String numExpediente = scanner.nextLine();

        Alumne alumne = new Alumne("","","","","","");
        this.escola.addUsuari(alumne);

    }

    @Override
    public void llistarUsuaris() {
        User[] users = this.escola.llistarUsuaris();
        //Collections.sort(Arrays.stream(users).toList());

        for(int i = 0; i< users.length; i++){

            /*
            if(users[i] == null)
                break;
             */

            System.out.println("Dades del User: ");
            System.out.println("usuari: " + users[i].getName());
            System.out.println("Cognom1: "+ users[i].getCognom1());
            System.out.println("Cognom2: " + users[i].getCognom2());

            if(users[i] instanceof Alumne){
                System.out.println("Numero d'expedient:" + ((Alumne) users[i]).getNumExpediente());

            } else if (users[i] instanceof Professor) {
                System.out.println("Departament: "+ ((Professor) users[i]).getDepartament());

            }
            System.out.println("end");
        }
    }

}
