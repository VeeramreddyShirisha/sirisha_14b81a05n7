public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		int id1;
		String name;
		Date d;
		double avg;
		
		
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		for(int i=0;i<num;i++){
			
			id1=sc.nextInt();		
			
			name=sc.nextLine();
			d=sc.nextline();
			avg=sc.nextDouble();
			
			Student s=new Student(id1,n,d,avg);
		}
		Student s1=new Student();
		s1.setId(10);
		s1.setFullName("abcd");
		s1.setBirthdate("1999-08-08");
		s1.setAvgMark(88.00);
		int id2=s1.getId();
		String name1=s1.getFullName();
		Date d1=s1.getBirthDate();
		double avg1=s1.getAvgMark();
		
		
	}

}
