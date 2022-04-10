class ABC{
    String name;  
    int age;
    String city;

    public void getInfo(){
        System.out.println("The name of ABC is " + this.name);
        System.out.println("The age of ABC is "+ this.age);
        System.out.println("The city of  ABC is "+ this.city);
    }
}
public class Objects {
     public static void main(String[] args) {
        ABC A1 = new ABC();
        A1.name = "Shubham Sengar";
        A1.age = 21;
        A1.city = "Agra";

        A1.getInfo();
    }
}
