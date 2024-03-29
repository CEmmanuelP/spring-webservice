package com.eugene.webservice.web;

import com.eugene.webservice.domain.posts.PostsRepository;
import com.eugene.webservice.dto.posts.PostsSaveRequestDto;
import com.eugene.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class WebRestController {

    private PostsService postsService;
    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Helloworld";
    }


    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
