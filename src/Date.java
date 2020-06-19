import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter day month year : ");
        input = scanner.nextLine();
        String[] split = input.split(" ");

        if (split[1].equals("January")) {
            split[1] = split[1].replace("January", "1");
        }
        else if(split[1].equals("February")) {
            split[1] = split[1].replace("February", "2");
        }
        else if(split[1].equals("March")) {
            split[1] = split[1].replace("March", "3");
        }
        else if(split[1].equals("April")) {
            split[1] = split[1].replace("April", "4");
        }
        else if(split[1].equals("May")) {
            split[1] = split[1].replace("May", "5");
        }
        else if(split[1].equals("June")) {
            split[1] = split[1].replace("June", "6");
        }
        else if(split[1].equals("July")) {
            split[1] = split[1].replace("July", "7");
        }
        else if(split[1].equals("August")) {
            split[1] = split[1].replace("August", "8");
        }
        else if(split[1].equals("September")) {
            split[1] = split[1].replace("September", "9");
        }
        else if(split[1].equals("October")) {
            split[1] = split[1].replace("October", "10");
        }
        else if(split[1].equals("November")) {
            split[1] = split[1].replace("November", "11");
        }
        else if(split[1].equals("December")) {
            split[1] = split[1].replace("December", "12");
        }
        System.out.println(split[0] + "/" + split[1] + "/" + (Integer.parseInt(split[2])+543));


    }
}
