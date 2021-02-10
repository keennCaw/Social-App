package com.keennhoward.socialapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.keennhoward.socialapp.databinding.FragmentLoginBinding
import com.keennhoward.socialapp.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.registerLogin.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment) }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}