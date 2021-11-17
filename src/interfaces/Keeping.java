/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

import myclasses.Customer;
import myclasses.History;
import myclasses.Product;

public interface Keeping {
    public void saveProducts(List<Product> productsArray);
    public List<Product> loadProducts();

    public void saveCustomers(List<Customer> customersArray);
    public List<Customer> loadCustomers();

    public void saveHistorys(List<History> historysArray);
    public List<History> loadHistory();
}