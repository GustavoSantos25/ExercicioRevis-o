package com.example.snackbar.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snackbar.R
import com.example.snackbar.domain.Gastos
import kotlinx.android.synthetic.main.fragment_gasto.*
import kotlinx.android.synthetic.main.fragment_gasto.view.*

class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater!!.inflate(R.layout.fragment_gasto, container, false)
        view.btnGastos_cadastrar.setOnClickListener {
            val descricao = ilGastos_descricao.text.toString()
            val categoria = ilGastos_categoria.text.toString()
            val dataHora = ilGastos_dataHora.text.toString()
            val valor = ilGastos_valor.text.toString().toDouble()
            val gasto : Gastos = Gastos(descricao, categoria, dataHora, valor)
        }
        return view
    }

    companion object{
        fun newInstance() = GastosFragment()
    }
}