package javacode.hashing;

import java.util.Scanner;
// int arr can be of 1e6 size locally and 1e7 globally 
public class hash {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[10000];
        for(int i = 0; i<5; i++){
            hash[arr[i]]++;
        }
        System.out.println("which number freq you want to check?");
        int check = sc.nextInt();
        System.out.println(check+" appeared "+hash[check]+" times");
        sc.close();
    }
}
