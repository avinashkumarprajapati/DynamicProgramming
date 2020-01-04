package com.avinash.knapsack;

import java.applet.Applet;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlgorithmKnapsack {
    static double sum = 0;
    static KnapsackWarehouse warehouse = new KnapsackWarehouse();
    static double limit = 5;// limit to carry is 5kg
    static double remainingWeight = limit;
    static String[] headers = {"qytP", "qtyQ", "qtyR", "Profit"}; // taken quantities

    static class MVandRL {
        static int maxValue;

        static ArrayList<Integer> remainingList = new ArrayList();

        public static void findMVandRL(ArrayList<Integer> warehouseValuesList) {

            // delete from list
            //  remainingList = (ArrayList) warehouseValuesList.remove(index);
            //  Predicate<Integer> p = warehouseValuesList.
            if (warehouseValuesList.size() > 0) {
                maxValue = (int) Collections.max(warehouseValuesList);
                int index = warehouseValuesList.indexOf(maxValue);
                remainingList = (ArrayList<Integer>) warehouseValuesList.stream().filter(i -> i < maxValue).collect(Collectors.toList());
            }

        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> results = new ArrayList();
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("orange", 0.5, 100, 1));
        products.add(new Product("apple", 0, 50, 1));
        products.add(new Product("strawberry", 0, 25, 1));
        warehouse.setProductList(products);
        //sorting  according to the priceValues for the
        warehouse.getProductList().sort((a, b) -> {
            return a.getPriceValue() > b.getPriceValue() ? 1 : a.getPriceValue() < b.getPriceValue() ? 0 : -1;
        });
        double maxProfit = calculateMaxProfit();
        System.out.println("maxProfit= " + maxProfit);
    }

    private static double calculateMaxProfit() {

        warehouse.getProductList().stream().forEach(product ->
        {
            double val = product.getQunatity() * product.getWeight();
            if (val >= remainingWeight && remainingWeight > 0) {
                sum += remainingWeight * product.getPriceValue();
            } else if (val < remainingWeight && remainingWeight > 0) {
                sum += val * product.getPriceValue();
            }
            remainingWeight = remainingWeight - val; // decrement
        });

        return sum;
    }

}
