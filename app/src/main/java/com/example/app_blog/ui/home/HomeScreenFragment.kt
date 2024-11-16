package com.example.app_blog.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.app_blog.R
import com.example.app_blog.databinding.FragmentHomeScreenBinding
import com.google.firebase.Timestamp
import com.example.app_blog.data.model.Post
import com.example.app_blog.ui.home.adapter.HomeScreenAdapter

class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeScreenBinding.bind(view)

        val postList = listOf(
            Post("https://cdn-icons-png.freepik.com/256/16429/16429645.png", "Jair", Timestamp.now(), "https://images.squarespace-cdn.com/content/v1/5eacfbcb226dc82fa32ebc80/b651598e-4c8d-4455-b212-47cf78862521/paisaje-de-Canada-atardecer-Lake-Louise-parque-nacional-Banff-lugares-turisticos-de-Canada.jpg"),
            Post("https://cdn-icons-png.freepik.com/256/16429/16429645.png", "Misael", Timestamp.now(), "https://www.elgrafico.mx/sites/default/files/styles/v2022_detalle_nota_1200x740/public/article/2024/07/28/10_paisajes_hermosos_que_ofrece_la_naturaleza_aqui_te_los_mostramos.jpg?itok=Sxil26lI"),
            Post("https://cdn-icons-png.freepik.com/256/16429/16429645.png", "Antonio", Timestamp.now(), "https://www.dzoom.org.es/wp-content/uploads/2019/09/paisajes-expresivos-734x489.jpg")
        )

        binding.rvHome.adapter = HomeScreenAdapter(postList)
    }
}
