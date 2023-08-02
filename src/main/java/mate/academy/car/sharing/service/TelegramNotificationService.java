package mate.academy.car.sharing.service;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public abstract class TelegramNotificationService extends TelegramLongPollingBot {
    public abstract void sendMessage(String chatId, String message);
    public abstract void registerBot();
}