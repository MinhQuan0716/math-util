/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhquan.mathutil.core;

/**
 *
 * @author Minh Quan
 */
public class MathUtil {
    //hàm này cung cấp cho ai đó nhiều hàm xử lý toán học
    // clone class Math của JDK
    //hàm thư viện xài chung cho ai đó  ,ko cần lưu lại trạng thái/giá trị 
    //hàm tính giai thừa!!
    // ko có giai thừa cho số âm
    //0!=1!=1 quy ước 
    //giai thừa hàm đồ thị dốc đứng,tăng nhanh về giá trị 
    // 20 giai thừa 18 con số 0, vừa đủ kiểu long 
    // 21 giai thừa tràn kiểu long 
    public static long getFactorial(int n ){
        if (n<0||n>20){
            throw new IllegalArgumentException("Invalid argument n must be between 0 to 20 ");
            
        } 
        if (n==0 || n==1){
            return 1;
        } 
        long product =1 ; 
        for (int i=2;i<=n;i++ ){
            product*=i;
        }
        return product ;    
    }
}
