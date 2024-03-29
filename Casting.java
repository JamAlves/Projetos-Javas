public class Casting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
          // alargamento do tamanho menor para o maior:
        System.out.println(myInt); // outputs 9
        System.out.println(myDouble); // outputs 9.0

        System.out.println("=====================");

        // Diminuido a conversão do casting 
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;

        System.out.println(myDouble1);
        System.out.println(myInt1);
    }
}
