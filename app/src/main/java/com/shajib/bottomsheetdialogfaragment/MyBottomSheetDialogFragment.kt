package com.shajib.bottomsheetdialogfaragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.shajib.bottomsheetdialogfaragment.databinding.FragmentMyBottomSheetBinding

/**
 * @author Shajib
 * @since Aug 10, 2024
 **/
class MyBottomSheetDialogFragment : BottomSheetDialogFragment() {
    private var _binding: FragmentMyBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMyBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog as BottomSheetDialog
        val bottomSheet = dialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
        bottomSheet?.let {
            val behavior = BottomSheetBehavior.from(it)
            // Set the bottom sheet to expand to half the screen height
            behavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
            it.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}