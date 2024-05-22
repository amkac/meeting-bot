package io.quarkiverse.langchain4j.sample.chatbot;

import com.fasterxml.jackson.annotation.JsonCreator;

public record Task(String assignee, String subject, String taskContent) {

    @JsonCreator
    public Task {
    }

}
