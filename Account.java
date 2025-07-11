public class Account{
	private String id;
	private String name;
	private int balence = 0;
	
	public Account(String id , String name){
		this.id = id;
		this.name = name;
	}
	
	public Account(String id , String name , int balence){
		this.id = id;
		this.name = name;
		this.balence = balence;
	}
	
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getBalance(){
		return this.balence;
	}
	
	public int credit (int amount){
		this.balence += amount;
		return this.balence;
	}
	//transfer(Accont other,int amount){if else}
	public int debit (int amount){
		if (amount <= this.balence){
			this.balence -= amount;
		}
		else{
			System.out.println("Amount exceeded balance");
		}
		return this.balence;
	}

	public void transfer (Account otherAccount , int amount){
		if (amount<=this.balence){
			this.balence-= amount;
			otherAccount.balence +=  amount;
		}
		else {
			System.err.println("Amount exceeded balance");
		}
	}
	public String toString(){
		return "id : "+getId()+" \nName : "+getName()+" \nBalaence : "+getBalance();
	}
}
