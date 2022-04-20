


abstract class Agra{
    Agra(){
        System.out.println("You are in Agra");
    }
    abstract void walk();
    void stJohnes(){
        System.out.println("Welcome ! You are in St. John");
    }
}
class SN extends Agra{
    SN(){
        System.out.println("Welcome ! Are you in SN ?");
    }

    @Override
    void walk() {
        System.out.println("Are you walking in main ground");
        
    }
}
class lawyersColony extends Agra{
    lawyersColony(){
        System.out.println("are you in Lawyers Colony");
    }

    @Override
    void walk() {
        System.out.println("You are in krishna temple");
        
    }
}
public class abstractClass {
    public static void main(String[] args) {
        SN s1 = new SN();
        s1.walk();
        s1.stJohnes();
    }
}
