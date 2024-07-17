package me.junghaein.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.junghaein.springbootdeveloper.domain.Article;
import me.junghaein.springbootdeveloper.dto.AddArticleRequest;
import me.junghaein.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
