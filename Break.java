public class Break {
    public static void main(String[] args) {
        
        // break instrução usada para sair do loop
        for ( int i = 0; i < 10; i++){
            if (i == 4) {
               continue; //break;
            }
            System.out.println(i);
        }
        System.out.println("===================");
        // usando break e continue no while
        int i = 0;
        while (i < 20) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        System.out.println("===================");

        int j = 0;
        while (j < 10) {
          if (j == 4) {
            i++;
            continue;
          }  
          System.out.println(i);
          i++;
        }

    }
}
