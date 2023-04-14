package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentGuidelineBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GuidelineFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GuidelineFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var count = 0
        val binding = FragmentGuidelineBinding.inflate(inflater, container, false)
        binding.next.setOnClickListener {
            when (count) {
                0 -> {
                    binding.des.text = "Learn anytime and anywhere easily and conveniently"
                    binding.img.setImageResource(R.drawable.img_3)
                    count++
                }
                1 -> {
                    binding.des.text = "Let's improve your skills together with Elera right now!"
                    binding.img.setImageResource(R.drawable.img)
                    binding.next.text = "Get Started"
                    count++
                }
                2 -> {
                    findNavController().navigate(R.id.action_guidelineFragment_to_signUpFragment)

                }
            }
        }
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GuidelineFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GuidelineFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}