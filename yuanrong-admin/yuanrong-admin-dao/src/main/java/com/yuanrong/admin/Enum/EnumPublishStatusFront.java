package com.yuanrong.admin.Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 基本枚举类型，表示信息的状态
 * @author Administrator
 *
 */
public enum EnumPublishStatusFront implements IntegerValuedEnum  {
	未公开("未发布", 0, "未公开"),已公开("已发布 ", 1, "已公开");

	// 成员变量
	private String name;

	private int index;

	private String description;

	//构造方法
	private EnumPublishStatusFront(String name, int index, String description) {
		this.name = name;
		this.index = index;
		this.description = description;
	}
	
	// get set 方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static List<Map<String , Object>> getMapInfo(){
		List<Map<String , Object>> result = new ArrayList();

		for(EnumPublishStatusFront type : EnumPublishStatusFront.values()){
			Map<String , Object> ele = new TreeMap<String, Object>();
			ele.put("id" , type.index);
			ele.put("name" , type.name);
			result.add(ele);
		}
		return result;
	}
}
