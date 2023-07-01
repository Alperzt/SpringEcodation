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
public class UserDto implements Serializable {
    public static final Long serialVersionUID = 1L;

    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Date createdDate;
}
