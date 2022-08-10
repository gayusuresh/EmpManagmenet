package inheritanceexample;

public class Player 
{
	private int jersyno;
	private String playername;
	private String location;
	public Player()
	{
		
	}
	public Player(int jersyno,String playername,String location)
	{
		this.jersyno=jersyno;
		this.playername=playername;
		this.location=location;
	}
	public int getJersyno() {
		return jersyno;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player [jersyno=" + jersyno + ", playername=" + playername + ", location=" + location + "]";
	}
	

}
