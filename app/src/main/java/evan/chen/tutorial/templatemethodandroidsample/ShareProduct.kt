package evan.chen.tutorial.templatemethodandroidsample

abstract class ShareProduct {

    fun share(productDesc:String){
        //組成分享內容文字
        val shareContent = createShareContent(productDesc)
        //開啟分享的App
        startIntent(shareContent)
    }

    abstract fun createShareContent(productDesc:String) :String
    abstract fun startIntent(shareContent:String)
}