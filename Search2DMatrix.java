class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            if(matrix[i][n-1]>=target){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target)
                    return true;
                }
            }
        }
        return false;
        
    }
}
