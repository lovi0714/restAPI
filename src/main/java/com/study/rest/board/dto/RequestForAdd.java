package com.study.rest.board.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Getter
public class RequestForAdd {
    private final String writer;
    private final String title;
    private final String content;
    private final LocalDateTime regDate;

    @JsonCreator
    public RequestForAdd(@JsonProperty("writer") String writer,
                         @JsonProperty("title") String title,
                         @JsonProperty("content") String content) {
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regDate = LocalDateTime.now();
    }
}
