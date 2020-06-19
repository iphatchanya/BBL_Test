import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductSearch {
    public static void main(String[] args) throws FileNotFoundException {
        ProductSearch fileSearch = new ProductSearch();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter Product Name : ");
        input = scanner.nextLine();
        fileSearch.parseFile("product.dat", input);
    }

    public void parseFile(String fileName, String searchStr) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine();
            if(line.contains(searchStr)){
                String[] split = line.split("  ");
                System.out.println(split[1] + " - " + split[2] + " bahts" + "\n" +
                                    "          - " + split[3] + " units");
            }
        }
    }
}

