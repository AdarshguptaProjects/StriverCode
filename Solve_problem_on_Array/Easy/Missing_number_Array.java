class Solution {
    int missingNum(int arr[]) {
        long sum= (long)(arr.length+1)*(long)(arr.length+2)/2;
        return (int)((sum)-Arrays.stream(arr).reduce(0,Integer::sum));
    }
}