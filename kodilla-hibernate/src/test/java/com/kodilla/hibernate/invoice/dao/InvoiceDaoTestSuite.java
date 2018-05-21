package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        Product product1 = new Product("jabłko");
        Product product2 = new Product("rzodkiewka");
        Product product3 = new Product("ser");

        Item item1 = new Item(product1, new BigDecimal("2"), 10);
        Item item2 = new Item(product2, new BigDecimal("4"), 30);
        Item item3 = new Item(product3, new BigDecimal("34"), 1);

        Invoice invoice = new Invoice("12345");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(1, id);

        //CleanUp
        invoiceDao.deleteAll();

    }

}
