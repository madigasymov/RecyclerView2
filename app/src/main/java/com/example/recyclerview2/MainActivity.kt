package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CardAdapter() {
            Toast.makeText(this, "Position = $it", Toast.LENGTH_SHORT).show()
        }

        rvCards.adapter = adapter
        rvCards.layoutManager = GridLayoutManager(this, 2)

        val cardList = listOf(
            CardModel("https://media.wired.com/photos/598e35fb99d76447c4eb1f28/master/pass/phonepicutres-TA.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", true, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199),
            CardModel("https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", false, "Kazakhstan", "Asdd svcsfs svscsd", 23, 4.99f, 199))

        adapter.addData(cardList)
    }
}
