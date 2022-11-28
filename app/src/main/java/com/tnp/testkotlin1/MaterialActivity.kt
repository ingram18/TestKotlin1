package com.tnp.testkotlin1

import android.content.Context
import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.tnp.testkotlin1.androiduse.SecretNumber
import com.tnp.testkotlin1.databinding.ActivityMaterialBinding
import kotlinx.android.synthetic.main.content_material.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlin.math.log

class MaterialActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMaterialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaterialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_material)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

            AlertDialog.Builder(this).setTitle(R.string.dialog_title)
                .setMessage(R.string.bigger)
                .setPositiveButton(R.string.ok  , OnClickListener { _, _ ->
                    //ANS: onCreate$lambda-1$lambda-0
                    val TAG = object{}.javaClass.enclosingMethod?.name;
                    var intent = Intent(this, RecordActivity::class.java )

                    intent.putExtra("para1" , 5 )
                    //startActivity(intent)


                    getSharedPreferences("guess" , Context.MODE_PRIVATE)
                        .edit()
                        .putString("REC_NAME","Ingram")
                        .putInt("SCORE" , 100)
                        .commit() //.apply()
                    var score = getSharedPreferences("guess", Context.MODE_PRIVATE)
                        .getInt("SCORE" , 0)

                    Log.i(TAG, "onCreate: $score")


                    var sn = SecretNumber().test1(1).test2(3)

                    Log.d(TAG, "onCreate: $TAG")
                    Log.i(TAG, "onCreate: ")
                }

                )
                .setNegativeButton("cancel", null)
                .show()
        }


        //spinner
        var colors = arrayOf("red","green","yellow")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, colors)
        spinner3.adapter = adapter

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_material)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}