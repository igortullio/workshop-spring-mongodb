package com.igortullio.workshopmongo.resources;

import com.igortullio.workshopmongo.domain.Post;
import com.igortullio.workshopmongo.domain.User;
import com.igortullio.workshopmongo.domain.dto.UserDTO;
import com.igortullio.workshopmongo.service.PostService;
import com.igortullio.workshopmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        return ResponseEntity.ok().body(postService.findById(id));
    }

}
