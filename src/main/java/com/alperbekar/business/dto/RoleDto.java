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
public class RoleDto implements Serializable {
    public static final Long serialVersionUID = 1L;

    private Long roleId;
    private String roleName;
    private Date createdDate;
}
