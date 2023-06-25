package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int boat_count = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] == limit) {
                System.out.println("Equal: " + Arrays.toString(people));
                boat_count++;
                // Removing the Person from the Array:
                people[i] = -1;
            } else if ((people[i] < limit) && (people[i] > 0)) {
                System.out.println("Less: " + Arrays.toString(people));
                int weight_left = limit - people[i];
                people[i] = -1;
                // Find a Person whose weight is <= weight_left > 0:
                int[] temp =  new int[people.length];
                for (int j = i + 1; j < people.length; j++) {
                    if ((people[j] <= weight_left) && (people[j] > 0)) {
                        temp[j] = people[j];
//                        people[j] = -1;
//                        break;
                    } else {
                        temp[j] = -10;
                    }
                }


                boat_count++;
            }
        }

        return boat_count;
    }

    public static void main(String[] args) {
        BoatsToSavePeople class_object = new BoatsToSavePeople();

        int[] people = {3,8,7,1,4};
        int limit = 9;
        System.out.println(class_object.numRescueBoats(people, limit));
    }
}
