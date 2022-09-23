package woodman;

public class wettkampf {
	private static String name;
	private static Schiff[] schiff = new Schiff[5];
	
	public wettkampf(String name) {
		wettkampf.name = name;
	}
	public String getName() {
		
		return wettkampf.name;
		}
	public void start() {
		
	}
	public static void printSchiff() {
		wettkampf getNameobj = new wettkampf(name);
		System.out.println("Wettkampf: "+ getNameobj.getName());
		for(int i=0;i < schiff.length;i++) {
			System.out.println("schiff nr:" + schiff[i].getNr());
			System.out.println("schiff name:" + schiff[i].getName());
			System.out.println("schiff zeit:"+ schiff[i].getTime());
			System.out.println("schiff Besitzer:"+ schiff[i].getBesitzer());
			
		}
		
	}
	public void addSchiff(String name){
	 for(int i=0;i< schiff.length; i++) {
		 if(schiff[i] == null) {
			 int nr = i;
			 int time = Schiff.race();
			 
			 Schiff schiffobj = new Schiff(nr,name,time);
			 schiff[i] = schiffobj;
			 break;
			 
			 
		 }

	 }
	}
	}
	