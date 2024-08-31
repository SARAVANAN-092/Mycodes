class aimal{
    int leg=3;
    public int des = 35;
    void aimal()
    {System.out.println("Hello");}
    public void walk()
    {
        System.out.println("i hi");
        dog a=new dog();
        a.ear();
    }    
}
class dog extends aimal{
    public void ear(){
    System.out.println(++leg); 
    System.out.println(++des);
}
}
public class i {
    public static void main(String[] args) {
        dog o=new dog();
        o.ear(); 
        // System.out.println(o.leg);
    }
}