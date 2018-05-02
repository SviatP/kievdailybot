package com.daily.bot.service.impl;


import com.daily.bot.domain.BankRate;
import com.daily.bot.service.BankRates;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableSet;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

@Service
public class BankRatesImpl implements BankRates {

    public final static String PRIVAT_API_RATES = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";

    @Override
    public Set<BankRate> getRates(String bank) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return ImmutableSet
                    .<BankRate>builder()
                    .addAll((Set<? extends BankRate>) objectMapper.readValue(new URL(PRIVAT_API_RATES), objectMapper
                            .getTypeFactory().constructCollectionType(Set.class, BankRate.class)))
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
