package com.daily.bot;

import com.daily.bot.bot.DailyBot;
import com.daily.bot.config.EnableTelegramBots;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

@SpringBootApplication
@EnableTelegramBots
public class BotApplication {

	public static void main(String[] args) throws TelegramApiRequestException {
        ApiContextInitializer.init();
		SpringApplication.run(BotApplication.class, args);

//        TelegramBotsApi botsApi = new TelegramBotsApi();
//        botsApi.registerBot(new DailyBot());

	}
}
