public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++)
            if (zad1(i) != 0)
                System.out.println(zad1(i));

            System.out.println("nwd to " + zad2(14,20));

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


}
