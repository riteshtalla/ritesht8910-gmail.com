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
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return Arrays.copy(students,student.length);
		return null;
	}

	@Override
	public void setStudents(Student[] students) 
{		 return Arrays.copy(student,student.lenght);
		return null;
	}

	@Override
	public Student getStudent(int index){	
	return getStudent().getindex() +" " intindex"; 
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		for (int i=0;i<Stu.lenghth; i++)
{ 
		 if (student==student(i)
   		continue; 
   		if student (i)==null 
     		 student (i)=student;
		return;		       
}
}
}
	@Override
	public void addFirst(Student student) 
{
	 Node f = first;
        	Node newNode = new Node(student);
        	first = newNode;
        	if (f == null) last = newNode;
        	else f.previous = newNode;
		for(int i=0;i<student.lenght;i++)
	}

	@Override
	public void addLast(Student student) {
	Node l = last;
        Node newNode = new Node(student);
        last = newNode;
        if (l == null) first = newNode;
        else {

	}

	@Override
	public void removeFromElement(Student student) {
 if (index <= 0 && index > x.size())
                System.out.println("The chapter doesn't exist");
            else {
                x.remove(index);
                System.out.println("Succesful deletion");
		
	}

	@Override
	public void removeToIndex(int index) {
		student.removeelements(student)
	}

	@Override
	public void removeToElement(Student student) {
		
	}

	@Override
	public void bubbleSort() {
	{
      int out, in;
      boolean sorted = false;

      out=nElems-1;
      while (!sorted) {         
                                 
         sorted = true;
         for(in=0; in<out; in++) {       
            if (a[in] > a[in+1]) {
               sorted = false;    
               swap(in, in+1);
            }   
            out--;       
         }
      }
   }  	
}

	@Override
	public Student[] getByBirthDate(Date date) {
		this.birthdate=birthdate;
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		student date of birth in "yyy-MM-dd"=this.return bithdate;
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		student date of birth in "yyy-MM-dd"=this.return bithdate;
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	 this.bydate=indexOfStudent;
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		this.ByAge=ByAge;
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		this.student=this.avgmarks
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		student  s= new student
		s,nextstudent(); 
		return null;
	}
}
