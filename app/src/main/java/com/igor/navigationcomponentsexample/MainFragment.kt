package com.igor.navigationcomponentsexample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(),View.OnClickListener {

    var navControler: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navControler = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.view_transactions_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.send_money_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_balance_btn).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.view_transactions_btn -> navControler!!.navigate(R.id.action_mainFragment_to_viewTransactionFragment)
            R.id.send_money_btn -> navControler!!.navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
            R.id.view_balance_btn -> navControler!!.navigate(R.id.action_mainFragment_to_viewBalanceFragment)

        }
    }


}
