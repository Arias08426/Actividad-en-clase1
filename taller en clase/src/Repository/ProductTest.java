package Repository;
import Model.Product;

import java.util.List;

public interface ProductTest {
     Product findById(Long id);
    List<Product> listAllClient();
}
