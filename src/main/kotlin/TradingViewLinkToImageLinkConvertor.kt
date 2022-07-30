fun main() {
    val link = "https://www.tradingview.com/x/GZlwEQBN/"
    println(tradingViewLinkToImageLinkConvertor(link))
}

fun tradingViewLinkToImageLinkConvertor(link: String): String {
    var imageUrl = ""
    val BASE_URL = "https://s3.tradingview.com/snapshots/"
    val linkArray = link.replace("https://", "").split("/")
    imageUrl = BASE_URL + linkArray[2].toCharArray()[0].lowercase() + "/" + linkArray[2] + ".png"
    return imageUrl
}
