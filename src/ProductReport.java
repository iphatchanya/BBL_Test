import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductReport {
    public static void main(String[] args) throws FileNotFoundException {
        ProductReport fileSearch = new ProductReport();
        fileSearch.parseFile("product.dat");
    }

    public void parseFile(String fileName) throws FileNotFoundException {
        System.out.println("    Purchase Report" + "\n" +
                "Id    " + "Product Name     " + "Price     " + "Amount to buy" + "\n" +
                "*************************************************" + "\n");
        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] split = line.split("  ");
            if(Integer.parseInt(split[3]) <= 5) {
                int result = 5 + Integer.parseInt(split[4]) - Integer.parseInt(split[3]);
                System.out.println(split[0] + "   " + split[1] + "      " + split[2] + "       " + result);
            }
        }
    }
}
