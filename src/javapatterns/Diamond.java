package javapatterns;
import java.util.*;
class Diamond_Pattern {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("  ");
            }
            for(int j=1;j<i+1;j++){
                System.out.print(j+ "   ");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(j+ "   ");
            }
            System.out.println();
        }

      

    } 
}