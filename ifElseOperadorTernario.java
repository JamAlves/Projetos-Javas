public class ifElseOperadorTernario {
    public static void main(String[] args) {
        
        //Operador termnario e usado para substituir ifElse simples
        int time = 20;
        if (time < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }


        // simplificando o IFELSE usando operador ternario
        int time1 = 20;
        String result = (time1 < 18)? "Good day." : "Good evening.";
        System.out.println(result);

    }
}
