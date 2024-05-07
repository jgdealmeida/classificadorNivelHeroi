fun main() {
    // Insira o nome do herói
    val nomeHeroi = "Star Child"

    // Insira a quantidade de XP
    val xp = 9500

    // Determine a classificação com base no XP
    val classificacao = when (xp) {
        in 0..1000 -> "Ferro"
        in 1001..2000 -> "Bronze"
        in 2001..5000 -> "Prata"
        in 5001..7000 -> "Ouro"
        in 7001..8000 -> "Platina"
        in 8001..9000 -> "Ascendente"
        in 9001..10000 -> "Imortal"
        else -> "Radiante"
    }

    // Apresente a classificação do herói
    println("$nomeHeroi, o Cowboy do Espaço, com $xp de XP, é classificado como $classificacao!")
}