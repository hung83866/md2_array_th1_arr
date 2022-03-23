package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {1,2,4,68,3,2,7};
        daoNguocPhanTuMang(array);
    }
    static void    daoNguocPhanTuMang(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1] = temp;

        }
        for (int newArray: arr ) {
            System.out.print(newArray +" ");
        }
    }
}
