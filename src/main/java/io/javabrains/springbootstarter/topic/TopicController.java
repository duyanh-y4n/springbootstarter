package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @Autowired //Dependency injection
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return this.topicService.getAllTopics();
    }

    @RequestMapping("/topics/{foo}") //foo is path variabale
    public Topic getTopicById(@PathVariable("foo") String id){ //foo here is passed into id parameter
        return this.topicService.getTopicById(id);
    }

}
