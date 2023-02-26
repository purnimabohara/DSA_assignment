package Question4;

import java.util.*;

 class LinkedListSortSteps {

    public static int SortSteps(LinkedList<Integer> list) {
        int steps = 0;
        boolean changed = true;

        while (changed) {
            changed = false;
            int i = 1;
            while (i < list.size()) {
                if (list.get(i - 1) > list.get(i)) {
                    list.remove(i);
                    changed = true;
                } else {
                    i++;
                }
            }
            if (changed) {
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 5, 2, 1, 4));
        int steps = SortSteps(list);
        System.out.println("Number of steps required: " + steps);
    }
}