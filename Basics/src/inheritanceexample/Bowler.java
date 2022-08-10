package inheritanceexample;

public class Bowler extends Player
{
	private int wicketstaken;

	private int noofballsbowled;
	private int economyrate;
	private int fivewickethaul;
	public Bowler()
	{
		
	}
	public Bowler(int jersyno,String playername,String location,int wicketstaken,int noofballsbowled,int economyrate,int fivewickethaul)
	{
		super(jersyno, playername, location);
		this.wicketstaken=wicketstaken;
		this.noofballsbowled=noofballsbowled;
		this.fivewickethaul=fivewickethaul;
		this.economyrate=economyrate;
	}
	public int getWicketstaken() {
		return wicketstaken;
	}
	public void setWicketstaken(int wicketstaken) {
		this.wicketstaken = wicketstaken;
	}
	public int getNoofballsbowled() {
		return noofballsbowled;
	}
	public void setNoofballsbowled(int noofballsbowled) {
		this.noofballsbowled = noofballsbowled;
	}
	public int getEconomyrate() {
		return economyrate;
	}
	public void setEconomyrate(int economyrate) {
		this.economyrate = economyrate;
	}
	public int getFivewickethaul() {
		return fivewickethaul;
	}
	public void setFivewickethaul(int fivewickethaul) {
		this.fivewickethaul = fivewickethaul;
	}
	@Override
	public String toString() {
		return super.toString()+"Bowler [wicketstaken=" + wicketstaken + ", noofballsbowled=" + noofballsbowled + ", economyrate="
				+ economyrate + ", fivewickethaul=" + fivewickethaul + "]";
	}
	

}
