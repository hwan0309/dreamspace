package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}
public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1,"Kim"),
				new Student(100,"Lee"),
				new Student(2,"Yoon"));
		
		List<Student> studentsAl = new ArrayList<>(students);
		
		System.out.println(students);
		
		Collections.sort(studentsAl);	//올림차순
		System.out.println("ASC " + studentsAl);
		
		Collections.sort(studentsAl, new DescendingStudentComparator());	//내림차순
		System.out.println("DescendingStudentComparator " + studentsAl);

	}

}
