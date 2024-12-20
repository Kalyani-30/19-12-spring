package com.noteric.spring.stockclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class StockFuture   extends Stock {



        @Column(name = "expirationDate")
        private Date expirationDate;

        public Date getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
        }
    }

