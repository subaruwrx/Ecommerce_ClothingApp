package cput.za.ac.ecommerce_clothingapp.factories;

import java.util.Map;

import cput.za.ac.ecommerce_clothingapp.domain.Sale;

/**
 * Created by Admin on 2016-04-20.
 */
public class Sale_Factory {

    private static Sale_Factory instance=null;

    private Sale_Factory(){}

    public static Sale_Factory getInstance() {
        if (instance == null) {
            instance = new Sale_Factory();

        }
        return instance;
    }

    public Sale createSales(char saleDocumentNum , Map<String,String> values, int num) {
        Sale sale= new Sale
                .Builder(saleDocumentNum)
                .creditType(values.get("creditType"))
                .orderStatus(values.get("orderStatus"))
                .invoiceNumber(num)
                .quantity(num)
                .build();
        return sale;

    }
}
