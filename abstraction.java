abstract class Animal{
    abstract void sound();
}
class pig extends Animal{
    public void sound(){
        System.out.println("peep");
    }
}

public class abstraction {
    public static void main(String[] args) {
        pig piggi =new pig();
        piggi.sound();
        
    }
}
