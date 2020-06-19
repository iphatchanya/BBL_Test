import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) throws FileNotFoundException {
        ProductPrice fileSearch = new ProductPrice();
        fileSearch.parseFile("product.dat");
    }

    public void parseFile(String fileName) throws FileNotFoundException {
        System.out.println("    Product Repoty (Price > 5000)" + "\n" +
                "Product Name    " + "Price      " + "Amount" + "\n" +
                "************************************" + "\n");
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine();
            String[] split = line.split("  ");
            if(Integer.parseInt(split[2]) >= 5000){
                System.out.println(split[1] + "        " + split[2] + "      " + split[3]);
            }
        }
    }
}
