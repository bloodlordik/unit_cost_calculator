package ru.kirshov.unitcostcalculator.presentation


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.kirshov.unitcostcalculator.R
import ru.kirshov.unitcostcalculator.databinding.FragmentRootBinding


class RootFragment : Fragment(R.layout.fragment_root) {

    private var _binding:FragmentRootBinding? = null
    private val binding:FragmentRootBinding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRootBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}