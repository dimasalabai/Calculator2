package cdn.kotlincalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    companion object{
        const val CALCULATION_RESULT = "calculation_result"
        const val HEADING_RESULT = "heading_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        showResult()
    }

    fun showResult(){

        val resultCalc = intent.getStringExtra(CALCULATION_RESULT)
        val resultHead = intent.getStringExtra(HEADING_RESULT)

        result.text = resultCalc
        resultLabel.text = resultHead
    }
}