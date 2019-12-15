public class OperatorPrecedence {
    public static void main(String[] args) {
        int x = 2;
        int y = x + (x++  * 2 + 3);
        // Pasul 1  se schimba valorile direct in numere secvential (in ordinea cum sunt scrise) de la stanga la dreapta
        // y = 2  + (2 * 2 + 3)
        // Se efectueaza operatiile  mai intai din paranteza inmultirea si adunarea, apoi adunarea cu elementul din afara parantezei
        System.out.println("y is " + y);
        System.out.println("x is " + x);

        int a = 2;
        int b = a++ + a;
        // b = 2 + 3
        // operandul a++  este egal cu valoarea 2  in linia int b = a++ + a;
        // iar urmatoarea data cand este folosit fie pe aceasi linie sau in linia urmatoare valoarea lui a creste cu 1
        System.out.println("\nb is " + b);
        System.out.println("a is " + a);

        int s = 3;
        int d = 7;
        int f = 8;
        int result = s + s++ + s++ * d++ - f++;
        // 3 + 3 + 4 * 7 - 8 = 26
        // Aici se poate vedea clar operator precedence pentru ca prima data  se executa postfix operator (adica cele cu litera urmata de semnele ++
        // apoi se realizeaza inmultirea adica operatii de ordin 2
        // apoi  se realizeaza  + - de la stanga la dreapta adica operatiile de ordin 1 ca de doi nu mai avem
        // iar in final se realizeaza atribuirea adica =
        System.out.println("\nResult is " + result);

        int a1 = 5;
        int a2 = 9;
        int a3 = 7;

        if (a1 > 6  || a2 > 11  && a3 > 10)
            // Daca pui a1 > 6 conditia e falsa
            // Daca pui a1 > 3 conditia e adevarata
            // aici iar se poate vedea operator precedence pentru ca prima data se opereaza && apoi ||
            System.out.println("\n\nADEVARAT");
        else
            System.out.println("FALS");

    }
}
