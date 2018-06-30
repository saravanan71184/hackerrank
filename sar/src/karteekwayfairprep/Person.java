package karteekwayfairprep;

import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> , Comparator<Person>{
	
	String Name ;
	int age ;
	List<Hobby> hobbies ;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Hobby> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
	
	@Override
	public int compareTo(Person o) {
		
		System.out.println("this: "+this.getName());
		System.out.println("o :"+o.getName());
		
		int i = 0 ;
		if(this.getName().equalsIgnoreCase(o.getName())){
			i = 1 ;
		}else {
			i =0 ;
		}
		return i;
	}

	@Override
	public int compare(Person o1, Person o2) {
		String pers1Name = o1.getName() ;
		String pers2Name = o2.getName() ;
		
		if(pers1Name.equalsIgnoreCase(pers2Name)) {
			return 1;
		}
		
		return 0;
	}
	

}
