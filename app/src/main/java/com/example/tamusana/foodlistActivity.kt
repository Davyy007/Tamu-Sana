package com.example.tamusana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class foodlistActivity : AppCompatActivity() {

    var gotoBurger:CardView?=null
    var gotoBiryani:CardView?=null
    var gotoBhajia:CardView?=null
    var gotoKenyanFish:CardView?=null
    var gotoFrenchToast:CardView?=null
    var gotoPilau:CardView?=null
    var gotoPancakes:CardView?=null
    var gotoCrunchyChicken:CardView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodlist)

        gotoBurger=findViewById(R.id.cvBurger)
        gotoBiryani=findViewById(R.id.cvBiryani)
        gotoBhajia=findViewById(R.id.cvBajia)
        gotoKenyanFish=findViewById(R.id.cvKenyanFish)
        gotoFrenchToast=findViewById(R.id.cvFrenchToast)
        gotoPilau=findViewById(R.id.cvPilau)
        gotoPancakes=findViewById(R.id.cvPancakes)
        gotoCrunchyChicken=findViewById(R.id.cvCrunchychicken)



        gotoBurger!!.setOnClickListener{
            var gotoBurgerIntent=Intent(applicationContext,BurgerActivity::class.java)
            startActivity(gotoBurgerIntent)
        }

        gotoBiryani!!.setOnClickListener{
            var gotoBiryaniIntent=Intent(applicationContext,BiryaniActivity::class.java)
            startActivity(gotoBiryaniIntent)
        }

        gotoBhajia!!.setOnClickListener{
            var gotoBhajiaIntent=Intent(applicationContext,BhajiaActivity::class.java)
            startActivity(gotoBhajiaIntent)
        }

        gotoKenyanFish!!.setOnClickListener{
            var gotoKenyanFishIntent=Intent(applicationContext,KenyanFishActivity::class.java)
            startActivity(gotoKenyanFishIntent)
        }

        gotoFrenchToast!!.setOnClickListener{
            var gotoFrenchToastIntent=Intent(applicationContext,FrenchToastActivity::class.java)
            startActivity(gotoFrenchToastIntent)
        }

        gotoPilau!!.setOnClickListener{
            var gotoPilauIntent=Intent(applicationContext,PilauActivity::class.java)
            startActivity(gotoPilauIntent)
        }

        gotoCrunchyChicken!!.setOnClickListener{
            var gotoCrunchyChickenIntent=Intent(applicationContext,CrunchyChickenActivity::class.java)
            startActivity(gotoCrunchyChickenIntent)
        }

        gotoPancakes!!.setOnClickListener{
            var gotoPancakesIntent=Intent(applicationContext,PancakesActivity::class.java)
            startActivity(gotoPancakesIntent)
        }














    }
}