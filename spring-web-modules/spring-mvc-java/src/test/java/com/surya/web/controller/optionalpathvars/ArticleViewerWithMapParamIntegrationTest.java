package com.surya.web.controller.optionalpathvars;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.surya.model.Article;
import com.surya.spring.web.config.WebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { WebConfig.class })
public class ArticleViewerWithMapParamIntegrationTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void givenPathVarsMapParam_whenIdPathVariableIsPassed_thenResponseOK() throws Exception {
        
        int articleId = 5;
        
        this.mockMvc
            .perform(MockMvcRequestBuilders.get("/mapParam/article/{id}", articleId))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(articleId));
               
    }

    @Test
    public void givenPathVarsMapParam_whenIdPathVariableIsNotPassed_thenResponseOK() throws Exception {
                
        this.mockMvc
            .perform(MockMvcRequestBuilders.get("/mapParam/article"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(Article.DEFAULT_ARTICLE.getId()));
               
    }

    
}