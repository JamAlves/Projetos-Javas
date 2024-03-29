public class Looparray {
    public static void main(String[] args) {
    //usando loop no array
    String[] cars ={"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i< cars.length; i++){
            System.out.println(cars[i]);
        }
    System.out.println("===========================");

    String[] cars1 = {"Fusca", "Uno", "Peuget", "Monza"};
        for(String i : cars1){
        System.out.println(i);
    }
   }
    
}

