public class Main {

    public static void main(String[] args) {

        int[] tab = new int[11];

        for (int i = 0; i < tab.length; i++)
            tab[i]=i+1;


        System.out.println("liczby podzielne przez 3 lub 5 to:");

        for (int i = 1; i <= 100; i++)
            if (zad1(i) != 0)
                System.out.print(zad1(i) + " ");

        System.out.println("\nnwd 14 i 20 to " + zad2(14,20));

        System.out.println("6! = " + zad3(6));

        zad4(tab, 3);

        System.out.println("\n8 wyraz ciagu fibonacciego to " + zad5(8));

        zad7(6,9);

    }

    public static int zad1(int liczba){

        int x = 0;
            if ((liczba%3 == 0) || (liczba%5 == 0))
                x = liczba;
    return x;
    }

    public static int zad2 (int x, int y){

        while (x != y){
            if (x > y)
                x = x - y;
            else y = y - x;
        }
        return x;
    }

    public static int zad3 (int x){

        int wynik = 1;

        for (int i = 1; i <= x; i++)
            wynik *= i;

        return wynik;
    }

    public static int zad5 (int x){

        if (x < 3) return 1;

        return zad5(x-2) + zad5(x-1);
    }

    public static void zad4 (int[] tab, int n){

        int[] tab2 = new int[tab.length];

        for (int i = 0; i < n; i++)
            tab2[i] = tab[tab.length - n + i];

        for (int i = 0; i < tab.length-n; i++)
            tab2[i+n]=tab[i];

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab2[i] + " ");


    }

    public static void zad7 (int x, int y){

        if ((x < 3) || (y < 3)){
            System.out.println("wymiary prostokata to conajmniej 3x3 - popraw!");
            return;
        }

        char[][] tab = new char[x][y];

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++){
                tab[i][j] = ' ';
                if ((i == 0) || (i == x-1)) tab[i][j]='#';
                if ((j == 0) || (j == 0) || (j == y-1)) tab[i][j]='#';
            }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }

    }

}
