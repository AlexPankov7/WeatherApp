package com.example.myweatherapp365.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myweatherapp365.R
import com.example.myweatherapp365.adapters.WeatherAdapter
import com.example.myweatherapp365.adapters.WeatherModel
import com.example.myweatherapp365.databinding.FragmentHoursBinding
import com.example.myweatherapp365.databinding.FragmentMainBinding


class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel(
                "", "12:00",
                "Sunny", "25C",
                "","", "", ""),
            WeatherModel(
                "", "13:00",
                "Sunny", "27C",
                "","", "", ""),
            WeatherModel(
                "", "14:00",
                "Sunny", "35C",
                "","", "", "")

        )
        adapter.submitList(list)

    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}