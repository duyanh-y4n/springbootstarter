package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Awesome Topic", "some description"),
            new Topic("2", "Ok Topic", "some description"),
            new Topic("3", "New Topic", "some description"),
            new Topic("4", "Old Topic", "some description")
    ));

    public List<Topic> getAllTopics() {
        return this.topics;
    }
    
    public Topic getTopicById(String id) {
        for (Topic topic :
                this.topics) {
            if (topic.getId().equals(id)) return topic;
        }
        return new Topic("-1", "Topic not found", "");
    }

    public void addTopic(Topic topic){
        this.topics.add(topic);
    }
}
