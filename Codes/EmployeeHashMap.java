import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
// import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;

public class EmployeeHashMap {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> employeeHashMap = new HashMap<>();

        employeeHashMap.put(1001, 70000);
        employeeHashMap.put(1002, 60000);
        employeeHashMap.put(1003, 75000);
        employeeHashMap.put(1004, 80000);
        employeeHashMap.put(1005, 100000);

        System.out.println("Hasmap of given data: " + employeeHashMap);

        // Set<Integer> keys = employeeHashMap.keySet();
        // System.out.println(keys);

        System.out.println("The keys are: " + employeeHashMap.keySet());
        System.out.println();

        employeeHashMap.remove(001);
        System.out.println("Hashmap after removing data: " + employeeHashMap);

        employeeHashMap.replace(1003, 200000);
        System.out.println("Map after updating: " + employeeHashMap);

        System.out.println("Key present ? : " + employeeHashMap.containsKey(1009));

        System.out.println("Value present in Hashmap :" + employeeHashMap.containsValue(200000));

        System.out.println("The value corresponding to the key is: " + employeeHashMap.get(1003));

        System.out.println(employeeHashMap.getOrDefault(1006, 50000));
        // System.out.println(employeeHashMap);


        // employeeHashMap.clear();
        // System.out.println("The hashmap after clear: " + employeeHashMap);

        System.out.println(employeeHashMap.size());

        System.out.println(employeeHashMap.entrySet());


        
        // Set<Integer> unique = new HashSet<>();

       
        
        

    }
}
