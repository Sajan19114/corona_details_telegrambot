package com.test.tsting.my_test_testing;

import java.io.IOException;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class bottest extends TelegramLongPollingBot {
	String data;

	@Override
	public void onUpdateReceived(Update update) {
		;
		if(update.hasMessage())
		{

			if(update.getMessage().getText()!=null)
			{ 
				System.out.println(update.getMessage().getText());
				if(update.getMessage().getText().equals("/start"))
				{
				String text="hello-"+ update.getMessage().getFrom().getFirstName();
				String country="enter country :";
				
				
				SendMessage message=new SendMessage(update.getMessage().getChatId().toString(),text);
				SendMessage message1=new SendMessage(update.getMessage().getChatId().toString(),country);
				
				
				
			try {
				execute(message);
			} catch (TelegramApiException e) {
				
				e.printStackTrace();
			}
			try {
				execute(message1);
			} catch (TelegramApiException e) {
			
				e.printStackTrace();
			}
			}
				String regex = "^[a-zA-Z]+$";
				String s=update.getMessage().getText().toLowerCase();
//				System.out.println(s);
				if(s.matches(regex)){
					String text2="Estimated Waiting Time 30 second"+"\n your result  "+s;
					WebScrapingExample wse=new WebScrapingExample();
					try {
//						System.out.println(s);
//						ye bahut important hai nich wala line
					   data = WebScrapingExample.coronarecord(s);
					    System.out.println("the data is "+data);
					    
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					SendMessage message3=new SendMessage(update.getMessage().getChatId().toString(),text2);

					String datafromwebscrap=data;
					System.out.println(data);
					SendMessage message4=new SendMessage(update.getMessage().getChatId().toString(),data);
					try {
						execute(message3);
					} catch (TelegramApiException e) {
					
						e.printStackTrace();
					}
					try {
						execute(message4);
					} catch (TelegramApiException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
		{  
		}
				}
		}
	}
		
	

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "test22_22_bot";
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return "5878514563:AAHtaBj88Y_utZ0sRpOsgj68ZPl3fwspMaM";
	}

}
