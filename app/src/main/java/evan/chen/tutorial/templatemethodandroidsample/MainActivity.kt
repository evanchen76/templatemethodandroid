package evan.chen.tutorial.templatemethodandroidsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //準備分享的產品描述
        val productDesc = productDesc.text.toString()

        //分享至Line
        shareLine.setOnClickListener {
            val lineShare = LineShare(this)
            lineShare.share(productDesc)
        }

        //分享至Gmail
        shareGmail.setOnClickListener {
            val mailShare = MailShare(this)
            mailShare.share(productDesc)
        }
    }
}
