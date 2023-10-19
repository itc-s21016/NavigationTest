package com.example.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationtest.MainFragmentDirections
import com.example.navigationtest.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.btZukan.setOnClickListener {
            Navigation.findNavController(it).navigate(
                MainFragmentDirections.actionMainFragmentToZukanFragment()
            )
        }
        binding.btCamera.setOnClickListener {
            Navigation.findNavController(it).navigate(
                MainFragmentDirections.actionMainFragmentToCameraFragment()
            )
        }
        binding.btOption.setOnClickListener {
            Navigation.findNavController(it).navigate(
                MainFragmentDirections.actionMainFragmentToOptionFragment()
            )
        }
        return binding.root
    }
}