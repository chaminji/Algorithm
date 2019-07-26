package _0617;

class ABC extends RuntimeException{}
class DEF extends ABC{}

public class Test2 {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		try {
			try {
				System.out.print(1);
				if(i<15) {throw new DEF();}
				System.out.print(2);
			}
			catch(ABC e) {
				System.out.print(3);
				if(j<25) {throw new ABC();}
				System.out.print(4);
			}
			finally {
				System.out.print(5);
			}
			System.out.print(6);
		}
		catch(ABC e) {
			System.out.print(7);
		}
		System.out.print(8);
	}
}
