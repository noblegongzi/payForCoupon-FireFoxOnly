<%@page import="com.alipay.api.internal.util.AlipaySignature"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.util.Map"%>
<%@ page import="com.zsy.config.*"%>
<%@ page import="com.alipay.api.*"%>
<%
/* *
 功能：支付宝页面跳转同步通知页面
 版本：3.2
 日期：2011-03-17
 说明：
 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。

 //***********页面功能说明***********
 该页面可在本机电脑测试
 可放入HTML等美化页面的代码、商户业务逻辑程序代码
 TRADE_FINISHED(表示交易已经成功结束，并不能再对该交易做后续操作);
 TRADE_SUCCESS(表示交易已经成功结束，可以对该交易做后续操作，如：分润、退款等);
 //********************************
 * */
%>
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>支付宝页面跳转同步通知页面</title>
  </head>
  <body>
<%
	//获取支付宝GET过来反馈信息
	Map<String,String> params = new HashMap<String,String>();
	Map requestParams = request.getParameterMap();
	for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
		String name = (String) iter.next();
		String[] values = (String[]) requestParams.get(name);
		String valueStr = "";
		for (int i = 0; i < values.length; i++) {
			valueStr += (i == values.length - 1) ? values[i]
					: values[i] + ",";
		}
		//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
		valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
		params.put(name, valueStr);
	}
	
	//获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
	//商户订单号

	String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

	//支付宝交易号

	String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

	//获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//
	//计算得出通知验证结果
	//boolean AlipaySignature.rsaCheckV1(Map<String, String> params, String publicKey, String charset, String sign_type)
	boolean verify_result = AlipaySignature.rsaCheckV1(params, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET, "RSA2");
	
	if(verify_result){//验证成功
		//////////////////////////////////////////////////////////////////////////////////////////
		//请在这里加上商户的业务逻辑程序代码
		//该页面可做页面美工编辑
		String name=trade_no;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql:///abslink?serverTimezone=Asia/Shanghai","root","627475");
		PreparedStatement statementQuery=connection.prepareStatement("select * from name_FireFoxOnly where name=?");
		PreparedStatement statementAdd=connection.prepareStatement("insert into name_FireFoxOnly values(null,?,1)");
		statementQuery.setString(1, name);
		ResultSet rs=statementQuery.executeQuery();
		if(!rs.first()){
			statementAdd.setString(1, name);
			statementAdd.execute();
		}
		out.clear();
		out.println("支付成功<br />因此链接只能使用一次，故使用链接时请耐心等待，不可刷新。<br/>请妥善保管这个链接。<br/>");
		out.println("<a href='http://47.100.22.19:8080/abstractlink-FireFoxOnly/?name="+name+"'>http://47.100.22.19:8080/abstractlink-FireFoxOnly/?name="+name+"</a>");
		//out.println("<a href='http://localhost:8080/abstractlink-FireFoxOnly/?name="+name+"'>http://47.100.22.19:8080/abstractlink-FireFoxOnly/?name="+name+"</a>");

		//——请根据您的业务逻辑来编写程序（以上代码仅作参考）——

		//////////////////////////////////////////////////////////////////////////////////////////
	}else{
		//该页面可做页面美工编辑
		out.clear();
		out.println("你未完成支付，请正确按照支付步骤进行支付。");
	}
%>
  </body>
</html>