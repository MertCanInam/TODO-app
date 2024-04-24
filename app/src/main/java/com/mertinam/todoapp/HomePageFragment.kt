package com.mertinam.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mertinam.todoapp.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomePageBinding.inflate(inflater,container,false)

        binding.button.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_homePageFragment_to_firstPageFragment)
        }
        return binding.root
    }
}