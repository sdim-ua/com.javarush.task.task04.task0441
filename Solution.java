/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numb1 = Integer.parseInt(reader.readLine());
        int numb2 = Integer.parseInt(reader.readLine());
        int numb3 = Integer.parseInt(reader.readLine());
        
        if (numb1 > numb2 && numb2  > numb3 ||  numb1 < numb2 && numb2 < numb3){
            System.out.println(numb2);
        }
        else if (numb2 > numb1 && numb1  > numb3 || numb2 < numb1 && numb1 < numb3){
            System.out.println(numb1);
        }
        else if (numb2 > numb3 && numb3 > numb1 || numb2 < numb3 && numb3 < numb1){
            System.out.println(numb3);
        }
        else if (numb1 == numb2 && numb2 == numb3){
             System.out.println(numb1);
        }
        else if (numb1 == numb2){
             System.out.println(numb1);
        }
        else if (numb2 == numb3){
             System.out.println(numb2);
        }
        else if (numb1 == numb3){
             System.out.println(numb3);
        }
        
        
        
    }
}
