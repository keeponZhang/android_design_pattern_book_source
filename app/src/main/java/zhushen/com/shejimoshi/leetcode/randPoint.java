package zhushen.com.shejimoshi.leetcode;

import java.util.Random;

/**
 * Created by Zhushen on 2018/11/30.
 */
public class randPoint {

    double radius;
    double x_center;
    double y_center;

    public randPoint(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        Random random = new Random();

        double r = random.nextFloat() * radius;
        double alpha = random.nextFloat() * 360;

        double x = x_center + r * Math.cos(alpha);
        double y = y_center + r * Math.sin(alpha);
        return new double[]{x,y};
    }
}
