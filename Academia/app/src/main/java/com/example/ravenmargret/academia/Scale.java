package com.example.ravenmargret.academia;

import java.io.Serializable;

public class Scale implements Serializable
{
    private static final long serialVersionUID = 8736847634070552888L;
    String mLetterGrade;
    Double mNumberGrade1;
    Double mNumberGrade2;
    Double mGPAValue;

    public Scale(String mLetterGrade, Double mNumberGrade1, Double mNumberGrade2, Double mGPAValue)
    {
        this.mLetterGrade = mLetterGrade;
        this.mNumberGrade1 = mNumberGrade1;
        this.mNumberGrade2 = mNumberGrade2;
        this.mGPAValue = mGPAValue;
    }

    public String getmLetterGrade() {return mLetterGrade;}
    public Double getmNumberGrade1() {return mNumberGrade1;}
    public Double getmNumberGrade2() {return mNumberGrade2;}
    public Double getmGPAValue() {return mGPAValue;}


    public void setmLetterGrade(String mLetterGrade) {this.mLetterGrade = mLetterGrade;}
    public void setmNumberGrade1(Double mNumberGrade1) {this.mNumberGrade1 = mNumberGrade1;}
    public void setmNumberGrade2(Double mNumberGrade2) {this.mNumberGrade2 = mNumberGrade2;}
    public void setmGPAValue(Double mGPAValue) {this.mGPAValue = mGPAValue;}

    @Override
    public String toString()
    {
        return mLetterGrade;
    }

//    @Override
//    public boolean equals(Object o)
//    {
//        Scale scaleCheck = (Scale)o;
//
//        if (scaleCheck.mLetterGrade.equals(mLetterGrade) && scaleCheck.mNumberGrade.equals(mNumberGrade) && scaleCheck.mGPAValue == mGPAValue)
//        {
//            return true;
//        }
//
//        return false;
//    }
}
