package com.zrysj.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.multi.MultiRootPaneUI;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zrysj.po.Goods;
import com.zrysj.po.User;
import com.zrysj.po.UserVo;

@Controller
@RequestMapping("/page")
public class UserController {
	// http://127.0.0.1/20180103/page/aa1.action
	@RequestMapping("aa1")
	public void aa1(){
		System.out.println("我是aa1");
	}
	@RequestMapping(value={"aa2","a2"})
	// http://127.0.0.1/20180103/page/aa2.action
	// http://127.0.0.1/20180103/page/a2.action
	public void aa2(){
		System.out.println("我是aa2");
	}
	// http://127.0.0.1/20180103/page/a3.action
	@RequestMapping(value={"aa3","a3"},method=RequestMethod.GET)
	public void aa3(){
		System.out.println("我是aa3");
	}
	// http://127.0.0.1/20180103/page/a4.action
	@RequestMapping(value={"aa4","a4"},method=RequestMethod.POST)
	public void aa4(){
		System.out.println("我是aa4");
	}
	// http://127.0.0.1/20180103/page/a5.action
	@RequestMapping(value={"aa5","a5"},method={RequestMethod.GET,RequestMethod.POST})
	public void aa5(){
		System.out.println("我是aa5");
	}
	@RequestMapping(value={"aa6","a6"},method={RequestMethod.GET,RequestMethod.POST})
	public void aa6(Date riqi){
		System.out.println(riqi);
		System.out.println("------");
	}
	// http://127.0.0.1/20180103/page/aa7.action
	@RequestMapping("aa7")
	public void aa7(String[] names){
		for(String name :names){
			System.out.println(name);
		}
	}
	@RequestMapping("aa8")
	public void aa8(UserVo userVo){
		System.out.println(userVo);
	}
	@RequestMapping("aa9")
	public String aa9(){
		//请求转发
		//return "table";
		//重定向
		return "redirect:user.jsp";
	}
	@RequestMapping("aa10")
	public void aa10(HttpServletRequest req, HttpServletResponse resp) {
		try {
			// 注意试图解析器不好用
			req.getRequestDispatcher("user.jsp").forward(req, resp);
//			resp.sendRedirect("user.jsp");
//			resp.getWriter().print("json数据");
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("aa11")
	public @ResponseBody User aa11(){
		User user = new User();
		user.setId(1);
		user.setName("小红");
		user.setPwd("1234");
		return user;
	}
	@RequestMapping("aa12")
	public void aa12(@RequestBody String user){
		System.out.println("aa12");
		System.out.println(user);
	}
	@RequestMapping("aa13")
	public void aa13(MultipartFile img) throws IllegalStateException, IOException{
		// 上传的老名字
		System.out.println(img.getOriginalFilename());
		// 文件类型
		//System.out.println(img.getName());
		String newImg = UUID.randomUUID().toString().replace("-", "")+img.getOriginalFilename();
		// 把文件写到哪里
		img.transferTo(new File("e:\\aa\\"+newImg));
	}
	//http://127.0.0.1/20180103/page/aa14/2.action
	@RequestMapping(value="/aa14/{id}",method=RequestMethod.GET)
	public void aa14(@PathVariable("id") int id){
		System.out.println(id);
	}

}
