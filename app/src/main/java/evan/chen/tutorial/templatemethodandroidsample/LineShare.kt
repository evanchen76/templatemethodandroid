package evan.chen.tutorial.templatemethodandroidsample

import android.content.Context
import android.content.Intent

class LineShare(private val context: Context):ShareProduct() {

    override fun createShareContent(productDesc: String): String {
        return "這是一個分享到Line的產品資訊:$productDesc"
    }

    override fun startIntent(shareContent: String) {

        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareContent)
        sendIntent.type = "text/plain"
        sendIntent.`package` = "jp.naver.line.android"
        context.startActivity(sendIntent)
    }
}