package ru.gzaytsev.bicycletracker.presentation.totalRidesFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.gzaytsev.bicycletracker.databinding.FragmentTotalRidesBinding

class TotalRidesFragment : Fragment() {

    private var _binding: FragmentTotalRidesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTotalRidesBinding.inflate(inflater, container, false)

        binding.buttonStartRide.setOnClickListener {
            var navController = findNavController()
            navController.popBackStack()
        }

        return binding.root
    }

}