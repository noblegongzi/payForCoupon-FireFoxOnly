package com.zsy.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016101600700665";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCI1g5g/m1vSJbjh3C9WWd5AxM1OjG2QiTqLS1z1fiLO3DhxlIFO35QntYLYIMVXY6x2IjCC0A24H81R5J8oHZshzsy+HKq/6JyM5ITDj0S33+4X0UtjfDBmuwhoEuRygCPi49CGFKqa3s8EbhbS58zOCdJRmhrkNiEJw0Q5UvJQ5kavO3qLZ20MN8aeavMfNaLx/B+Krsx2Py3QLoC83wdoS77BqVT/dC0rsADKB3yTnCM99CJvceTE5ASELKnFHHRNyYbReZKW+UZOTb11NkrsaAYr9D5S8A5vz1VVhVMA6j3vLUhgnA6coH4CNGxcxEz8OcU+x8s9RhGuI+Kg5jzAgMBAAECggEAURLy5gkZcewCasEezTGhmxN1V/4o4iICmTU3TwCiCGypjzvf8PW0+7OAgrEmOYx7NWhkbwQXgew1sq27X1f7koX1T1fhKOvZpexkSiIPkZUWqXjZFgqZcTyHV80PuUuEVYiM0s5yfEK+e3LMVltR8hj9Pe8Xg1QI1RQGK9KPuqkSzRFBpI5EIkPQ9iNy/Tqm3yZ0tXI/JrMgYFV/lFh4QEEsyjP5b7fmNtL+2SWB0xj1zwurT+mPpJdd6ANY9o6mbgguwQA3PLRWJzYmlJ/FNRFfrWosvXTm6gRESnJHyyg85FwS+14pIwFZXpXEgLjstvNVY13Xpl8wOJ3Rh+cegQKBgQC8RUg+IIRB4cUe9Wd9NW1FWo44GWjQmBTQ091HxgCeaNjrX+LpwtFAKV9W+vN0NUy6JpU0JrwwEKCyi0x1JN4B3iC5A2kbBFzkHp9k17m2Ci6Dq7BYwCh2iJhAR6yGNZQXb9LbiT4RuK6SgUJ1UTOy1R4Ys0H9+KXfcilFYzZ6YQKBgQC6D+8VrLuXBayJc25KK4iwrlXs5kzt2e0NmrJWNNN0LSh8fj6lpC3UtZoVPHHuNSLhtwGCWQg2x0VzWKKBPn5Ycrvw2ZSCMTtBuTzIsqqw27dtSdHLHF551w2oIgRrfXEwo3p2MQ4iFRlWKuxeNJ6xDwKdf2+B4V2yKo51PwSb0wKBgBN8XDjJ5sZm1p8YqShlYjTeZX/a6WVFiEoA05M9JA1BLspVt0eYeU3ZultnR9FMPu+5VJH8PFgBMJCqKDSrpyqsUdi0SKmaLv8RSFAIn9j+fsfz+iGFaeqywodMo8eUPgqa8Uj1kG4HHlJdfIJl8CLfOek2jGr71DcnOqxK03WhAoGACVZtYEAX9f9R5mAFo/FFXeCR7V6tc65hKDKgSpVCG218v6qySCvSJP+sKO6spRDDnGJL0BfZwq4DfUNwfF3/hz7S0caJnnMMD0NVmpjk2hVcwj5XKgNVdnXleI+keySDfrZlmfLiS7GVYO6siBnJ8QbY0cCofvMpeZyLI7Uy7QMCgYAFywr96mwIYPJpBNz3H/F7WhQ+yWuJyqpt3eiOWq78yy/C3WHSZ5yuY+ix6bJX3C/KJXPKGTQT+Xq7oSMBB/H7i0sSh8zxyQXSuAIb3hZI260wP1IRmk7vnWLgWoiHz/Ch16EuO8mnwQN0gXaSl5ilv8A0v3VohII+cCTwAiqjIg==	";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://47.100.22.19:8080/payForCoupon-FireFoxOnly/return_url.jsp";
	//public static String return_url = "http://localhost:8080/payForCoupon-FireFoxOnly/return_url.jsp";
	//public static String return_url = "http://www.baidu.com";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgmTuGQ/pFRCofE1vrv/GnDLs71BvDPook23njNhJmOmh3suBnbSYm/10pp1beiv2EfBrJZlw3PFrKQ2TC9L4g+fDyNMY8ReY885nsaWCW61hc+x0HOZYlfCiNngwpd/Cc60lVQW/KwW6cAQJqwR322YOL5ZuuNAMYtTZ1OnA+ev7LY9KOh3mmpDpeGDSPFEtY104dcP+YJuExrEEaVLtQESRoPrH93f/BF+NLoTxuF6H2eoTVJyIaWad73m+0QPSdqQheJE/xK6XZB5o2B71fSvGVQaK4Q6DrnO27U5D7RU1OOMfZ6K2xjNU1Ne5oo7EJ/aQuXrWVTHRv1FSIAg+WwIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
