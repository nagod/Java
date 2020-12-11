
public class NestedScopesExample {
    String title = "Deniz";

    public void printTitle(){
        System.out.println(title);
        String title="Dogan";
        System.out.println(title);
    }

    public static void main(String [] args){

        NestedScopesExample tmp = new NestedScopesExample();
        tmp.printTitle();
    }
}
