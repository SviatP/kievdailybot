package com.daily.bot.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
public class BankRate {
    private String ccy;
    private String base_ccy;
    private String buy;
    private String sale;
//    private BigDecimal rate;
}
