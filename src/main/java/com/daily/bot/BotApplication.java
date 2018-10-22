package com.daily.bot;

import com.daily.bot.config.EnableTelegramBots;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
@EnableTelegramBots
public class BotApplication {

	public static void main(String[] args) {
        ApiContextInitializer.init();
		SpringApplication.run(BotApplication.class, args);

//        TelegramBotsApi botsApi = new TelegramBotsApi();
//        botsApi.registerBot(new DailyBot());

	}
}
