package net.myinfosys.desembertraining.swing.button;

public enum Religi {
	BUDHA(1),
	HINDU(2),
	KATOLIK(3),
	MUSLIM(4),
	PROTESTAN(5);
	
	private int code;
	
	Religi(int code){
		this.code = code;
	}
	
	public int getCode(){
		return this.code;
	}
	
	public void getReligi(int code){
		System.out.println(Religi.values()[code]);
	}
	
	
}
