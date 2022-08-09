package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
	@Id
    private int pid;
    private String pname;
    private String color;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", color=" + color + "]";
	}
    
}