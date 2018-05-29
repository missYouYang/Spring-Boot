package com.example.demo.IndexController;

import com.example.demo.controller.ControllerIndex;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by Lenovo on 2018/5/24.
 */

// >>> spring boot 1.4.0 版本之前使用以下三个配置
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = DemoApplication.class)  //在spring boot 1.4.0 版本之后取消了 //classes需要指定spring boot 的启动类如：DemoApplication.class 不然WebApplicationContext不被实例化
//@WebAppConfiguratio
@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexControllerTests {

//    @Autowired
//    private WebApplicationContext context;

    //mock api 模拟http请求
    private MockMvc mockMvc;

    //初始化工作
    @Before
    public void setUp() {
        //独立安装测试
        mockMvc = MockMvcBuilders.standaloneSetup(new ControllerIndex()).build();
        //集成Web环境测试（此种方式并不会集成真正的web环境，而是通过相应的Mock API进行模拟测试，无须启动服务器）
        //mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    //测试
    @Test
    public void index() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/index")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("index")));
    }

}
