package com.avinash.knapsack;


import java.util.ArrayList;
import java.util.List;

public class KnapsackWarehouse {
    /* String[] qytNames = {"p", "q", "r"};
     int[] weights = {2, 1, 1};
     int[] qty = {1, 5, 2};
     Integer[] value = {100, 50, 25};*/
    private List<Product> productList;
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public List<Product> getProductList() {
        return productList;
    }
}
