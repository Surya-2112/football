package com.learn.myreflection;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Mapper {

	public Map<String,Object> jsonToMap(String json) throws Exception
	{  // System.out.println("-----------------"+json);
		Map<String,Object> map=new HashMap<>();
		Stack<Object> stack=new Stack<>();
		String parts[]=json.split(" ");
		int CountClass=0;
		StringBuilder sb=new StringBuilder();
		for(String part:parts)
		{ // System.out.println(part+" "+CountClass+" "+sb);
			if(CountClass>1)
			{
				sb.append(part+" ");
			}
			if(part.equals("}"))
			{
				CountClass--;
				if(CountClass==1)
				{   
					map.put((String)stack.pop(),Main.getObject(jsonToMap(sb.toString())));
					sb=new StringBuilder();
				}
				continue;
			}
			if(part.equals("{"))
			{   if(CountClass==0)
				map.put("class",stack.pop());
				else {
				sb.append(stack.peek()+" ");
				sb.append(part+" ");
				}
				CountClass++;
				continue;
			}
			if(CountClass<2) {
			if(part.equals(",") && !stack.isEmpty())
			{   String value=(String) stack.pop();
				map.put((String)stack.pop(), value);
				continue;
			}if(!part.equals(":"))
			{
				stack.push(part);
			}
			}
		}
		while(!stack.isEmpty())
		{
			String value=(String) stack.pop();
			map.put((String)stack.pop(),value);
		}
		return map;
	}
}
