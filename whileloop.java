import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
//         int i = 1;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//  }
//     }
    
// }
    // int i=1;
    // while(i<=10){
    //     System.out.println(i);
    //     i++;

    // }
    // do{
    //     System.out.println("Hello");
    // } while (false);
    //  int i=1;
    //  while(i<=100){
    //     System.out.println(i);
    //     i++;
    //  }
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your a number");
        int num= sc.nextInt();
        
        int i = 1;
        do { 
            System.out.println(num+"*"+ i+"="+i*num);
            i++;
        } while (i<11);


    }
}
