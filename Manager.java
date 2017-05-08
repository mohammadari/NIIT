
public class Manager {
   public static void main(String[] args) {
	Twowheeler t1=new Twowheeler();
	int s1=t1.getcost();
	int s2=t1.getspeed();
	System.out.println("Cost of Twowheeler="+s1);
	System.out.println("Speed of Twowheeler="+s2);
	threewheeler t2=new threewheeler();
	int v1=t2.getcost();
	int v2=t2.getspeed();
	System.out.println("Cost of threewheeler"+v1);
	System.out.println("Speed of threewheeler="+v2);
	Fourwheeler f1=new Fourwheeler();
	int fw1=f1.getcost();
	int fw2=f1.getspeed();
	System.out.println("Cost of Fourwheeler"+fw1);
	System.out.println("Speed of Fourwheeler"+fw2);
 }
}
