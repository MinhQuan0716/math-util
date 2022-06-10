/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhquan.mathutil.main;

import com.minhquan.mathutil.core.MathUtil;

/**
 *
 * @author Minh Quan
 */
public class Main {
    public static void main(String [] args){
        //thử nghiệm hàm tính giai thừa coi chạy đúng gía trị hay ko
    // ta phải đưa ra các tình huống sử dụng hàm trong thực tế 
    // ví dụ -5 : coi tính được ko ; 0 : tính ra mấy; 21 :tính được ko 
    //Test case : một tình huống hàm /app/màn hình / tính năng được đưa vào sử dungj
    // giả lập hành vi xài của 1 ai đó 
    //test case là 1 tình huống sử dụng,xài app  hay xài hàm mà nó bao gồm 
    // data:đầu vào cụ thể nào đó
    // output:đầu ra ứng với xử lý của hàm chức năng của app 
    //kì vọng: Mong muốn hàm sẽ trả về value nào đó
    //so sánh để xem kết quả có như kìvongj hay ko
    long expected=120;//khi tính 5
    int n=5;//input
    long actual=MathUtil.getFactorial(n);
    System.out.println("5!=120(expected);atual= "+actual);
    
}}
