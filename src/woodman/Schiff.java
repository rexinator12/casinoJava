package woodman;

public class Schiff {
	private int nr;
	private String name;
	private int time;
	static int min = 300;
	static int max = 600;
	
	public Schiff(int nr, String name, int time) {
		this.nr = nr;
		this.name = name;
		this.time = time;
		
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getTime(){
		return this.time;
	}
	public static int race(){
	int time = (int)(Math.random()*(max-min+1)+min);
	return time;
	
	}
}
