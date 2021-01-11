import java.util.*;

public class Placement {

    public static <K, V> Set<K> getKeysBasedOnValue(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                keys.add(key);
            }
        }
        return keys;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] branches = {"CSE", "ECE", "MECH"};
        Map<String, Integer> branchPlacementMap = new HashMap<String, Integer>();

        boolean containsMinusValue = false;
        int maxValue = 0;


        for (int i = 0; i < branches.length; i++) {
            System.out.print("Enter the no of students placed in " + branches[i] + ":");
            int inputValue = sc.nextInt();
            if (inputValue < 0) containsMinusValue = true;
            if (i == 0 || inputValue > maxValue) maxValue = inputValue;
            branchPlacementMap.put(branches[i], inputValue);
        }

        if (containsMinusValue) {
            System.out.println("Input is Invalid ");
            return;
        }

        if ((new HashSet<>(branchPlacementMap.values())).size() == 1) {
            System.out.println("None of the department has got the highest placement");
            return;
        }

        System.out.println("Highest Placement");
        for (String highestPlacementDepartment : getKeysBasedOnValue(branchPlacementMap, maxValue)) {
            System.out.println(highestPlacementDepartment);
        }

    }
}
