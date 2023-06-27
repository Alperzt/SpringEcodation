package com.alperbekar.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

@Data
@Builder
@Log4j2
@AllArgsConstructor
public class CategoryDto {
    private Long id;
    private String categoryName;
    private Date createdDate;
}
