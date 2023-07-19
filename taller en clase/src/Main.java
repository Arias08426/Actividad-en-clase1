import Model.Product;

import java.awt.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.print("Menu \n 1. Obtener una lista de productos pertenecientes a la categoría “Libros” con\n" +
                "precio > 100  \n 2. Obtener una lista de pedidos con productos pertenecientes a la categoría\n" +
                "“Bebé” \n 3. Obtenga una lista de productos con categoría = \"Juguetes\" y luego aplique un\n" +
                "10% de descuento" +
                "\n 4. Obtenga una lista de productos pedidos por el cliente del nivel 2 entre el 01\n" +
                "de febrero de 2021 y el 01 de abril de 2021  \n 5. Salir \n =>");

    }

    private static List<Product> getProduct() {
        Product product1 = new Product(1l, "Book1A", 50000);
        Product product2 = new Product(2d, "Book1B", 20000);
        Product product3 = new Product(3, "Book2", 30000);

        public static void ProductBooks () {
            List<Product> result = ProductTest.findAll()
                    .stream()
                    .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                    .filter(p -> p.getPrice() > 100)
                    .collect(Collectors.toList());
        }
    }
}