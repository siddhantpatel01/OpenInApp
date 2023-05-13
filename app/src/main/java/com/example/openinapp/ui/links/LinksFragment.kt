package com.example.openinapp.ui.links

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.openinapp.databinding.FragmentLinksBinding
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import java.util.Calendar

class LinksFragment : Fragment() {

    private var _binding: FragmentLinksBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val homeViewModel = ViewModelProvider(this).get(LinksViewModel::class.java)

        _binding = FragmentLinksBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val c = Calendar.getInstance()
        val timeOfDay = c.get(Calendar.HOUR_OF_DAY)

        val greeting: String = when (timeOfDay) {
            in 0..11 -> "Good morning!"
            in 12..15 -> "Good afternoon!"
            in 16..20 -> "Good evening!"
            else -> "Good night!"
        }
        binding.greetingTitle.text = greeting

//        // Set chart description
//        binding.lineChart.description.isEnabled = false
//
//// Enable touch gestures
//        binding.lineChart.setTouchEnabled(true)
//        binding.lineChart.setDragEnabled(true)
//        binding.lineChart.setScaleEnabled(true)
//        binding.lineChart.setPinchZoom(true)
//
//// Set X-axis values
//        val entries = mutableListOf<Entry>()
//        entries.add(Entry(0f, 1f))
//        entries.add(Entry(1f, 3f))
//        entries.add(Entry(2f, 2f))
//        entries.add(Entry(3f, 5f))
//        entries.add(Entry(4f, 4f))
//        entries.add(Entry(5f, 6f))
//
//        val dataSet = LineDataSet(entries, "Label")
//        dataSet.color = Color.RED
//        dataSet.valueTextColor = Color.BLACK
//
//// Set data and refresh chart
//        val lineData = LineData(dataSet)
//        binding.lineChart.data = lineData
//        binding.lineChart.invalidate()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}