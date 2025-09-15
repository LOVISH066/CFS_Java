class hw1 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int num = 10;

        // storing array
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = num;
            num++;
        }

        // printing sum of array
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            
        }
        System.out.println(sum);

        // sum of even index
        int evensum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(i%2==0 && i!=0){
            evensum = evensum + arr[i];
            }

        }
        System.out.println(evensum);
        // 10, 11, 12, 13, 14, 15

        // sum of alternate array indx
        int adjsum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(i%2==0){
            adjsum = adjsum + arr[i];
            }

        }
        System.out.println(adjsum);

    }
}
