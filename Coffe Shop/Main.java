import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here 💖
        int order;
        int count;
        int vanilla;
        Scanner scanner = new Scanner(System.in);
        //GUI    
        System.out.println("|||||..☕Welcome to coffe shop☕..|||||");
        System.out.println("||................MENU...............||");
        System.out.println("||----1.Coffe Latte Iced-------------||");
        System.out.println("||----2.Coffe Latte with Matcha(iced)||");
        System.out.println("||----3.Coffe Latte------------------||");
        System.out.println("||///////////////////////////////////||");
        System.out.println("|Two or more pumps of vanilla $1 extra|");
        System.out.println("||///////////////////////////////////||\n");
        System.out.println("Wath do you want?(enter number)");
        order = scanner.nextInt();
        System.out.println("How many pieces?");
        count = scanner.nextInt();
        boolean isIced = order == 1;
        boolean withMatcha = order == 2;
        boolean isLatte = order == 3;
        //
        if (isIced) {
            System.out.println("------------");
            System.out.println("|Latte Iced|");
            System.out.println("------------");
            System.out.println("1.Espreso\n2.Milk\n3.Ice\n4.Syrup\n------------");

        } else if (withMatcha) {
            System.out.println("------------");
            System.out.println("|Latte Matcha|");
            System.out.println("------------");
            System.out.println("1.Matcha\n2.Oat milk\n3.Ice\n4.Vanilla\n------------");

        } else if (isLatte) {
            System.out.println("------------");
            System.out.println("|Latte Simple|");
            System.out.println("------------");
            System.out.println("1.Espresso\n2.Steamed milk\n3.Ice\n4.Vanilla\n------------");

        } else {
            System.out.println("Select a drink to get started");

        }
        if (count > 1) {
            System.out.println("Provide cup holder\n------------");
        } else {
            System.out.println("No cup holder\n------------");
        }
        //Vanilla
        System.out.println("How many pumps of vanilla?");
        vanilla = scanner.nextInt();
        
        if (vanilla >= 2) {
            System.out.println("------------\nCharge $1 extra\n------------");
        } else {
            System.out.println("------------\nNo charge extra\n------------");
        }
    }
}
