package hcmiu.scse.wad;

public class Account {
	private String name = "No name specified";
	private String card = "No card specified";
	private String addr = "No addr specified";
	
	public Account() {

	}
	
	public String getName() {
		return (name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCard() {
		return (card);
	}

	public void setCard(String card) {
		this.card = card;
	}
	
	public String getAddr() {
		return (addr);
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
