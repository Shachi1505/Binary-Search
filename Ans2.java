public class Ans2 {
    // Print the index which is just greter than the target element.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int target = sc.nextInt();
System.out.println("Enter the elements of array");
int[] a = new int[n];
for(int i=0; i<n; i++){
    a[i] = sc.nextInt();
}
    int st=0, end=n-1, ans=n;
    while(st<=end){
int mid= st + (end-st)/2;
if(a[mid] > target){
    ans = Math.min(ans, mid);
    end = mid-1;
 } else { 
st = mid+1;
 }
   
}
System.out.println(ans);
    }
}



