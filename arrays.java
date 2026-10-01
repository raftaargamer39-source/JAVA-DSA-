public class arrays {
    static void target(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        int count = 0;

        while (start<end){
            int sum = arr[start] + arr [end];

            if (sum==target){
                count++;
                start++;
                end--;

            }
            else if (sum<target){
                start++;

            }
            else{
                end--;

            }



        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[]arr = {1,2,3,4,5,6};
        int target = 6;
        
        target(arr, target); 
        
        
    }
}



//      static void target(int[] arr , int target){
//         int start = 0;
//         int end = arr.length -1;
        


//         while (start<end){
//             int sum = arr[start] + arr[end];

//             if (sum==target){
                
//                 System.out.println("true");
//                 return;
               
             
//             }
//             else if (sum<target){
//                 start++;
//             }
//             else{
//                 end--;
//             }

//         }
//            System.out.println("false");
            

//     }
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5,6,};
//         int target = 6;
//         target(arr, target);

    
//     }
// }

//     static void palindrome(int[] arr){
//         int start = 0;
//         int end = arr.length -1;

//         while (start<end){
//             if(arr[start]!=arr[end]){
//                 System.out.println("not palindrome");
//                 return;
//             }
//             start++;
//             end--;
//         }
//         System.out.println("palindrome");
//     }
//     public static void main(String[] args){
//         int[] arr = {1,2,3,2,1};
//         palindrome(arr);
//     }
    


// }
//     static void elements(int[]arr){
//         int n = arr.length;
//         int temp = arr[n-1];
//         for (int i =n-1; i>0; i--){
//             arr[i] = arr[i-1];
//         }
//         arr[0] = temp;
//     }

//     public static void main(String[] args){
//         int arr[] = {3,4,5,6,7};
//         elements(arr);
       
//         for(int i=0; i <arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         }


// }
//     static void rev(int arr[]){
//         int start = 0;
//         int end = arr.length -1;

//         while (start<end){
//             int temp = arr[start];
//             arr[start]= arr[end];
//             arr[end]= temp;

//             start++;
//             end--;


            
            
//         }
//     }
//     public static void main(String[] args){
//         int[] arr ={ 2,3,5,7,6};

//         rev(arr);

//         for(int i = 0; i<arr.length;i++){
//             System.out.println(arr[i] +" ");
//         }
//     }
// }


// //     static int firstOccurrence(int[] arr, int target) {

// //         for (int i = 0; i < arr.length; i++) {
// //             if (arr[i] == target) {
// //                 return i;
// //             }
// //         }

// //         return -1;
// //     }
//     static int lastoccurence(int[]arr, int target){

//         for  (int i = 0; i<arr.length;i++){
//             if(arr[i]==target){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 20, 40};

//         int target = 20;
//         int target1 = 40;

//         int result = firstOccurrence(arr, target);
//         int result1 = lastoccurence(arr, target1);

//         System.out.println("First occurrence = " + result);
//         System.out.println("last occurence is = "+ result1 );
//     }
// }

    
    
    
    // static int[] copyarray(int[]arr){
    //     int[]copy=new int[arr.length];

    //     for(int i = 0; i<arr.length;i++){
    //         copy[i]=arr[i];
    //     }
    //     return copy;
    // }
    // public static void main(String[] args){
    //     int [] arr = {1,25,34,28,32};
        
    //     int[]result=copyarray(arr);
    //     for(int i = 0; i<result.length; i++){
    //         System.out.println(result[i]);

    //     }
        
    // }

    
// }

    // public static void main(String[] args){
        
//         static void positivenegativesum(int[] arr){
//             int positivesum = 0;
//             int negativesum = 0;

//             for (int i = 0; i<arr.length;i++){
//                 if (arr[i]>0){
//                     positivesum = positivesum + arr[i];
//                 }else if (arr[i]<0){
//                     negativesum = negativesum + arr[i];
//                 }

//             }
//             System.out.println("sum of positive numbers =" + positivesum);
//             System.out.println("sum of negative numbers =" + negativesum);
//         }
//     public static void main(String[] args){
//             int[] arr = {-2,-3,-4,1,32,43};

//           positivenegativesum(arr);



        




       
       
//         // int[] arr = {12,26,32,46,52};
//          // for(int i = arr.length-1; i >=0;i--){
//         //     System.out.println(arr[i]);
           

//         // int  target =26;
//        // int[] arr = {10,15,20,25,30};

//         // int max = arr[0];
//         // int min = arr[0];

//         // for (int i =0; i<arr.length; i++){
            
//         //     if (arr[i]> max) {
//         //         max=arr[i];
//         //     }
//         //     if (arr[i]<min) {
//         //         min=arr[i];
//         //     }
//         // }
//         // System.out.println("maximmum ="+ max);
//         // System.out.println("minimum ="+ min);

//     }
   

// }

