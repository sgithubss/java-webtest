package com.zrysj.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			SimpleDateFormat sinmpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = sinmpleDateFormat.parse(source);
			return date;
		} catch (ParseException e) {
			System.out.println("转换出现异常，格式不正确");
			e.printStackTrace();
		} finally {
			
		}
		return null;
	}

}
