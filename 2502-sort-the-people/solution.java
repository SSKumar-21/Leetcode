class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        int m = names.length;
        for (int i = 1; i < heights.length; i++) {
            int key = heights[i];
            String KeyName = names[i];
            int j = i - 1;

            while (j >= 0 && heights[j] < key) {
                heights[j + 1] = heights[j];
                names[j + 1] = names[j];
                j--;
            }
            heights[j + 1] = key;
            names[ j + 1 ] = KeyName;
        }
        System.out.println(heights[0]);
        return names;
    }
}
