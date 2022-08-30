package com.damiankain.testjson

import androidx.fragment.app.Fragment
import com.damiankain.testjson.databinding.FragmentDescriptionBinding
import com.damiankain.testjson.databinding.FragmentListBinding

class ListFragment: Fragment () {
    private var _binding: FragmentListBinding? = null
    private val binding get() = requireNotNull(_binding) {
        "View was destroyed"
    }
}