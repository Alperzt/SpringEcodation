package com.alperbekar.main;

import com.alperbekar.data.entity.BlogEntity;
import com.alperbekar.data.entity.CategoryEntity;
import com.alperbekar.data.repository.IBlogRepository;
import com.alperbekar.data.repository.ICategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

// LOMBOK
@RequiredArgsConstructor

@Configuration
public class ManyToOneCommandLineRunner {
    private final IBlogRepository iBlogRepository;
    private final ICategoryRepository iCategoryRepository;
    @Bean
    @Transactional // save, delete, create
    public void manyToOneStatement(){
        // Tekilden Başla
        // Blog(1) Category(N)
        BlogEntity blog = new BlogEntity();
        blog.setHeader("header-1");
        blog.setContent("content-1");
        iBlogRepository.save(blog);

        // Category(N) Blog(1)
        CategoryEntity category1 = new CategoryEntity();
        String user = JOptionPane.showInputDialog("Lütfen kategori adını yazınız");
        user = user.toUpperCase();
        category1.setCategoryName(user);
        category1.setBlogEntity(blog);
        iCategoryRepository.save(category1);

        CategoryEntity category2 = new CategoryEntity();
        String user2 = JOptionPane.showInputDialog("Lütfen kategori adını yazınız");
        user2 = user2.toUpperCase();
        category2.setCategoryName(user2);
        category2.setBlogEntity(blog);
        iCategoryRepository.save(category2);

    }
    // CommandLineRunner

    public CommandLineRunner manyToOneResult(){
        return (args)->{
            manyToOneStatement();
        };
    }
}
