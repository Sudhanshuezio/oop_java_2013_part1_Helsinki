
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> s = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String sname = "";
        String sno = "";
        while(true) {
            System.out.println("name: ");
            sname = reader.nextLine();
            if(sname.equals("")) {
                break;
            }
            System.out.println("studentnumber: ");
            sno = reader.nextLine();
            s.add(new Student(sname,sno));
        
    }
        for(Student s1 : s) {
            System.out.println(s1);
        }
        
        System.out.println("Give search term: ");
        String tofind = reader.nextLine();
        System.out.println("result: ");
        for(Student oneByone : s) {
            if(oneByone.getName().contains(tofind)) {
                System.out.println(oneByone);
            } 
        }
        
    }
}
