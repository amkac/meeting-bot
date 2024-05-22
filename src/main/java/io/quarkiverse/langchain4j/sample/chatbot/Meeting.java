package io.quarkiverse.langchain4j.sample.chatbot;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.List;
public record Meeting(String meetingId, String summary, String date, String location, List<Task> tasks) {

    @JsonCreator
    public Meeting {
    }

}
