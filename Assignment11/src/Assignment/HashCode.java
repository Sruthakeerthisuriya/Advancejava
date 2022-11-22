package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class HashCode {
        public static void main(String[] args) {
        int size1 = 0;
        int size2 = 0;
        int size3 = 0;
        int size4 =0;
        Map<Integer,String> college = new HashMap<Integer, String>();
        Map<Integer,String> school = new HashMap<Integer, String>();
        Map<Integer,String> personalData = new HashMap<Integer, String>();
        
        Set<String> xca = new HashSet<String> ();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of entries for college:");
        size1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter no of entries for school:");
        size2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter no of entries for personal data:");
        size3 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your extra circular activities:");
        size4 = Integer.parseInt(sc.nextLine());
        
        
        
        for(int i = 1; i <= size1; i++){
            int id = 0;
            String edu = "";
            System.out.println("Enter name of college " + i + " education:");
            edu = sc.nextLine();
            id = id + i;
            college.put(Integer.valueOf(id), edu);
        }
        for(int i = 1; i <= size2; i++){
            int id = 0;
            String schl = "";
            System.out.println("Enter name of school " + i + " education :");
            schl = sc.nextLine();
            id = id + i;
            school.put(Integer.valueOf(id), schl);
        }
        for(int i = 1; i <= size3; i++){
            int id = 0;
            String person = "";
            System.out.println("Enter name of person: " + i );
            person = sc.nextLine();
            System.out.println("Enter age of person: " + i );
            person = sc.nextLine();
            id = id + i;
            personalData.put(Integer.valueOf(id), person);
        }
        for(int i = 1; i <= size4; i++){
            int id = 0;
            String xc = "";
            System.out.println("Enter your fav sport: " + i );
            xc = sc.nextLine();
            id = id + i;
           xca.add(xc);
        }
        Map<String, Object> outer = new HashMap<String, Object>();
        outer.put("College", college);
        outer.put("School", school);
        outer.put("PersonalData", personalData);
        outer.put("XCA", xca);
        System.out.println("Map of Map:   " + outer);
        sc.close();
    }
}