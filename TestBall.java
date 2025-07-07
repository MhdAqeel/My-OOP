public class TestBall{
	public static void main (String [] args){
		Ball myball = new Ball(-5,-2,5,12,20);
		Ball b2 = new Ball(10,10,32,4,6);
		Ball b3 = new Ball(15,2,20,7,8);
		myball.move();
		
		b2.reflectorHorizontal();
		b2.move();
		
		b3.reflectorVertical();
		b3.move();
		
		System.out.println(myball.toString());
		System.out.println("after horizontal movement : "+b2.toString());
		System.out.println("after vertical movement : "+b3.toString());
	}
}