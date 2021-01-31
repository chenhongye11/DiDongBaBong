package com.didongbabong.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@TableName("food")
// This should be the general interface for all the fruit in our database
public class Food implements Serializable {
	@TableId(type=IdType.AUTO)
	int id;
	public String name;
	
	public float sugar;
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", sugar=" + sugar + ", carbon=" + carbon + ", vitamin_c="
				+ vitamin_c + ", protein=" + protein + ", calories=" + calories + ", fat=" + fat + ", calcium="
				+ calcium + ", sodium=" + sodium + ", iron=" + iron + ", potassium=" + potassium + ", copper=" + copper
				+ ", zinc=" + zinc + ", vitamin_b_6=" + vitamin_b_6 + ", vitamin_b_12=" + vitamin_b_12 + ", fiber="
				+ fiber + ", cholesterol=" + cholesterol + "]";
	}
	public float carbon;
	public float vitamin_c;
	public float protein;
	public float calories;
	public float fat;
	public float calcium;
	public float sodium;
	public float iron;
	public float potassium;
	public float copper;
	public float zinc;
	public float vitamin_b_6;
	public float vitamin_b_12;
	public float fiber;
	public float cholesterol;
	
	
	
	

}
