package com.igortullio.workshopmongo.domain.dto;

import com.igortullio.workshopmongo.domain.User;
import lombok.Data;

@Data
public class AuthorDTO {
    private String id;
    private String name;

    public AuthorDTO(User user) {
        id = user.getId();
        name = user.getName();
    }

}
