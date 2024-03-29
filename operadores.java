public class operadores {
    public static void main(String[] args) {
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        System.out.println(sum3);

        int x = 10;
        System.out.println(x);

        int x1 = 10;
        x +=5;
        System.out.println(x1);
        
        // medir comprimento de uma string com length
        String txt = "AHSUAHSUAHSUAHSUAHSUAHSUASh";
        System.out.println("The length of txt string is:" + txt.length());
        
        // métodos de strings toUpperCase e toLowerCase
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());
        
        // indexOf retorna um índice incluindo espaços em brancos
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));

    }
}
