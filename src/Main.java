import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   String name1 = askForUserName();
       String name2 = askForUserName();
       name2 = revertName(name2);
       System.out.println("Result: " + name1 + name2);
    }

    private static String askForUserName() {
        System.out.println(" Ingrese un nombre: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static String revertName(String name2) {
        String reverseName2="";
        for (int i = name2.length()-1; i >=0; i--){
            reverseName2 += name2.substring(i, i+1);
        }

        return reverseName2;
    }

}
