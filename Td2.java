
import java.util.Scanner;
import java.lang.Math;

public class Td2 {

    /**
     * Un scanner pour lire les valeurs au claver
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * La méthode principale (main). Décommenter l'exercice à tester.
     *
     * @param args
     */
    public static void main(String[] args) {

        exo7();
    }


    /*L'exercice 1 : somme des n premiers entiers
     */
    static void exo1() {
        System.out.println("Entrer 1 entiers");
        int n = sc.nextInt();
        int fac = 0;
        for (int i = 0; i <= n; i++) {

            fac = fac + i;

        }
        System.out.println(fac);

    }

    /**
     * L'exercice 2 : factorielle d'un entier
     */
    static void exo2() {
        System.out.println("Entrer 1 entiers");
        int n = sc.nextInt();
        int fac = 1;
        for (int i = 1; i <= n; i++) {

            fac = fac * i;

        }
        System.out.println(fac);

    }

    /**
     * L'exercice 3 : produit de 2 entiers positifs avec l'addition
     */
    static void exo3() {
        System.out.println("Entrer 2 entiers positifs");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int produit = 0;

        for (int i = 0; i < n2; i++) {
            produit += n1;
        }

        System.out.println("Le produit de " + n1 + " et " + n2 + " est : " + produit);
    }

    /*L'exercice 4 : division euclidienne de 2 entiers
     */
    static void exo4() {

        System.out.println("Entrer 2 entiers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int add = 0;
        int nb = 0;
        while (add +n2 <= n1) {

            add = add + n2;
           
            nb++;

        }
        int quotien = nb;
        int reste = n1 - add;
        System.out.println("quotien : " + quotien + "reste : " + reste);
    }


    /*L'exercice 5 : PGCD de 2 entiers
     */
    static void exo5() {
        System.out.println("Entrer 2 entiers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2) {
            while (n1 > n2) {
                n1 = n1 - n2;
            }
            if (n2 > n1) {
                while (n2 > n1) {
                    n2 = n2 - n1;
                }
            }
        } else if (n1 < n2) {
            while (n1 < n2) {
                n2 = n2 - n1;
            }
            if (n1 > n2) {
                while (n1 > n2) {
                    n1 = n1 - n2;
                }
            }
        }

        System.out.println("pgcd : " + n1);

    }

    static void exo5_2() {
        System.out.println("Entrer 2 entiers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int pg1 = n1;
        int pg2 = n2;

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        System.out.println("PGCD de " + pg1 + " et " + pg2 + " est : " + n1);

    }

    /**
     * L'exercice 6
     */
    static void exo6() {
        int n1 = sc.nextInt();

        int a = 1;
        int b = 1;
        int res = 0;

        if (n1 >= 2) {
            for (int i = 0; i < n1; i++) {

                res = a + b;
                a = b;
                b = res;

            }
        }
        System.out.println("resultat : " + b);

    }

    /**
     * L'exercice 7
     */

   static void exo7() {
    System.out.print("Entrez le nombre de termes: ");
    int n = sc.nextInt();
    double pi = 0;
    double signe = 1; 
    
    for (int i = 0; i < n; i++) {
        pi += signe / (2.0 * i + 1);  
        signe = -signe; 
    }
    
    pi = pi * 4;  
    System.out.println("Approximation de PI avec " + n + " termes: " + pi);
}


 /**
     * L'exercice 8
     */

   static void exo8() {

    System.out.print("Entrez le nombre de termes: ");
    int n = sc.nextInt();
    double ex = 0;
     ex = 1 + n ;    
    for (int i = 2; i < n; i++) {
        ex += (Math.pow(n,i)(i/i!));  
        
    }
    
     
    System.out.println("Approximation de E avec " + n + " termes: " + ex);
    
}

 /**
     * L'exercice 9
     */

   static void exo9() {
    
}

 /**
     * L'exercice 10 
     */

   static void exo10() {
    
}

 /**
     * L'exercice 11
     */

   static void exo11() {
    
}

 /**
     * L'exercice 12
     */

   static void exo12() {
    
}

 /**
     * L'exercice 13
     */

   static void exo13() {
    
}
}
