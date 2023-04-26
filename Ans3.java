public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(), target = sc.nextInt();
 
 
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
 
 
       int low = 0, high = n - 1, first = -1, last = -1;
 
 
       while (low <= high) {
           int mid = (low + high) / 2;
           if (a[mid] == target) {
               first = mid;
               high = mid - 1;
           } else if (a[mid] > target) {
               high = mid - 1;
           } else low = mid + 1;
       }
 
 
       low = 0;
       high = n - 1;
       while (low <= high) {
           int mid = (low + high) / 2;
           if (a[mid] == target) {
               last = mid;
               low = mid + 1;
           } else if (a[mid] > target) {
               high = mid - 1;
           } else low = mid + 1;
       }
 
 
       if (first == -1) {
           System.out.println("target element not found");
           return;
       }
       System.out.println(last - first + 1);
   }
