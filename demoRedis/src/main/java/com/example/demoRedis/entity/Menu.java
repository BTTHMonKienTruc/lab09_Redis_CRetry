package com.example.demoRedis.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Menu")
public class Menu implements Serializable {
    @Id
    private int id;

     //Used to speed up the property based search
    //@Index
    //private int redisExtId;

    private String item;
    private long price;
    //
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
    //
	public Menu(int id, String item, long price) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", item=" + item + ", price=" + price + "]";
	}
	
}
