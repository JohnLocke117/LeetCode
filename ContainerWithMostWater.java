package Leetcode;

// Two Pointer approach. pointer1 = height[0], pointer2 = height
// Calculate Area = min(two heights) * diff(indexes)
// Move smaller height pointer, check if newArea > area
// if True: update area
// Loop until pointer1 != pointer2

public class ContainerWithMostWater {
    // Creating Object of Class:
    static ContainerWithMostWater classObject = new ContainerWithMostWater();
    public int maxArea(int[] height) {
        int pointer1 = 0;
        int pointer2 = height.length - 1;
        int area = Math.min(height[pointer1], height[pointer2]) * (pointer2 - pointer1);

        while (pointer1 != pointer2) {
            // Update the Smaller Pointer:
            if (height[pointer1] > height[pointer2]) {
                pointer2--;
            } else {
                pointer1++;
            }

            // Check new Area:
            int newArea = Math.min(height[pointer1], height[pointer2]) * (pointer2 - pointer1);
            if (newArea > area) {
                area = newArea;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        // Given Array of Heights:
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(classObject.maxArea(height));
    }
}
