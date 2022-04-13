import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentMain {
public static void main(String[] args) {
	

	List<Student> stu=new ArrayList<Student>();
    Student s1=new Student(1,"abc", 60.0, 20);
    Student s2=new Student(2,"xyz", 80.0, 22);
    Student s3=new Student(3,"lmn", 50.0, 24);
    Student s4=new Student(4,"pqr", 40.0, 21);
    Student s5=new Student(5,"mnq", 55.0, 20);
//   
	//List<Object> list = List.of(1,"shub",90,25);
    stu.add(s1);
    stu.add(s2);
    stu.add(s3);
    stu.add(s4);
    stu.add(s5);
    
   
   List<Student> collect = stu.stream()
		   .filter(s->s.getPercent()>50)
//		   .sorted((std1,std2)-> std1.getAge().compareTo(std2.getAge()))
		   .sorted(Comparator.comparing(Student::getAge).reversed())
//		   .map(std -> std.getAge() * 2)
		   .collect(Collectors.toList());
   System.out.println(collect);
}
}