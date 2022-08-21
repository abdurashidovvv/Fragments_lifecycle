package com.abdurashidov.fragments_lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {

    private val TAG="BlankFragment"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        Log.d(TAG, "onCreateView: ")
        // Inflate the layout for this fragment
        val root= inflater.inflate(R.layout.fragment_blank, container, false)
        val btn=root.findViewById<Button>(R.id.btn_next)

        btn.setOnClickListener {

//            val bundle=Bundle()
//            bundle.putString("keyName", text)
//            blankFragment2.arguments=bundle

            val text=root.findViewById<EditText>(R.id.edt_1).text.toString()
            val blankFragment2=BlankFragment2.newInstance(text)

            val manager=parentFragmentManager
            manager.beginTransaction()
                .setCustomAnimations(R.anim.fragment_anim_2, R.anim.fragment_anim_1, R.anim.fragment_anim_2, R.anim.fragment_anim_1)
                .replace(R.id.my_container, blankFragment2)
                .addToBackStack(blankFragment2.toString())
                .commit()
        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach: ")
    }

}