package org.session.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Laptop : Dell",35000f));
        productList.add(new Product(2,"Laptop : bag",2500f));
        productList.add(new Product(3,"Water bottle",1000f));
        productList.add(new Product(4,"Book",500f));
        productList.add(new Product(5,"Laptop : HP",50000f));
        productList.add(new Product(6,"Mobile cover",1000f));

        System.out.println(productList);
        List<Float> productPriceList = new ArrayList<>();
        for (Product product : productList){
            if (product.price>2000){
                productPriceList.add(product.price);
            }
        }
        System.out.println("Products having price > 2000 : "+productPriceList);

        System.out.println("****************************");
        List<Float> productPriceList1 = productList.stream().filter(p->p.price>2000).map(p->p.price).collect(Collectors.toList());
        System.out.println("Product list using stream : "+productPriceList1);

        System.out.println("****************************");
        long count = productPriceList1.stream().count();
        System.out.println("No of products having price greater than 3000 :"+count);

        System.out.println("****************************");
        System.out.println("For each : ");
        productList.stream().filter(product->product.price==1000).forEach(product -> System.out.println(product.name));
        productList.stream().filter(product->product.price==1000).limit(1).forEach(product -> System.out.println(product.name));

        System.out.println("****************************");
        Product productMax = productList.stream().max((product1,product2)->product1.price > product2.price ? 1 : -1).get();
        System.out.println("Product having maximum price : "+productMax);

        Product productMin = productList.stream().min((product1,product2)->product1.price > product2.price ? 1 : -1).get();
        System.out.println("Product having minimum price : "+productMin);
    }
}
