package com.example.sx2316079.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUser() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/user?id=1"));

        //校验响应状态码是否为200
        resultActions.andExpect(MockMvcResultMatchers.status().isOk());

        //打印请求响应的对象体
        resultActions.andDo(result -> System.out.println(result.getResponse().getContentAsString(Charset.defaultCharset())));

        //校验结果
        resultActions.andExpect(MockMvcResultMatchers.jsonPath("id").value("1"));
        resultActions.andExpect(MockMvcResultMatchers.jsonPath("username").value("汤玉凡"));
        resultActions.andExpect(MockMvcResultMatchers.jsonPath("password").value("123456"));
        resultActions.andExpect(MockMvcResultMatchers.jsonPath("address").value("南京航空航天大学"));


    }
}


