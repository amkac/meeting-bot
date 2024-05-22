package io.quarkiverse.langchain4j.sample.chatbot;


import dev.langchain4j.agent.tool.Tool;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class TaskService {

    @Tool("create a task for the assignee")
    public void createTask(String assignee, String content) {
        Log.info("Creating a task assigned to " + assignee + " with current content : " + content);
    }

//    @Tool("create system meeting tasks")
//    public void createTasks(List<Task> tasks) {
//        for (var task : tasks) {
//            Log.info("Creating a task assigned to " + task.assignee + " with current content : " + task.taskContent);
//
//        }
//    }
}
