package com.example.carmediauitestt.subfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.carmediauitestt.R


class FragmentOne : Fragment() {

    private var progr = 60
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_one, container, false)

//        view.setOnClickListener {
//            var navController: NavController = Navigation.findNavController(view)
//            navController.navigate(R.id.action_fragmentOne_to_fragmentTwo)
//        }
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = progr
    }


}