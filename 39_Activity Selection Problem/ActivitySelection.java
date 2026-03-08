package greedy_algos;

import java.util.*;

/**
 * Activity Selection Problem
 * Given a set of activities with start and end times, select the maximum 
 * number of activities that can be performed by a single person, 
 * assuming that a person can only work on a single activity at a time.
 */
public class ActivitySelection {

    static class Activity {
        int start, end, id;
        Activity(int id, int start, int end) {
            this.id = id;
            this.start = start;
            this.end = end;
        }
    }

    public static void selectActivities(int[] start, int[] end, int n) {
        List<Activity> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Activity(i, start[i], end[i]));
        }

        // Sort activities based on their finish times
        Collections.sort(activities, Comparator.comparingInt(a -> a.end));

        System.out.println("Selected Activities:");
        
        // The first activity is always selected
        Activity lastSelected = activities.get(0);
        System.out.println("Activity " + lastSelected.id + " (Start: " + lastSelected.start + ", End: " + lastSelected.end + ")");
        int count = 1;

        for (int i = 1; i < n; i++) {
            // If this activity has a start time greater than or equal 
            // to the finish time of the previously selected activity, then select it
            if (activities.get(i).start >= lastSelected.end) {
                lastSelected = activities.get(i);
                System.out.println("Activity " + lastSelected.id + " (Start: " + lastSelected.start + ", End: " + lastSelected.end + ")");
                count++;
            }
        }
        System.out.println("Total activities selected: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        System.out.println("Enter start times:");
        for (int i = 0; i < n; i++) start[i] = sc.nextInt();
        System.out.println("Enter end times:");
        for (int i = 0; i < n; i++) end[i] = sc.nextInt();

        selectActivities(start, end, n);
        sc.close();
    }
}
