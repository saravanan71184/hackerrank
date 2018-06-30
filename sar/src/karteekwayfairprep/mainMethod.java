package karteekwayfairprep;

import java.util.ArrayList;
import java.util.List;

public class mainMethod {

	public static void main(String[] args) {
		
		Person karth = new Person();
		karth.setAge(30);
		karth.setName("Kartheek");
		
		Hobby kartHobby1 = new Hobby();
		kartHobby1.setHobbyName("Playing");
		
		Hobby kartHobby2 = new Hobby();
		kartHobby2.setHobbyName("reading");
		
		List<Hobby> karthHobbiesList = new ArrayList<Hobby>();
		karthHobbiesList.add(kartHobby1) ;
		karthHobbiesList.add(kartHobby2) ;
		
		karth.setHobbies(karthHobbiesList );

		
		Person sarav = new Person();
		karth.setAge(16);
		karth.setName("sarav");
		
		Hobby saravHobby1 = new Hobby();
		kartHobby1.setHobbyName("Playing");
		
		Hobby saravHobby2 = new Hobby();
		kartHobby2.setHobbyName("reading");
		
		List<Hobby> saravHobbiesList = new ArrayList<Hobby>();
		saravHobbiesList.add(saravHobby1) ;
		saravHobbiesList.add(saravHobby2) ;
		
		sarav.setHobbies(saravHobbiesList );
		
		int tt = karth.compareTo(sarav) ;
		System.out.println(tt); 
		
	//	karth.compare(karth, sarav) ;
		
		
	}

}
