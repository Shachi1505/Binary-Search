import java.util.Scanner;
public class Ans1 {
    static int search(int[] a, int target){
        int st=0, end = a.length-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[mid] < a[end]){
                if(target > a[mid] && target<= a[end]){
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int target = sc.nextInt();
System.out.println("Enter the elements of array");
int[] a = new int[n];
for(int i=0; i<n; i++){
    a[i] = sc.nextInt();
}
int result = search(a, target);
System.out.println(result);

    }
}
