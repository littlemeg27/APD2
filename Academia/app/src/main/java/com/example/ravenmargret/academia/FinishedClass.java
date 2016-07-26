package com.example.ravenmargret.academia;


public class FinishedClass
{
        String mClassName;
        Double mClassGrade;
        Double mClassWeight;

        public FinishedClass(String mClassName, Double mClassGrade, Double mClassWeight)
        {
            this.mClassName = mClassName;
            this.mClassGrade = mClassGrade;
            this.mClassWeight = mClassWeight;
        }

        public String getmClassName() {return mClassName;}
        public Double getmClassGrade() {return mClassGrade;}
        public Double getmClassWeight() {return mClassWeight;}


        public void setmClassName(String mClassName) {this.mClassName = mClassName;}
        public void setmClassGrade(Double mClassGrade) {this.mClassGrade = mClassGrade;}
        public void setmClassWeight(Double mClassWeight) {this.mClassWeight = mClassWeight;}

        @Override
        public String toString()
        {
            return mClassName;
        }

//        @Override
//        public boolean equals(Object o)
//        {
//            FinishedClass finishedCheck = (FinishedClass)o;
//
//            if (finishedCheck.mClassName.equals(mClassName) && finishedCheck.mClassGrade.equals(mClassGrade) && finishedCheck.mClassWeight == mClassWeight)
//            {
//                return true;
//            }
//
//            return false;
//        }
}
