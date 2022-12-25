// Two pointers is really an easy and effective technique that 
// is typically used for searching pairs in a sorted array.
// Leetcode question 167. Two Sum II - Input Array Is Sorted
class two_pointer_algorithm{
    public static void main(String args[])
    {
        int k[]={2,7,11,15};
        int target=13;
        int arr[]=twoSum(k, target);
        System.out.println(arr[0]+" "+ arr[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length -1;
        int a[]=new int[2];
        while (i<j)
        {
            if(numbers[i]+numbers[j]<target)
                i++;
            else if(numbers[i]+numbers[j]>target)
                j--;
            else if(numbers[i]+numbers[j]==target)
                {
                    a[0]=i+1;
                    a[1]=j+1;
                    return a;
                }
        }
        return a;
    }
}