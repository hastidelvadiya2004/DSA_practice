import java.util.*;
public class threesum{
    public static void main(String[] args) {
        int arr[] = {-1, -4, -1, 1 , 0, 2};
        int n = 6;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++){
            if(i == 0 || (i>0 && arr[i] != arr[i-1])){
                int left = i+1;
                int right = n-1;
                while(left < right){
                    if((arr[i] + arr[left] + arr[right] == 0)){
                        ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                        while(left<right && arr[left] == arr[left + 1]){
                            left++;
                        }
                        while(left<right && arr[right] == arr[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if((arr[i] + arr[left] + arr[right] < 0)){
                        left++;
                    }
                    else if((arr[i] + arr[left] + arr[right] > 0)){
                        right--;
                    }
                    
                }
            }
        }
        System.out.println(ans);
    }
}
