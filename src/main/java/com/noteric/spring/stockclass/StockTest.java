package com.noteric.spring.stockclass;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class StockTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager em= entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        OptionalStock stockOption  = new OptionalStock();
        stockOption.setTickerSymbol("AAPL");
        stockOption.setStrikePrice(150.0);
        stockOption.setComName("Neoteric pvt.");
        stockOption.setOptionType("put");



       StockFuture futureStock = new StockFuture();
        futureStock.setTickerSymbol("TSLA");
        futureStock.setExpirationDate(new Date());
        futureStock.setComName("fgduywb");


      Restricted  restrictedStock =new Restricted();
        restrictedStock.setTickerSymbol("GDRTX");
        restrictedStock.setVestingPeriod(20);
        restrictedStock.setComName("jhsvbsdg");

        em.persist(stockOption);
        em.persist(futureStock);
        em.persist(restrictedStock);

        em.getTransaction().commit();

        em.close();


    }
}

