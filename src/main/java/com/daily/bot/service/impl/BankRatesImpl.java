package com.daily.bot.service;

import com.daily.bot.domain.BankRate;

import java.util.Set;

public class BankRatesImpl implements BankRates {
    public final String PRIVAT_API_RATES = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
    @Override
    public Set<BankRate> getRates(String bank) {
        return null;
    }
}
