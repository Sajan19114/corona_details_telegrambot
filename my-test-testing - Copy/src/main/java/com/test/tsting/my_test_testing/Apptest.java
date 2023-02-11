package com.test.tsting.my_test_testing;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Apptest 
{
	
	
	
    public static void main( String[] args ) throws Exception
    {
       
    	try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new bottest());
            System.out.println("Bot Started realy sahi mai Successfully");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
//
       
        
    }

	


}
