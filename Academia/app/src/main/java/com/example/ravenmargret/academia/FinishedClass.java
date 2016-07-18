package com.example.ravenmargret.academia;

import java.io.Serializable;

public class FinishedClass implements Serializable
{
        private static final long serialVersionUID = 8736847634070552888L;
        String mClassName;
        String mClassGrade;
        int mClassWeight;

        public FinishedClass(String mClassName, String mClassGrade, int mClassWeight)
        {
            this.mClassName = mClassName;
            this.mClassGrade = mClassGrade;
            this.mClassWeight = mClassWeight;
        }

        public String getmClassName() {return mClassName;}
        public String getmClassGrade() {return mClassGrade;}
        public int getmClassWeight() {return mClassWeight;}


        public void setmClassName(String mClassName) {this.mClassName = mClassName;}
        public void setmClassGrade(String mClassGrade) {this.mClassGrade = mClassGrade;}
        public void setmClassWeight(int mClassWeight) {this.mClassWeight = mClassWeight;}

        @Override
        public String toString()
        {
            return mClassName;
        }

        @Override
        public boolean equals(Object o)
        {
            FinishedClass finishedCheck = (FinishedClass)o;

            if (finishedCheck.mClassName.equals(mClassName) && finishedCheck.mClassGrade.equals(mClassGrade) && finishedCheck.mClassWeight == mClassWeight)
            {
                return true;
            }

            return false;
        }
}
