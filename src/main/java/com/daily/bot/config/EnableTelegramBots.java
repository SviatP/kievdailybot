package com.daily.bot.config;

import org.springframework.context.annotation.Import;

/**
 * Imports configuration #TelegramBotStarterConfiguration in spring context.
 */
@Import(TelegramBotStarterConfiguration.class)
public @interface EnableTelegramBots {
}