import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

static int B,H;
static boolean flag = true;

static{
    Scanner scan = new Scanner (System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    scan.close();
    if (H<=0 || B<=0){
        flag = false;
        System.err.println("java.lang.Exception: Breadth and height must be positive");
    }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

