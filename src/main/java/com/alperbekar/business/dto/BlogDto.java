package com.alperbekar.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@Log4j2
@AllArgsConstructor
public class BlogDto implements Serializable {
    public static final Long serialVersionUID = 1l;

    private Long id;
    private String header;
    private String content;
    private Date createdDate;

    public BlogDto() {
        createdDate = new Date(System.currentTimeMillis());
    }
}
