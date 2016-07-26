package com.example.ravenmargret.academia;

import java.io.Serializable;

public class OnGoingClass implements Serializable
{
    private static final long serialVersionUID = 8736847634070552888L;
    String mProjectName;
    String mProjectWeight;
    double mProjectGrade;

    public OnGoingClass(String mProjectName, String mProjectWeight, int mProjectGrade)
    {
        this.mProjectName = mProjectName;
        this.mProjectWeight = mProjectWeight;
        this.mProjectGrade = mProjectGrade;
    }

    public String getmProjectName() {return mProjectName;}
    public String getmProjectWeight() {return mProjectWeight;}
    public double getmProjectGrade() {return mProjectGrade;}


    public void setmProjectName(String mProjectName) {this.mProjectName = mProjectName;}
    public void setmProjectWeight(String mProjectWeight) {this.mProjectWeight = mProjectWeight;}
    public void setmProjectGrade(double mProjectGrade) {this.mProjectGrade = mProjectGrade;}

    @Override
    public String toString()
    {
        return mProjectName;
    }

    @Override
    public boolean equals(Object o)
    {
        OnGoingClass onGoingCheck = (OnGoingClass)o;

        if (onGoingCheck.mProjectName.equals(mProjectName) && onGoingCheck.mProjectWeight.equals(mProjectWeight) && onGoingCheck.mProjectGrade == mProjectGrade)
        {
            return true;
        }

        return false;
    }
}
