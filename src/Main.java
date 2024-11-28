//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        productList("Laranja", 12.20);
        productList("Banana", 17.50);
    }
    public static void productList(String productName, Double productValue) {
        System.out.println(productName + " - " + productValue);
    }
}