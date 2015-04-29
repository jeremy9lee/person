package person;

public class Student extends Person {

	public Student(){
		super();
		System.out.println("call Student()");
	}
	
	   public void set() {
		      age = 30;
		      name = "홍길동";
		      height = 175;
		      a();
	   }

		   public static void main( String[] args ) {
		      Student s = new Student();
		      s.set();
		   }

}
