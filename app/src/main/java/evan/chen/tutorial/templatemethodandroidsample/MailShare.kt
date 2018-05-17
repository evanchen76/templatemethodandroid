package evan.chen.tutorial.templatemethodandroidsample

import android.content.Context
import android.content.Intent
import android.net.Uri

class MailShare(private val context:Context) :ShareProduct() {
    override fun createShareContent(productDesc: String): String {
        return "這是一個分享到Mail的產品資訊:$productDesc"
    }

    override fun startIntent(shareContent: String) {
        //在這裡開啟Mail App傳入資料

        val mailto = "mailto:test@gmail.com" +
                "?cc=" + "test@gmail.com" +
                "&subject=" + Uri.encode("產品分享") +
                "&body=" + Uri.encode(shareContent)

        val emailIntent = Intent(Intent.ACTION_SENDTO)
        emailIntent.data = Uri.parse(mailto)
        context.startActivity(emailIntent)
    }
}