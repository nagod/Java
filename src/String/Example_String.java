package String;

public class Example_String {

    public static void main(String [] args){

        String name = "hallo";
        String name2= new String("hallo");

        System.out.println("== is : "+ (name == name2));
        System.out.println(" equal is :"+ (name.equals(name2)));

        System.out.println("+ : "+ (name + name2));
        System.out.println("concat : " +(name.concat(name2)));
        System.out.println("compareTo : "+ name.compareTo(name2));


    }
}
