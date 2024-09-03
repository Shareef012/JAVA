class MinimumLights{

    public static int minumumLights(int[] arr,int n,int b){
        if(b>n) return 1;

        int count= 0;
        int p1 = 0;
        while(p1<n){
            int startRange = p1 - b +1;
            int endRange = p1 + b -1;
            if(startRange<0){
                startRange = 0;
            }
            if(endRange>n-1){
                endRange = n-1;
            }
            int ele = 0;
            for(int i=endRange;i>=startRange;i--){
                 if(arr[i] == 1){
                    ele = i;
                    count++;
                 }
            }
            if(ele == 0){
                return -1;
            }
            startRange = ele - b + 1;
            endRange = ele + b - 1;
            if(startRange<0){
                startRange = 0;
            }
            if(endRange>n-1){
                endRange = n-1;
            }
            for(int i=startRange;i<=endRange;i++){
                arr[i] = 1;
            }
            p1 = endRange + 1;

        }

        

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1 };
        int n = arr.length;
        int b = 3;

        System.out.println(minumumLights(arr,n,b));
    }
}