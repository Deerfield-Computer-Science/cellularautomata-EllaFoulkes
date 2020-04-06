import java.util.ArrayList;

public class Location {
	
	private int x;
	private int y;
	protected ArrayList <Location> surrounding;
	
	public Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}
	
	public ArrayList <Location> getSurroundings(){
		surrounding=new ArrayList<Location>();
		surrounding.add(new Location(getX(), getY()-1));
		surrounding.add(new Location(getX()+1, getY()-1));
		surrounding.add(new Location(getX()+1, getY()));
		surrounding.add(new Location(getX()+1, getY()+1));
		surrounding.add(new Location(getX(), getY()+1));
		surrounding.add(new Location(getX()-1, getY()+1));
		surrounding.add(new Location(getX()-1, getY()));
		surrounding.add(new Location(getX()-1, getY()-1));
		return surrounding;
		
	}
}
