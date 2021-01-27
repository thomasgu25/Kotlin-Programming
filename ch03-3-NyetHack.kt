fun main(){
    val name = "Madrigal"
    var healthPoints = 89
    if (healthPoints == 100){
        println(name+"健康狀態極佳")
	} else if (healthPoints >= 90){
		println(name+"有一些小擦傷")
	} else if (healthPoints >=75){
		println(name+"有一些傷口")
	} else if (healthPoints >= 15){
		println(name+"嚴重受傷")
	} else {
		println(name+"情況不妙")
	}
}