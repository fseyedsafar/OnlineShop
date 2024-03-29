package com.example.afinal.model.product;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class MetaDataItem{

	@SerializedName("id")
	private int id;

	@SerializedName("value")
	private String value;

	@SerializedName("key")
	private String key;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"MetaDataItem{" + 
			"id = '" + id + '\'' + 
			",value = '" + value + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}