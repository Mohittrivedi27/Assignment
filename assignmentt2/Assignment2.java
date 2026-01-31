// //Reverse and Pallindrome

// import java.util.*;
//  public class Assignment2{
//   public static void main(String[] args) {
//     Scanner s = new Scanner(System.in);
//     System.out.println("Enter any string: ");
//     String a = s.nextLine();
//     String rev= "";
//     for(int i=a.length()-1;i>=0;i--){     // reverse
//       rev = rev+a.charAt(i);

//     }
//     System.out.println("Reverse String is: "+ rev);
//     if (a.equals(rev))                   // .equals  compares direct string content not memory referenecs
//       System.out.println("Pallindrome");
//     else
//       System.out.println("Not a pallindrome");

//   }
// }



// import java.util.*;

// class Assignment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any String: ");
//         String s = sc.next();

//         for (int i = 0; i < s.length(); i++)
//             if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
//                 System.out.println(s.charAt(i));
//                 break;
//             }
//     }
// }



//