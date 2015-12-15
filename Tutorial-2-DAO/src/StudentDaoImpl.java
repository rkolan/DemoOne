import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	ArrayList<Student> students;
	
public StudentDaoImpl(){
	ArrayList<Student> students=new ArrayList<Student>();
	Student student1=new Student("Rohini",3005);
	Student student2=new Student("Sweety",9000);
	students.add(student1);
	students.add(student2);
	
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
	
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
students.get(student.getRollNo()).setName(student.getName());
System.out.println("Student:Roll No" +student.getRollNo() + ",updated in the database");

	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No" +student.getRollNo()+ ",deleted from the database");
		

	}

}
