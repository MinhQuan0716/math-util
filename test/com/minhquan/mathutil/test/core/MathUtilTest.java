/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minhquan.mathutil.test.core;

import com.minhquan.mathutil.core.MathUtil;
import org.junit.Test;
import org.junit.Assert;




/**
 *
 * @author Minh Quan
 */
public class MathUtilTest {
    
    public MathUtilTest() {}
        //Đây là class sẽ sử dụng các hàm + thư viện / framework JUnit 
        //để kiểm thử/kiểm tra code chính= hàm tính giai thừa() bên main 
        //viết code để test code chính 
        // có nhiều quy tắc đặt tên hàm kiểm thử
        //nhưng thường sẽ nói lên mục đích của các case/tình huống kiểm thử 
        //tình huống xài hàm theo kiểu thành công và thất bại 
        //hàm dưới đây là tình huống test hàm chạy thành công 
        
        //@Test phía hậu trường chính là public static void main()
        // có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa 
        @Test
       public  void testGetFactoriaGivenRightArgumentReturnsWell(){
        int n=0;
        long excepted =1;
        long actual=MathUtil.getFactorial(n);
        //so sánh expected vs actual dùng màu xanh đỏ 
        org.junit.Assert.assertEquals(excepted, actual);
           org.junit.Assert.assertEquals(1, MathUtil.getFactorial(1));
            org.junit.Assert.assertEquals(2, MathUtil.getFactorial(2));
 org.junit.Assert.assertEquals(6, MathUtil.getFactorial(3));
 org.junit.Assert.assertEquals(24, MathUtil.getFactorial(4));
  org.junit.Assert.assertEquals(120, MathUtil.getFactorial(5));
           
          
           


    } //hàm giúp so sánh hai giá trị nào đó có giống nhau ko 
       // nếu giống nhau-> thấy màu xanh đè đường , code ngon
       //nếu thấy màu đỏ-> expected và actual ko giống nhau 
    // gộp thêm vài case nữa ở đây 
      //hamf getF() ta thiết kế có 2 tình huống xử lí 
       //1.Đưa data tử tế trong [0..20]=> tính đúng đc n!=> Done
       //2. đưa data vào cá chớn,âm,>20;THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ 
       //rất mong ngoại lệ xuất hiện với n cà chớn này 
       //nếu hàm nhận vào n<0 hoặc n>20 và hàm ném ra ngoại lệ 
       //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ->XANH PHẢI XUẤT HIỆN 
       //nếu hàm nhận vào n<0 hoặc n >20 và hàm éo ném ra ngoại lệ 
       //SURE,HÀM CHẠY SAI THIẾT KẾ,SAI KÌ VỌNG.MÀU ĐỎ
       //TEST CASE:
       //INPUT:-5
       //Expected:IllegalArgumentException phải xuất hiện 
       //tình huống bất thường,ngoại lệ, ngoài dự tính ,dự liệu
       //là những ko thể đo lường so sánh theo kiểu value
       //mà chỉ có thể đo lường=cách chúng có xuất hiện hay ko
       //assertEquals() ko dùng để so sánh 2 ngoại lệ 
       //equals() là bằng nhau hay ko trên value 
       @Test (expected=IllegalArgumentException.class)
       public void testGetFactorialGivenWrongArgumentThrowsException(){
           MathUtil.getFactorial(-5);
       }
              //cách khác bắt ngoại lệ xuất hiện,viết tự nhiên hơn s
       //xài lambda 
       //Test case:hàm sẽ ném về ngoại lệ nếu nhận 21 
       //Tui cần thấy màu xanh khi chơi với 21!
              @Test 
       public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
         org.junit.Assert.assertThrows(IllegalArgumentException.class, 
                () -> MathUtil.getFactorial(21));}
        //   MathUtil.getFactorial(-5);

       //MÀU ĐỎ,do hàm có ném ngoại lệ nhưng ko phải ngoại lệ như kỳ vọng,chứ ko phải hàm ném sai 
    //   @Test (expected = NumberFormatException.class)
     //    public void testGetFactorialGivenWrongArugmentThrowsException(){
      //       MathUtil.getFactorial(-5);//hàm @Test chạy,hay hàm getF() chạy sẽ ném về ngoại lệ   
        // }
       // chủ động kiểm soát ngoại lệ 
      //               @Test 
       //public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch (){
         //                try {
           //                            MathUtil.getFactorial(-5);
             //            } catch (Exception e) {
                             //bắt try - cacth là JUnit sẽ ra màu xanh do try cacth đã chủ động kiểm soát ngoại lệ 
                             // nhưng ko chắc là ngoại lệ mình cần có xuất hiện hay  ko
                             //có đoạn code kiểm soát đúng ngoại lệ IlleggalArgumentException
               //            org.junit.Assert.assertEquals("Invalid argument.N must be between 0..20",e.getMessage());
                           
                 //        }

       }
       

