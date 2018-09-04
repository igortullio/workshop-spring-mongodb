package com.igortullio.workshopmongo.domain;

import com.igortullio.workshopmongo.domain.dto.AuthorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document
public class Post {
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;
}
