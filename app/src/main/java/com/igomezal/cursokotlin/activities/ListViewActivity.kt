package com.igomezal.cursokotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.igomezal.cursokotlin.R
import com.igomezal.cursokotlin.adapters.PersonAdapter
import com.igomezal.cursokotlin.models.Person
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    private lateinit var adapter: PersonAdapter
    private lateinit var personList: List<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        personList = getPersons()
        adapter = PersonAdapter(this, R.layout.list_view_person, personList)

        listView.adapter = adapter
    }

    private fun getPersons(): List<Person> {
        return listOf(
                Person("Alejandro", "Lora", 27),
                Person("Fernando", "Vega", 37),
                Person("Alicia", "Gómez", 19),
                Person("Paula", "Escobar", 33),
                Person("Alberto", "Parada", 22),
                Person("Cristian", "Romero", 44),
                Person("Octavio", "Hernández", 23),
                Person("Yaiza", "Costi", 43),
                Person("Naomi", "Fernandez", 57),
                Person("Jason", "Otah", 16)
        )
    }
}
