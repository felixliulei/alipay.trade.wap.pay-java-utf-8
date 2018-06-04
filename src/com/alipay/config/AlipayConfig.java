package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2017032006309302";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMlbQoPZAp3Cf+j71V72tQXuuau/0XqhVqjzeI7Zqb2YL/mrABfoA1ecg8q3e42HwadcdRZUxzQwobrYdoj4MKY/pTh/GtQVgaf9h2G530dryaM462/EY1C4LZXotxpNYnImXSVTjskrPJiOjXIOoKQvaENDj+ImPLr00EKmmvCpAgMBAAECgYEAiN0RDxF4Z8cGrlROqefDD68+YPFW76Wug9RKA78LUyWYpnmG7Lj1XJ20LxwcTQ0TojCEHZOue1j69Ueg+mTIm2My9JW7SodJ+jFxD222je+4/oXSRbMVvtPKZKn4rx9iH1xodHIjuY6B3nKStviAKCQ+AoV0i7S0zI6ctsPl+YkCQQDpCySZywSl6t6yT0I82OEo5o7mDXpW2Zb14NbBZUTioDgV8nQPrCnspouy+sLhE4dk9NrOnvkyR5W+KYAeKNpzAkEA3TEJpqApWRq24lrLazLEbYjxsDngen6fiG7tLCOoM0VyT7mvGdcVhnLCS5iDpOg+G98feYJp/GcQY+UbAh01cwJBAKNlw7jthwnKf3Cob/n32w9xcNpOsuu4TseBaTJajg0UZ57Dy6q9fPvH3oWUmxVzOuiHYe+juXgOhyi5MnJzFI8CQQCRQ0MzSrvc6M5ymW4+WHjn9qfDND9YMxBSaYcZFdHA2jrYYPm93qMkSPmQ6/iItH0VkNL62csBGC6LbErweH5BAkBVMfZ6bMo5car0jnah+B9+1+2UHoEUqrL8S09dyEOzM9BZmZKMjN6iJmb/TxBq5/o0KpoM1k4JG4go3w/epyL/";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
	// 请求网关地址
	public static String URL = "https://openapi.alipay.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDJW0KD2QKdwn/o+9Ve9rUF7rmrv9F6oVao83iO2am9mC/5qwAX6ANXnIPKt3uNh8GnXHUWVMc0MKG62HaI+DCmP6U4fxrUFYGn/Ydhud9Ha8mjOOtvxGNQuC2V6LcaTWJyJl0lU47JKzyYjo1yDqCkL2hDQ4/iJjy69NBCpprwqQIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA";
}
