package zad23;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watek raz = new Watek(0,100);
	    Watek dwa = new Watek(101,200);
	    Watek trzy = new Watek(201,300);
	    Watek cztery = new Watek(301,400);
	    Watek piec = new Watek(401,500);
	    
	    
	    System.out.println("Startujemy!!!");
	    
	    raz.start();
	    dwa.start();
	    trzy.start();
	    cztery.start();
	    piec.start();
	    
	    System.out.println("Koniec!!!");
	}

}
