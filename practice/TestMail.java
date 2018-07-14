package com.practice;

public class TestMail {
	public static void main(String[] args) {
		//163邮箱请使用下面这个
		while (true)
		{
			Mail mail = new Mail();
			mail.setHost("smtp.163.com"); // 设置邮件服务器,如果不用163的,自己找找看相关的
			mail.setSender("xxxx@163.com");	//邮箱账号
			mail.setReceiver("xxxxx@163.com"); // 接收人
			mail.setUsername("xxx@163.com"); // 登录账号,一般都是和邮箱名一样吧
			mail.setPassword("xx"); // 发件人邮箱的登录密码
			mail.setSubject("测试");
			mail.setMessage("这是一个测试程序");
			new MailUtil().send(mail);

		}
		
	}

}
