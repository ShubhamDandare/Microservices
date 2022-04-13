import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//import com.sun.tools.javac.code.Attribute.Array;

public class Demo {

	public static void main(String[] args) {
		
//        List<Object> asList = Arrays.asList(1,"s",2,"d",3,"f");
//        List<Object> collect = asList.stream().collect(Collectors.toList());
//        collect.forEach(System.out::println);
//        
        List<Student> s=new ArrayList<Student>();
        Student s1=new Student(1,"abc", 60.0, 20);
        Student s2=new Student(2,"xyz", 80.0, 22);
        Student s3=new Student(3,"lmc", 50.0, 24);
        Student s4=new Student(4,"pqr", 40.0, 21);
        Student s5=new Student(5,"cnq", 55.0, 20);
        
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        
//        List<Integer> collect = s.stream().filter(p->p.getName().contains("c"))
//        		.filter(p->p.getAge()>20).map(p->p.getAge()*2)
//        		.collect(Collectors.toList());
//        collect.forEach(System.out::println);
//        
        List<Subject>sub=new ArrayList<Subject>();
        Subject sub1=new Subject("English", 21);
        Subject sub2=new Subject("Science", 41);
        Subject sub3=new Subject("Math", 31);
        sub.add(sub1);
        sub.add(sub2);
        sub.add(sub3);
        
        
        Map< Student, Subject> stu=new HashMap<Student, Subject>();
        stu.put(s1,sub1) ;
        System.out.println(stu);
        stu.str
        
        
        
        
        
        
	}
}
