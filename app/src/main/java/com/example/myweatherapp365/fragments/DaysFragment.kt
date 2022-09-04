package com.example.myweatherapp365.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myweatherapp365.adapters.WeatherAdapter
import com.example.myweatherapp365.databinding.FragmentDaysBinding


class DaysFragment : Fragment()
        private lateinit var adapter: WeatherAdapter
        private lateinit var binding: FragmentDaysBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaysBinding.inflate(inflater, container, false)
        return binding.root
    }



    private fun init() = with(binding) {
        adapter = WeatherAdapter()
        rcView.layoutManager = LinearLayoutManager(activity)
    }

    companion object {
        @JvmStatic
        fun newInstance() = DaysFragment()
    }



}

