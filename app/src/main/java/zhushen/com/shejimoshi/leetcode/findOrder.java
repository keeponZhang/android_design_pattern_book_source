package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/13.
 */
public class findOrder {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] satisfies = new List[numCourses];
        int[] requires = new int[numCourses];
        for(int i=0; i<numCourses; i++) satisfies[i] = new ArrayList<Integer>();
        for(int i=0; i<prerequisites.length; i++) {
            requires[prerequisites[i][0]] ++;
            satisfies[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++) {
            if (requires[i]==0) queue.add(i);
        }
        int[] courses = new int[numCourses];
        int pos = 0;
        while (!queue.isEmpty()) {
            int course = queue.remove();
            courses[pos++] = course;
            for(int next: satisfies[course]) {
                requires[next] --;
                if (requires[next] == 0) queue.add(next);
            }
        }
        if (pos == courses.length){
            return courses;
        }
        return new int[0];
    }

}
