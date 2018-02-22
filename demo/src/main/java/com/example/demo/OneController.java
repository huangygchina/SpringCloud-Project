package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class OneController {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    @RequestMapping("/newUser")
    @ResponseBody
    public String index(){
        
		try {
			String sql = "insert into user_login (SYS_CD,USER_ID,TEL_NO,DELETEFLAG) values ('1','20180214','1388888888','0')";
			jdbcTemplate.update(sql);
			System.out.println("执行完成");
		} catch (Exception e) {

		} finally {

		}
        
        return "hello spring boot";
    }

}
