class mycar{
  void honk(){
    System.out.println("hey");
  }
}
class car extends mycar{
    public static void main(String[] args) {
        car c=new car();
        c.honk();
    
    }
   
} 