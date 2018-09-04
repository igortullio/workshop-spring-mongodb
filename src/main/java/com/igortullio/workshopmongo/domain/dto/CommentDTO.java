package com.igortullio.workshopmongo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private String text;
    private Date date;
    private AuthorDTO author;
}
