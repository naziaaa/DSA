 class animal {
    public void Sound(){
        System.out.println("the sound of animals");
    }
}
 class piggi extends polymorphism{
    public void Sound(){
        System.out.println("pig - weep weep");
    }
}
class cat extends polymorphism{
    public void Sound() {
        System.out.println("cat meows");
    }
}
 public class polymorphism{
    public static void main(String[] args) {
        animal a=new animal();
        piggi pig=new piggi();
        cat c=new cat();
        a.Sound();
        pig.Sound();
        c.Sound();
    }
 }