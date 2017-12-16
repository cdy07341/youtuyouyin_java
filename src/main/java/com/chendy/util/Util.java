package com.chendy.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

@Service
public class Util {
	public String generateStrParams(Map<String, String[]> params) {
		String strParams = "&";
		Iterator<Entry<String, String[]>> Iterator = params.entrySet().iterator();
		while (Iterator.hasNext()) {
			Map.Entry<java.lang.String,java.lang.String[]> entry = (Map.Entry<java.lang.String,java.lang.String[]>) Iterator.next();
			strParams += entry.getKey() + "=" + entry.getValue()[0];
			if (Iterator.hasNext()) {
				strParams += "&";
			}
		}
		if (strParams == "&") {
			strParams = "";
		}
		return strParams;
	}
}
