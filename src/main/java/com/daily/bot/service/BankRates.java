package com.daily.bot.service;

import com.daily.bot.domain.BankRate;

import java.util.Set;

public interface  BankRates {
    Set<BankRate> getRates(String bank);
}
