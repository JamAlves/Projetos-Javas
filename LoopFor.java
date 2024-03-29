public class LoopFor {
    public static void main(String[] args) {
        //loop for 1 a 4
        for(int i =0; i < 5; i ++){
            System.out.println(i);
        }
        System.out.println("====================");
        // loop que conta de dois em dois pares
        for (int i = 0; i <=10; i = i + 2){
            System.out.println(i);
        }
        System.out.println("====================");
        //loops aninhados um dentro do outro
        for (int i = 1; i <= 2; i ++){
            System.out.println("Outer:" + i);

        for (int j = 1; j <=3; j++){
            System.out.println("Inner:" + j);
        }
      }
    }
}
