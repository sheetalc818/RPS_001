package org.mypractice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterWithStream {
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1,"HP Laptop",25000f));
            productsList.add(new Product(2,"Dell Laptop",30000f));
            productsList.add(new Product(3,"Lenevo Laptop",28000f));
            productsList.add(new Product(4,"Sony Laptop",28000f));
            productsList.add(new Product(5,"Apple Laptop",90000f));
            List<Float> productPriceList2 =productsList.stream()
                    .filter(p -> p.price > 30000)// filtering data
                    .map(p->p.price)        // fetching price
                    .collect(Collectors.toList()); // collecting as list
            System.out.println(productPriceList2);

            // max() method to get max Product price
            Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();
            System.out.println(productA.price);

            // min() method to get min Product price
            Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
            System.out.println(productB.price);

            Map<Integer,String> productPriceMap = productsList.stream()
                            .collect(Collectors.toMap(p->p.id, p->p.name));
            System.out.println("Map :"+productPriceMap);
        }
}
