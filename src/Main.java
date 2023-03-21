import interficie.InterficieGrafica;
import interficie.Terminal;
import interficie.UserInterface;
import model.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Hello world!");


     //   Worker treballadorPublic = new WorkerPublic();
        Worker workerConcertat = new WorkerConcertat();
        Professor p = new Professor(workerConcertat,"dni2","Juan Profe", "Siniga", "Santori", "alfdjalñj", "Info", "Info");
      //  int horesSuport = p.horesSuport();
        p.getDni();
        p.getEspecialitat();

        Alumne a = new Alumne("dni1","Pepe", "Saritogui", "Tolo", "akljfla","123");
        Alumne b = new Alumne("dni2","juan","Santandreu", "Riera", "aklsdfkajs", "124");

        a.getDni();
        a.getNumExpediente();
        //  model.User u = new model.User();
        //  model.User[] tothom = llistarUsuari();

        Escola iesManacor = new Escola("IES Manacor");

        try { // aixi trectam el execption del thor
            iesManacor.addUsuari(p);
            iesManacor .addUsuari(a); // en aquest cas podem afegir proferos (p) i alumna(a) perqeu son users i aixo s'anomena POLIMORFISMA
        } catch (Exception e){

            System.out.println("No petat");
        }
      //  iesManacor .addUsuari2(a);
     //   llistarUsuari();



        //pintem els users
      User[] users = iesManacor.llistarUsuaris();

        /*  for(User u:users){ // "u" nom que li don a la variable
            System.out.println("usuari" + u.getNom());
        }

       */

        UserInterface userInterface;
        System.out.println("Com vols sa interficie? ");
        System.out.println(" 1- Terminal");
        System.out.println(" 2- Altre Grafic");
        Scanner scanner = new Scanner(System.in);
        int opcio = scanner.nextInt();

        if (opcio == 1) {
            userInterface = new Terminal(iesManacor);
        }else {

            userInterface = new InterficieGrafica();
        }

        userInterface.pintaMenu();



        System.out.println(a.compareTo(b)); //compara a --> b es -1
        System.out.println(b.compareTo(a)); // compara b --> a es 1




        // Demostrar per què no modificar un paràmetre
         int faltes = 5;
        int faltesNoves= p.passarLlista("756362", faltes);
        System.out.println ("Faltes: " +faltes+" Falres noves: " + faltesNoves);

        //Alumne a
         b.setCognom1("Cognom sense Modificar");
        System.out.println("Cognom alumna abans: " +b.getCognom1());

        p.passarLlista(a);
        System.out.println("Cognom alumne despres: " + b.getCognom1());

        //Expulsar Alumna
        String nomExpulsat = p.expulsar(a);
        a.setName(nomExpulsat);

    }




    /*  public static List <model.Professor> insertarUsuari(){
          List<model.Professor> p = new ArrayList<>();


      }

     */
   // public static User[] llistarUsuari() {
  //      return null;
   // }

    }

