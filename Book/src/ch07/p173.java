package ch07;

public class p173 {
	
	//필드
	String color;
	String company;
	String type;
	
	p173(){
		this("white", "기아", "경차");
	}

	p173(String color, String company, String type){
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	p173(String com, String t){
		this("white", com, t);
	}
	
	p173(String t){
		this("white", "기아", t);
	}
	
	public String toString() {
		return color+"-"+company+"-"+type;
		
	}
}
