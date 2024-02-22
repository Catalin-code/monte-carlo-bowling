import java.util.Random;

public class SimulareBowling {

    public static void main(String[] args) {
        //Numarul de simulari
        int numarSimulari = 1000000;
        //Numarul de popice
        int numarPopice = 10;
        //Numarul de strike-uri
        int numarStrikeuri = 0;
        //Obiect folosit pentru generarea de popice lovite aleatoriu
        Random random = new Random();

        //Folosim un loop "for" pentru simularea obtinerii unui strike
        for (int i = 0; i < numarSimulari; i++) {
            boolean esteStrike = simuleazaAruncarea(random, numarPopice);
            if (esteStrike) {
                numarStrikeuri++;
            }
        }

        //Probabilitatea de a lovi un strike
        double probabilitateStrike = (double) numarStrikeuri / numarSimulari;

        //Afisarea in consola a rezulatului
        System.out.println("Probabilitatea de a obtine un strike: " + probabilitateStrike + "%");
    }

    //Metoda pentru a verifica daca lovitura este strike
    private static boolean simuleazaAruncarea(Random random, int numarDePopice) {
        // Simuleaza o singura lovitura
        int popiceDoborate = random.nextInt(numarDePopice + 1);

        // Verifica daca sunt doborate toate popicele
        return popiceDoborate == numarDePopice;
    }
}
