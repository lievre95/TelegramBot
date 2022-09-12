package com.bot;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.time.LocalTime;
import java.util.UUID;

@ApplicationScoped
@Path("message")
public class MessageCalculator {
    @Inject
    TelegramBot bot;

    @GET
    public String message() {
        String message = "Now it is " + LocalTime.now() + ": " + UUID.randomUUID();
        bot.sendMessage(message);
        return message; //TODO replace this stub to something useful
    }
}
