class Maxsubsum {
    public static void kadanes (int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0 ; i<numbers.length ; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);

        }
        System.out.println("Max subarray sum is"+ ms);
    }
}