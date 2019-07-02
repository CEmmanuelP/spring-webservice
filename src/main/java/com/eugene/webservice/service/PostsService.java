package com.eugene.webservice.service;




import com.eugene.webservice.domain.posts.PostsRepository;
import com.eugene.webservice.web.PostsSaveRequestDto;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

}