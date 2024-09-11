package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;
import nl.han.aim.oose.dea.helpers.ProductCategory;

import java.util.List;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {
        // return the total cost of all products
        return products.stream()
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        // return the total cost of all gadgets
        return products.stream()
                .filter(p -> p.getCategory().equals(ProductCategory.GADGETS))
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
    }
}
