import model.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     //   Treballador treballadorPublic = new TreballadorPublic();
        Treballador treballadorConcertat = new TreballadorConcertat();
        Professor p = new Professor(treballadorConcertat,"dni2","Juan Profe", "Siniga", "Santori", "alfdjalñj", "Info", "Info");

      //  int horesSuport = p.horesSuport();
        p.getDni();
        p.getEspecialitat();

        Alumne a = new Alumne("dni1","Pepe", "Saritogui", "Tolo", "akljfla","123");
        Alumne b = new Alumne("dni2","juan","Santandreu", "Riera", "aklsdfkajs", "124");

        a.getDni();
        a.getNumExpediente();
        //  model.Usuari u = new model.Usuari();
        //  model.Usuari[] tothom = llistarUsuari();

        Escola iesManacor = new Escola("IES Manacor");

        try { // aixi trectam el execption del thor
            iesManacor.addUsuari(p);
            iesManacor .addUsuari(a); // en aquest cas podem afegir proferos (p) i alumna(a) perqeu son usuaris i aixo s'anomena POLIMORFISMA
        } catch (Exception e){

            System.out.println("No petat");
        }
      //  iesManacor .addUsuari2(a);
     //   llistarUsuari();



        //pintem els usuaris
      Usuari[] usuaris = iesManacor.llistaUsuaris();
        /*  for(Usuari u:usuaris){ // "u" nom que li don a la variable
            System.out.println("usuari" + u.getNom());
        }

       */

        //Collections.sort(Arrays.stream(usuaris).toList());

        for(int i=0;i<usuaris.length; i++){

            if(usuaris[i] == null)
                break;

            System.out.println("Dades del Usuari: ");
            System.out.println("usuari: " + usuaris[i].getNom());
            System.out.println("Cognom1: "+ usuaris[i].getCognom1());
            System.out.println("Cognom2: " + usuaris[i].getCognom2());

            if(usuaris[i] instanceof Alumne){
                System.out.println("Numero d'expedient:" + ((Alumne) usuaris[i]).getNumExpediente());

            } else if (usuaris[i] instanceof Professor) {
                System.out.println("Departament: "+ ((Professor) usuaris[i]).getDepartament());

            }
            System.out.println("end");
        }

        System.out.println(a.compareTo(b)); //compara a --> b es -1
        System.out.println(b.compareTo(a)); // compara b --> a es 1

    }




    /*  public static List <model.Professor> insertarUsuari(){
          List<model.Professor> p = new ArrayList<>();


      }

     */
   // public static Usuari[] llistarUsuari() {
  //      return null;
   // }

}