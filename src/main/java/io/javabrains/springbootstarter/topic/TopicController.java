package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Awesome Topic", "some description"),
                new Topic("2", "Ok Topic", "some description"),
                new Topic("3", "New Topic", "some description"),
                new Topic("4", "Old Topic", "some description")
        );
    }


}
