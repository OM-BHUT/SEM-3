// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
		
//         Scanner sc = new Scanner(System.in);
        
//         int t = sc.nextInt();
        
//         while(t-->0){
//             int n = sc.nextInt();
//             sc.nextLine();
//             String s = sc.nextLine();
            
//             StringBuilder a= new StringBuilder();
//             StringBuilder b= new StringBuilder();
//             StringBuilder temp = new StringBuilder();
            
//             for(int i=0;i<s.length();i++){
//                 if("aeiou".indexOf(s.charAt(i)) != -1){
//                     temp = a;
//                     a=b;
//                     b=temp;
//                 }
                
//                 a = a.append(s.charAt(i));
//                 b = b.insert(0 ,s.charAt(i));
//             }
            
//             System.out.println(a);
//         }
        
    
// 	}
// }




import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            
            char arr[] = new char[n];
            
            int cur = n-1;
            int ind = n-1;
            int i=0;
            int j=n-1;
            int add = -1;
            while(cur>=0){
                arr[ind] = s.charAt(cur);
                ind+=add;
                
                if("aeiou".indexOf(s.charAt(cur)) != -1){
                    if(add==-1){
                        j = ind;
                        ind = i;
                        add = 1;
                    }else{
                        i = ind;
                        ind = j;
                        add = -1;
                    }
                }
                cur--;
            }
            
            System.out.println(String.valueOf(arr));
            // for(char c:arr){
            //     ans += c;
            // }
            
            // System.out.println(ans);
        }
        
    
	}
}