package com.example.ravenmargret.academia;


import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FirebaseService
{
    FirebaseDatabase onGoingDatabase = FirebaseDatabase.getInstance();
    DatabaseReference onGoingRef = onGoingDatabase.getReference("onGoing");

//    private static FirebaseService mInstance;
//
//    private FirebaseService mFirebaseData;
    private ValueEventListener mDataListener;
//
    private FirebaseService(){}
//
//    public static FirebaseService getInstance()
//    {
//        if(mInstance == null)
//        {
//            mInstance = new FirebaseService();
//        }
//
//        return mInstance;
//    }


//    public void getData()
//    {
//        onGoingRef.addValueEventListener(new ValueEventListener()
//        {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot)
//            {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                String value = dataSnapshot.getValue(String.class);
//                //Log.d(TAG, "Value is: " + value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error)
//            {
//                // Failed to read value
//                //Log.w(TAG, "Failed to read value.", error.toException());
//            }
//        });
//    }
}