class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for (int i = 0; i < image.length; i++) {
            reverse(image[i]);  // Reverse the row
            flip(image[i]);     // Invert the row
        }
        return image;
    }
    private void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {  // Swap until the middle
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private void flip(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;  // Flip 0 to 1 and 1 to 0
        }
    }
            }
        
    
