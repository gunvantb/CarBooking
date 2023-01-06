package com.carbooking.app.intro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.carbooking.app.R;

public class IntroItemFragment extends Fragment {

    private static final String ARG_POSITION = "slider-position";

    // prepare all title ids arrays
    private static final int[] PAGE_TITLES =
            new int[] { R.string.intro_title_1, R.string.intro_title_2, R.string.intro_title_3 };

    // prepare all description ids arrays
    private static final int[] PAGE_DESCRIPTION =
            new int[] {
                    R.string.intro_description_1, R.string.intro_description_2, R.string.intro_description_3
            };

    // prepare all images arrays
    private static final int[] PAGE_IMAGE =
            new int[] {
                    R.drawable.intro_img_1, R.drawable.intro_img_2, R.drawable.intro_img_3
            };

    private int position;
    public IntroItemFragment() {
        // Required empty public constructor
    }

    public static IntroItemFragment newInstance(int position) {
        IntroItemFragment fragment = new IntroItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_POSITION);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.intro_item_one, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // set page background
        TextView titleText = view.findViewById(R.id.titleText);
        TextView descriptionText = view.findViewById(R.id.descriptionText);
        ImageView imageView = view.findViewById(R.id.imageView);

        // set page title
        titleText.setText(PAGE_TITLES[position]);

        // set page sub title text
        descriptionText.setText(PAGE_DESCRIPTION[position]);

        // set page image
        imageView.setImageResource(PAGE_IMAGE[position]);
    }
}
