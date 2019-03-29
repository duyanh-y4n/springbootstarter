package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Awesome Topic", "some description"),
            new Topic("2", "Ok Topic", "some description"),
            new Topic("3", "New Topic", "some description"),
            new Topic("4", "Old Topic", "some description")
    );

    List<Topic> getAllTopics() {
        return this.topics;
    }
}
