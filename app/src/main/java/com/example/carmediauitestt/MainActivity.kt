package com.example.carmediauitestt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.carmediainventoryuitest.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    lateinit var viewPagerAdapter: ViewPagerAdapter

    lateinit var carRecyclerView: RecyclerView
    lateinit var carArrayList: ArrayList<Car>

    lateinit var title1:Array<String>
    lateinit var subtitle:Array<String>
    lateinit var carImg:Array<Int>
    lateinit var aegingmedia:Array<String>
    lateinit var stock:Array<String>
    lateinit var vin:Array<String>
    lateinit var statusimg:Array<Int>
    lateinit var status:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//--------------------------------View Pager---------------------------------------------------
        viewPager = findViewById(R.id.viewPager)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = viewPagerAdapter

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout,viewPager){tab,position->

        }.attach()

  //---------------------------------------recyclerView-------------------------------------------
        loadData()


        carRecyclerView = findViewById(R.id.rcv)
        carRecyclerView.layoutManager = LinearLayoutManager(this)
        carRecyclerView.setHasFixedSize(true)


        carArrayList = arrayListOf<Car>()
        getCarData()

    }

    private fun getCarData() {
        for (i in carImg.indices){
            val car = Car(title1[i], subtitle[i], carImg[i], aegingmedia[i], stock[i],vin[i],
                statusimg[i], status[i])

            carArrayList.add(car)
        }
        carRecyclerView.adapter = CarAdapter(carArrayList)
    }

    private fun loadData(){
        title1 = arrayOf("2019 MERCEDES C-Class","2019 MERCEDES C-Class","2019 MERCEDES C-Class","2019 MERCEDES C-Class","2019 MERCEDES C-Class","2019 MERCEDES C-Class",
            "2019 MERCEDES C-Class","2019 MERCEDES C-Class","2019 MERCEDES C-Class","2019 MERCEDES C-Class")

        //  title2 = arrayOf("C-Class","C-Class","C-Class","C-Class","C-Class","C-Class","C-Class","C-Class","C-Class","C-Class")

        subtitle = arrayOf("Avantgarde Edition Sedan","Avantgarde Edition Sedan","Avantgarde Edition Sedan","Avantgarde Edition Sedan",
            "Avantgarde Edition Sedan","Avantgarde Edition Sedan","Avantgarde Edition Sedan","Avantgarde Edition Sedan",
            "Avantgarde Edition Sedan","Avantgarde Edition Sedan")

        carImg = arrayOf(R.drawable.car_3,R.drawable.car_3,
            R.drawable.car_3,R.drawable.car_3,
            R.drawable.car_3,R.drawable.car_3,
            R.drawable.car_3,R.drawable.car_3,
            R.drawable.car_3,R.drawable.car_3)

        aegingmedia = arrayOf("Aging Media: 1d 2h 36m","Aging Media: 1d 2h 36m","Aging Media: 1d 2h 36m","Aging Media: 1d 2h 36m",
            "Aging Media: 1d 2h 36m","Aging Media: 1d 2h 36m","Aging Media: 1d 2h 36m","Aging Media: 1d 2h 36m",
            "Aging Media: 1d 2h 36m","Aging Media: 1d 2h 36m")

        stock = arrayOf("Stock:213787682713","Stock:213787682713","Stock:213787682713","Stock:213787682713","Stock:213787682713",
            "Stock:213787682713","Stock:213787682713","Stock:213787682713","Stock:213787682713","Stock:213787682713")

        vin = arrayOf("Vin:JH4KA4531KC033525","Vin:JH4KA4531KC033525","Vin:JH4KA4531KC033525","Vin:JH4KA4531KC033525",
            "Vin:JH4KA4531KC033525","Vin:JH4KA4531KC033525","Vin:JH4KA4531KC033525",
            "Vin:JH4KA4531KC033525","Vin:JH4KA4531KC033525","Vin:JH4KA4531KC033525")

        statusimg = arrayOf(R.drawable.rectangle_copy_27,R.drawable.rectangle_copy_27,R.drawable.rectangle_copy_27,
            R.drawable.rectangle_copy_27,R.drawable.rectangle_copy_27,R.drawable.rectangle_copy_27,
            R.drawable.rectangle_copy_27,R.drawable.rectangle_copy_27,R.drawable.rectangle_copy_27,R.drawable.rectangle_copy_27)

        status = arrayOf("BEING EDITED","BEING EDITED","BEING EDITED","BEING EDITED","BEING EDITED",
            "BEING EDITED","BEING EDITED","BEING EDITED","BEING EDITED","BEING EDITED")

    }
}