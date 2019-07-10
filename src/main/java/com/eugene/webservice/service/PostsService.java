package com.eugene.webservice.service;




import com.eugene.webservice.domain.posts.PostsRepository;
import com.eugene.webservice.dto.posts.PostsMainResponseDto;
import com.eugene.webservice.dto.posts.PostsSaveRequestDto;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.stream.Collectors;
import java.util.List;

@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }

}
