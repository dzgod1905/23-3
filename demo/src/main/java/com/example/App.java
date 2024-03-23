package com.example;

public class App 
{
    public String checkConduct(int conductGrade) {
        String classification = "Điểm nhập vào không hợp lệ";
        if (conductGrade < 0 || conductGrade > 10) return classification;
        if (conductGrade >= 9) classification = "Xuất sắc";
        else {
            if(conductGrade >= 8) classification = "Giỏi";
            else {
                if(conductGrade >= 6) classification = "Khá";
                else {
                    if(conductGrade >= 5) classification = "Trung bình";
                    else classification = "Kém";
                }
            }
        }
        return classification;
    }
}
