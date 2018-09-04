package com.igortullio.workshopmongo.service;

import com.igortullio.workshopmongo.domain.Post;
import com.igortullio.workshopmongo.repository.PostRepository;
import com.igortullio.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public static final String OBJETO_NÃO_ENCONTRADO = "Objeto não encontrado";

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return  post.orElseThrow(() -> new ObjectNotFoundException(OBJETO_NÃO_ENCONTRADO));
    }

    public List<Post> findByTitle(String text) {
        return postRepository.findByTitle(text);
    }

}
