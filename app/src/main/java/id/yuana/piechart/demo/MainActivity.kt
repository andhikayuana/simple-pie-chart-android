package id.yuana.piechart.demo

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pieChart.setDataPoints(floatArrayOf(450F, 1230F, 200F, 400F))
        pieChart.setCenterColor(Color.WHITE)
        pieChart.setSliceColor(intArrayOf(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW))
    }
}
