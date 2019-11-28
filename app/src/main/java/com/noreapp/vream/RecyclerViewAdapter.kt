package com.noreapp.vream

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerViewAdapter: RecyclerView.Adapter<CustomViewHolder>() {
    private val dreamTitles = listOf("A Whole New World", "Fighting Bulls", "Running Back in Time","fourth")
    private val dreamBodies = listOf("Last night, I dreamt that tornadoes were destroying the world as we know it. But somehow, I, along with my family, managed to escape to this place with a lot of pyramids (think ancient Egypt). For some odd reason, pyramids are virtually impervious to tornadoes. So a tornado passed by and destroyed the world. All our food. Everything was gone. We came out looking rough with dust all over us.", "body number two description for two description for two description for two description for two description for two " +
            "This is my new favorite dream. I was in my dorm at Stanford, the lounge looked exactly like how our lounge looks right now and the doors were positioned well too. There was a cow with horns that was trying to enter our dorm. We were outside and we somehow managed entering while the cow was still out. However, whenever we closed one of the doors to the lounge, the other one propped open. So basically all I did in this dream was run back and forth between the doors and close them before the cow could come in. "
             , " was at track practice, and we were doing something like 200 meter repetitions. I was feeling pretty bad about myself, because I used to be very good at track. Since I developed an autonomic nervous system disorder, however, at the end of my junior year of high school, it had become extremely difficult to even keep up with the slowest runners on the team. After practice, I was with my best friends from my old high school track team, and a few other people who used to be very important in my life but who I have lost touch with. As our cool down (in high school we always had to run back to school from the park we practiced at for cross country practice), we had to run up a tunnel in the earth. We were running upward--like we had been underground and we needed to make it above ground.",
        "dfhsad skdf gsd fhg ojaoei faodif ha9sifh od nvaosdhn aiu hf")

    override fun getItemCount(): Int {
        return dreamTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val dreamTitle = dreamTitles[position]
        val dreamBody = dreamBodies[position]
        holder.view.dream_title.text = dreamTitle
        holder.view.dream_body.text = dreamBody
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}