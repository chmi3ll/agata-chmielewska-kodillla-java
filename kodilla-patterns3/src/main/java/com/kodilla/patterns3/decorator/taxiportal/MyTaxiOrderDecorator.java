package com.kodilla.patterns3.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiOrderDecorator  extends AbstractTaxiOrderDecorator {
    public MyTaxiOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //herdcoded stub cost = 30
        return super.getCost().add(new BigDecimal(30));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by MyTaxi Network";
    }
}
