package com.alperbekar.controller.mvc;

import com.alperbekar.business.dto.BlogDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BlogMvcImpl implements IBlogMvc<BlogDto>{

    @Override
    public BlogDto create(BlogDto blogDto) {
        return null;
    }

    @Override
    public BlogDto delete(BlogDto blogDto) {
        return null;
    }

    @Override
    public BlogDto update(Long id, BlogDto blogDto) {
        return null;
    }

    @Override
    public List<BlogDto> list() {
        return null;
    }

    // Tutorials
    // http://localhost:2222/getData0
    @GetMapping("/getData0")
    @ResponseBody
    public String getThymeLeaf0(){
        return "Sayfasız data";
    }

    // http://localhost:2222/getData1
    @GetMapping("/getData1")
    public String getThymeLeaf1(){
        return "page1";
    }

    // http://localhost:2222/getData2
    @GetMapping("/getData2")
    public String getThymeLeaf2(Model model){
        model.addAttribute("key2","String data");
        return "page2";
    }

    // http://localhost:2222/getData3
    @GetMapping("/getData3")
    public String getThymeLeaf3(Model model){
        BlogDto blogDto = new BlogDto();
        blogDto.setId(1L);
        blogDto.setHeader("Header");
        blogDto.setContent("Content");
        model.addAttribute("key3", blogDto);
        return "page3";
    }

    // http://localhost:2222/getData4
    // http://localhost:2222/getData4/0
    // http://localhost:2222/getData4/1
    @GetMapping({"/getData4","/getData4/{id}"})
    public String getThymeLeaf4(@PathVariable(name = "id",required = false) Long id,Model model){
        BlogDto blogDto = new BlogDto();
        blogDto.setId(id);
        blogDto.setContent("content");
        blogDto.setHeader("header");
        if (blogDto.getId() == 0){
            model.addAttribute("key4","Bad Request");
        } else if (blogDto.getId()==null) {
            model.addAttribute("key4","Not Found Exception");
        }
        else {
            model.addAttribute("key4",blogDto);
        }
        return "page4";
    }

    // http://localhost:2222/getData5?id=5
    @GetMapping("/getData5")
    public String getThymeLeaf5(@RequestParam(name = "id",required = false,defaultValue = "1") Long id, Model model){
        BlogDto blogDto = new BlogDto();
        blogDto.setId(id);
        blogDto.setContent("content");
        blogDto.setHeader("header");
        if (blogDto.getId() == 0){
            model.addAttribute("key4","Bad Request");
        } else if (blogDto.getId()==null) {
            model.addAttribute("key4","Not Found Exception");
        }
        else {
            model.addAttribute("key4",blogDto);
        }
        return "page4";
    }
}
