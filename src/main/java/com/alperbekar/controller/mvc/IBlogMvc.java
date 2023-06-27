package com.alperbekar.controller.mvc;

import com.alperbekar.business.dto.BlogDto;

import java.util.List;

public interface IBlogMvc <T>{
    public BlogDto create(T t);
    public BlogDto delete(T t);
    public BlogDto update(Long id,T t);
    public List<BlogDto> list();
}
