package com.daily.bot.bot;

import com.daily.bot.domain.BankRate;
import com.daily.bot.service.BankRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class DailyBot extends TelegramLongPollingBot {

    @Autowired
    private BankRates service;

    @Override
    public void onUpdateReceived(Update update) {

        Set<BankRate> bankRates = processRateParsing(update.getMessage().getText());

        try {
            sendMessage(new SendMessage(update.getMessage().getChatId(), bankRates.stream().map((rate) ->
                    new StringBuilder()
                            .append(rate.getCcy()).append(" ")
                            .append(rate.getBuy()).append(" ")
                            .append(rate.getSale())
            ).collect(Collectors.joining("\n"))));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getBotUsername() {
        return "dailyBot";
    }

    @Override
    public String getBotToken() {
        return "148637856:AAEr6HQo7AKAzGw1Kl_evJas3LkFacErYSI";
    }

    private Set<BankRate> processRateParsing(String a) {

        return a.contains("rate")
                ? service.getRates("PR")
                : null;
    }
}
