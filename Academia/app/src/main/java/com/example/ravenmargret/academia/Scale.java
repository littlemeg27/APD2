package com.example.ravenmargret.academia;

import java.io.Serializable;

public class Scale implements Serializable
{
    private static final long serialVersionUID = 8736847634070552888L;
    String mLetterGrade;
    String mNumberGrade;
    double mGPAValue;

    public Scale(String mLetterGrade, String mNumberGrade, int mGPAValue)
    {
        this.mLetterGrade = mLetterGrade;
        this.mNumberGrade = mNumberGrade;
        this.mGPAValue = mGPAValue;
    }

    public String getmLetterGrade() {return mLetterGrade;}
    public String getmNumberGrade() {return mNumberGrade;}
    public double getmGPAValue() {return mGPAValue;}


    public void setmLetterGrade(String mLetterGrade) {this.mLetterGrade = mLetterGrade;}
    public void setmNumberGrade(String mNumberGrade) {this.mNumberGrade = mNumberGrade;}
    public void setmGPAValue(double mGPAValue) {this.mGPAValue = mGPAValue;}

    @Override
    public String toString()
    {
        return mLetterGrade;
    }

    @Override
    public boolean equals(Object o)
    {
        Scale scaleCheck = (Scale)o;

        if (scaleCheck.mLetterGrade.equals(mLetterGrade) && scaleCheck.mNumberGrade.equals(mNumberGrade) && scaleCheck.mGPAValue == mGPAValue)
        {
            return true;
        }

        return false;
    }
}
