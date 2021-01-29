fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false
    //Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "綠色" else "空無一物"

    val healthStatus = when (healthPoints ) {
        100 -> "健康狀態極佳"
        in 90..99 -> "有一些小擦傷"
        in 75..89 -> if (isBlessed) {"雖有一些傷口，但恢復很快"} else {"有一些傷口"}
        in 15..74 -> "嚴重受傷"
        //顯示玩家狀態
        else -> "情況不妙"
    }
    println("光環顏色：$auraColor"+"    走運嗎？${if (isBlessed) "是的" else "否"}")
    println("$name $healthStatus")
}