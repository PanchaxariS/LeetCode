class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i<4; i++){
            if (check(mat, target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public boolean check(int[][]mat , int [][]target){
        for(int i =0; i<mat.length; i++){
            for(int j = 0; j<mat.length; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] rotate(int[][]mat){
        int n = mat.length;
        int b[][]=new int[n][n];
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                b[j][n-i-1]=mat[i][j];
            }
        }
        return b;
    }

}