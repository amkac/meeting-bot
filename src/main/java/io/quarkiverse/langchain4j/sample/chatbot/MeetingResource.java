package io.quarkiverse.langchain4j.sample.chatbot;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("/summary")
public class MeetingResource {

    @Inject
    Bot bot;

    @POST
    public Meeting summary(String body) {
        return bot.chat(body);
    }

}
