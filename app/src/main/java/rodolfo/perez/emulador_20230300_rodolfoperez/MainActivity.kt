package rodolfo.perez.emulador_20230300_rodolfoperez

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import rodolfo.perez.emulador_20230300_rodolfoperez.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.Hogar, R.id.Perfil, R.id.navigation_notifications
            )
        )

        val btnVer = findViewById<Button>(R.id.btnSee)
        val txtNombre = findViewById<TextView>(R.id.txtName)


        btnVer.setOnClickListener(){
            txtNombre.setText("Rodolfo Antonio Perez Hernandez")
        }

        val btnBotonLista = findViewById<Button>(R.id.btnContactos)
        val txtListaContactos = findViewById<TextView>(R.id.txtLista)

        btnBotonLista.setOnClickListener(){
            txtListaContactos.setText("20230300@ricaldone.edu.sv")
        }





        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}