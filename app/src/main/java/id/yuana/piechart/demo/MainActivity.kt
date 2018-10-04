package id.yuana.piechart.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pieChart.setCenterColor(R.color.white)
        pieChart.setDataPoints(floatArrayOf(450F, 1230F, 200F, 400F))
        pieChart.setSliceColor(intArrayOf(
                R.color.brown700,
                R.color.materialRed700,
                R.color.materialPink600,
                R.color.materialRed400))

        btnModify.setOnClickListener {
            pieChart.setCenterColor(R.color.white)
            pieChart.setDataPoints(floatArrayOf(100F, 200F, 300F, 400F, 100F, 200F))
            pieChart.setSliceColor(intArrayOf(
                    R.color.brown700,
                    R.color.materialRed700,
                    R.color.materialPink600,
                    R.color.materialRed400,
                    R.color.materialIndigo600,
                    R.color.colorAccent))
        }
    }
}
