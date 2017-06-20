package com.AIS.Application1;

public class Application3 {

	public static void main(String[] args) {
		//inefficient
		String info = "";
		info +="My name is Bob.";
		info +=" ";
		info +="I am a builder.";
		System.out.println(info);
		
		//efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.")
		.append(" ")
		.append("Am unemployed programmer.")
		.append(" ")
		.append("pls give money");
		
		System.out.println(sb.toString());
	}

}
