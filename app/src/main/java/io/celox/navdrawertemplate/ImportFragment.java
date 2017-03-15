package io.celox.navdrawertemplate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Martin Pfeffer
 * @see <a href="https://celox.io">https://celox.io</a>
 */
public class ImportFragment extends Fragment {

    public static ImportFragment newInstance(int i) {
        ImportFragment fragment = new ImportFragment();
        Bundle args = new Bundle();
        args.putInt("the_id", i);
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View v = inflater.inflate(R.layout.fg_import, container, false);
        getActivity().setTitle("Import");
        return v;
    }

}
