package com.example.ravenmargret.academia;

import android.app.Activity;
import android.app.Fragment;

public class FinishedListFragment extends Fragment
{
    private OnListFragmentInteractionListener mListener;

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        try
        {
            mListener = (OnListFragmentInteractionListener) activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState)
//    {
//        super.onActivityCreated(savedInstanceState);
//
//        if(formObject == null)
//        {
//            loadData();
//        }
//        else
//        {
//            Toast.makeText(getActivity(), "The list is empty", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    @Override
//    public void onResume()
//    {
//        loadData();
//        super.onResume();
//    }
//
//    @Override
//    public void onListItemClick(ListView l, View v, int position, long id)
//    {
//        super.onListItemClick(l, v, position, id);
//        Form f = (Form) l.getAdapter().getItem(position);
//        mListener.onFragmentInteraction(f);
//    }
//
//    public void loadData()
//    {
//        formObject = FormUtil.load(getActivity());
//        ArrayAdapter<Form> formArrayAdapter = new ArrayAdapter<Form>(getActivity(), android.R.layout.simple_list_item_1, formObject);
//        setListAdapter(formArrayAdapter);
//    }

    public interface OnListFragmentInteractionListener
    {
        // TODO: Update argument type and name
        //void onListFragmentInteraction(DummyItem item);
    }
}
