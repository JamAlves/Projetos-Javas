 public class Main5 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }

   
}

class OuterClass {
    class InnerClass{
        int y = 5;
    }

    int x = 10;
}
