package com.adso.fragmentsapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment() {

    private var nombre: String? = null
    private var correo: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            nombre = it.getString(NOMBRE_BUNDLE)
            correo = it.getString(CORREO_BUNDLE)
            Log.i("mensaje", nombre.orEmpty())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {
         const val NOMBRE_BUNDLE = "nombre_bundle"
         const val CORREO_BUNDLE = "correo_bundle"
        @JvmStatic
        fun newInstance(nombre: String, correo: String) =
           FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(NOMBRE_BUNDLE, nombre)
                    putString(CORREO_BUNDLE, correo)
                }
            }
    }
}