package com.noteric.spring.stockclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



    @Entity
    @Table
    public class OptionalStock extends Stock {
        @Column(name = "strikePrice")
        private Double strikePrice;

        @Column(name = "optionType")
        private String optionType;

        public Double getStrikePrice() {
            return strikePrice;
        }

        public void setStrikePrice(Double strikePrice) {
            this.strikePrice = strikePrice;
        }

        public String getOptionType() {
            return optionType;
        }

        public void setOptionType(String optionType) {
            this.optionType = optionType;
        }
    }

