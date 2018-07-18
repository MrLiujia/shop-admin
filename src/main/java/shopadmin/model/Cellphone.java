package shopadmin.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cellphone {
	private Long id;
	
	@Size(min = 1, max = 64, message = "1~64字")
	private String brand;	//品牌
	
	@Size(min = 1, max = 64, message = "1~64字")
	private String model;	//型号
	
	@Size(min = 1, max = 64, message = "1~64字")
	private String os;		//操作系统
	
	@Size(min = 1, max = 64, message = "1~64字")
	private String cpubrand;//CPU
	
	@NotNull(message = "必填")
	private Integer ram;	//内存
	
	@NotNull(message = "必填")
	private Integer storage;//储存容量
	
	@Size(min = 1, max = 64, message = "1~64字")
	private String color;	//颜色
	
	@NotNull(message="必填")
	private Integer price;	//价格
	
	@Size(min = 1, max = 512, message = "1~512字")
	private String description;//描述
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getCpubrand() {
		return cpubrand;
	}
	public void setCpubrand(String cpubrand) {
		this.cpubrand = cpubrand;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getStorage() {
		return storage;
	}
	public void setStorage(Integer storage) {
		this.storage = storage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
