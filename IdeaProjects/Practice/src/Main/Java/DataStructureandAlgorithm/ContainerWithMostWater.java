package Main.Java.DataStructureandAlgorithm;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] test = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}; // 49
        System.out.println(maxArea(test));
    }
    private static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int ans = 0;
        while(i != j) {
            int area = (j - i) * Math.min(height[i], height[j]);

            if(area >= ans) {
                ans = area;
            }
            if(height[i]>height[j]) {
                    j--;
                } else {
                    i++;
                }
            } return ans;
        }

    }

