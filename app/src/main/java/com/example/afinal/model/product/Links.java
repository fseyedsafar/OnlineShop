package com.example.afinal.model.product;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Links{

	@SerializedName("self")
	private List<SelfItem> self;

	@SerializedName("collection")
	private List<CollectionItem> collection;

	public void setSelf(List<SelfItem> self){
		this.self = self;
	}

	public List<SelfItem> getSelf(){
		return self;
	}

	public void setCollection(List<CollectionItem> collection){
		this.collection = collection;
	}

	public List<CollectionItem> getCollection(){
		return collection;
	}

	@Override
 	public String toString(){
		return 
			"Links{" + 
			"self = '" + self + '\'' + 
			",collection = '" + collection + '\'' + 
			"}";
		}


}