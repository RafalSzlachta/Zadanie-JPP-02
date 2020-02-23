package pl.sda;

public class Main {
        public static void main(String[] args) {
        int[] tab = {25, 64, -52, 125, -38};
        System.out.println("Największa liczba w tablicy to: " + maximum(tab));
        System.out.println("Najmniejsza liczba w tablicy to: " + minimum(tab));

}

    private static int minimum(int[] tab) {
        int minDigit = tab[0];
        for (int i = 0; i < tab.length; i++){
            if (minDigit>tab[i]){
                minDigit = tab[i];
            }
        }
        return minDigit;
    }

    private static int maximum(int[] tab) {
        int maxDigit = tab[0];
        for (int i = 0; i < tab.length; i++){
            if (maxDigit<tab[i]){
                maxDigit = tab[i];
            }
        }
        return maxDigit;
    }
}
