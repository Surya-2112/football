package com.learn.myreflection;

import java.util.HashMap;
import java.util.Map;

public class JsonToMap {
	
	public Map<String,Object> jsonToMap(String json)
	{
		Map<String,Object> map=new HashMap<>();
		json=json.substring(1,json.length()-1);
		json=json.trim();
		String pairs[]=json.split(", ");
		for(String pair:pairs)
		{
			String split[]=pair.split(":");
			String key=split[0].trim();
			String value=split[1].trim();
			map.put(key, value);
		}
		return map;
	}
}