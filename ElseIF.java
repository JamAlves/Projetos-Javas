public class ElseIF {
    public static void main(String[] args) {
        // comando IF 
        if (20 > 18){
            System.out.println("20 is greater than 18");
        }
        
        // testando variaveis com IF 
         int x = 20;
         int y = 18;
         if(x > y){
            System.out.println("x is greater than y");
        }

        // declaçao Else
        int time = 22;
        if (time < 18){
            System.out.println("Good day.");
        }else {
            System.out.println("Good evening.");
        }

        // declarando else if 
        
        int time1 = 24;
        if (time1 < 14){
            System.out.println("Good morning.");
        }else if (time1 < 18){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening.");
        }

    }
    
}
