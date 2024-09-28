public class trapped_water_problem {
    public static int trapped_water(int height[], int width) {
        int n = height.length;
        int left_boundry[] = new int[n];
        left_boundry[0] = height[0];
        for(int i=1; i<n; i++){
            left_boundry[i] = Math.max(height[i], left_boundry[i-1]);
        }

        int right_boundry[] = new int[n];
        right_boundry[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right_boundry[i] = Math.max(height[i], right_boundry[i+1]);
        }

        int trapped_water = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(left_boundry[i], right_boundry[i]);
            trapped_water += (waterlevel - height[i]) * width;
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int width = 1;
        int trapped_water = trapped_water(height, width);
        System.out.println("Total Trapped Water = "+trapped_water);
    }
}
