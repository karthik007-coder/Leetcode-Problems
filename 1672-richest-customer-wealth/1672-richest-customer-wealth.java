class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=0;
        ArrayList<Integer> arr=new ArrayList<>();
        int rows = accounts.length;
        int cols = accounts[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum=sum+accounts[i][j];
                if(j==cols-1){
                    arr.add(sum);
                    sum=0;
                }
            }
        }
        int o =arr.size();
        for(int k=0; k < o; k++){
            if(max<arr.get(k)){
                max=arr.get(k);
            }
        }
        return max;
    }
}