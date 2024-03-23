package com.example;
import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{

    @Test
    public void test1()
    {
        int conductGrade = -1;
        String Expected_Output = "Điểm nhập vào không hợp lệ";
        String Actual_Output = new App().checkConduct(conductGrade);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test2()
    {
        int conductGrade = 10;
        String Expected_Output = "Xuất sắc";
        String Actual_Output = new App().checkConduct(conductGrade);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test3()
    {
        int conductGrade = 8;
        String Expected_Output = "Giỏi";
        String Actual_Output = new App().checkConduct(conductGrade);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test4()
    {
        int conductGrade = 7;
        String Expected_Output = "Khá";
        String Actual_Output = new App().checkConduct(conductGrade);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test5()
    {
        int conductGrade = 5;
        String Expected_Output = "Trung bình";
        String Actual_Output = new App().checkConduct(conductGrade);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test6()
    {
        int conductGrade = 2;
        String Expected_Output = "Kém";
        String Actual_Output = new App().checkConduct(conductGrade);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
}
