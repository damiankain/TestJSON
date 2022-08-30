package com.damiankain.testjson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.damiankain.testjson.databinding.FragmentDescriptionBinding

class DescriptionFragment: Fragment () {
    private var _binding: FragmentDescriptionBinding? = null
    private val binding get() = requireNotNull(_binding) {
        "View was destroyed"
    }

}