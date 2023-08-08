package com.example.viewpager2.Utils

import com.example.viewpager2.Data.User
import com.example.viewpager2.R


object Mydata {
    var list = ArrayList<User>()

    fun addUser(){
        list.add(User(R.drawable.img1, "Geoaxborot", "Geoaxborot moduli orqali siz o'zingizga yaqin \n" + "bo'lgan migrantlar va boshqa muassasalar \n" + "haqida ma'lumot olishingiz mumkin"))
        list.add(User(R.drawable.img2, "Huquqiy axborot", "Huquqiy axborot moduli orqali siz migratsiya \n" + "sohasiga oid yangiliklardan, qonunlardan \n " + "xabardor bo'lishingiz va online konsultatsiya \n " + "olishingiz mumkin"))
        list.add(User(R.drawable.img3, "To'lovlar xizmatlari", "To'lov xizmatlari moduli orqali siz masofadan \n turib turli xil xizmatlarga to'lovlar haqida \n ma'lumot olishingiz va to'lovlarni amalga\noshirishingiz mumkin"))
        list.add(User(R.drawable.img4, "Qo'shimcha imkoniyat", "Qo'shimcha imkoniyatlar moduli orqali siz\ninteraktiv so'zlashgichlar va lug'atlar \nyordamida til bilish savodxonligingizni \noshirishingiz mumkin"))
    }
}