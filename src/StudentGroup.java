import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int i;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		try{
			return students;
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		try{
		this.students=students;
		}
		catch(Exception e){
			System.out.println("IllegalAgumentException");
		}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		return students[index]
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		for(i=students.length-1;i>index;i--){
			student[i+1]=student[i];
		}
		students[index]=this.student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		for(i=students.length;i>=0;i--){
			students[i+1]=students[i];
		}
		students[0]=student;
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students[students.length++]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		for(i=index+1;i<students.length-1;i++){
			if(students[i-1]=students[i];
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		for(i=0;i<students.length=1;i++){
			if(students[i].compareTo(student)==0) {
				j=i;
				break;
			}
		}
		for(i=j;i<students.length-1;i++){
			students[i]=students[i+1];	
	}

	@Override
	public void removeFromIndex(int index) {
		for(int i=index+1;i<students.length-1;i++){
			students[i]=NULL;
		}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {

		for(i=0;i<students.length=1;i++){
			if(students[i].compareTo(student)==0) {
				j=i;
				break;
			}
		}
		for(i=j;i<students.length-1;i++){
			students[i]=NULL;	
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int j;
		students temp;
		for(i=0;i<studets.length;i++){
			for(j=i+1;j<students.length-1;j++){
				if(students[i].compareTo(students[j])>0){
					temp=students[i];
					students[i]=students[j];
					students[j]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(students!=NULL){
		for(i=0;i<students.length-1;i++){
			if(students[i].compareTo(student))
				Student s=students[i+1];
				break;
		}
		return s;
		}
		return null;
	}
}
