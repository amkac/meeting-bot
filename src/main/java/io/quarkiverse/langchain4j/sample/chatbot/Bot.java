package io.quarkiverse.langchain4j.sample.chatbot;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService// no need to declare a retrieval augmentor here, it is automatically generated and discovered
@ApplicationScoped
public interface Bot {

    @SystemMessage("""
            You are an AI assistant named Bob answering questions about team meetings.
            You will summarize meeting discussions, highlighting key points, action items, decisions made, and actions to do be done.
            You must Analyze the meeting transcript and identify all tasks and actions to be taken or be done for each participant.
            Each participant must have at least one task.
            Assign each task to the appropriate participant.
            You will always answer with a JSON document, and only this JSON document.
            
            When you don't know, respond that you don't know the answer. Your response must be polite.
            
            when you are asked about your role or what can you will only Introduce yourself with: "Hello, I'm Bob, I can help you with your meeting"
            """)
    Meeting chat(@UserMessage String question);
}
