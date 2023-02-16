package ru.kirshov.unitcostcalculator.presentation


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import ru.kirshov.unitcostcalculator.R
import ru.kirshov.unitcostcalculator.data.ItemModel
import ru.kirshov.unitcostcalculator.databinding.FragmentRootBinding
import ru.kirshov.unitcostcalculator.domain.RootMainViewModel


class RootFragment : Fragment(R.layout.fragment_root) {

    private var _binding:FragmentRootBinding? = null
    private val binding:FragmentRootBinding get() = _binding!!
    private val viewModel by viewModels<RootMainViewModel>()

    private val testList = listOf<ItemModel>(
        ItemModel("first"),
        ItemModel("Second"),
        ItemModel("Thersy"),
        ItemModel("Forty")
    )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRootBinding.bind(view)
        val adapter = ItemListAdapter()
        binding.listView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.listView.adapter = adapter
        adapter.submitList(testList)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}