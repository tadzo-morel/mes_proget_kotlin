//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    Module 1 – Introduction à Kotlin et à la programmation
//    Exercice 1-calcul de moyenne
/*    println("entrer 03 note decimalle:")
    val nbre1: Float=readln().toFloat()
    val nbre2: Float=readln().toFloat()
    val nbre3: Float=readln().toFloat()
    var moy: Float;
    moy=(nbre1 + nbre2 + nbre3)/3
    println("la moyenne est : M = ${moy}")

 */
//    exercice 2-Message personnalisé
 /*   print("entrer votre Prenom: ")
    val prenom: String=readln()
    print("entrer votre age: ")
    val age: Int=readln().toInt()
    print("entrer votre ville: ")
    val ville: String=readln()
    println("Bonjour ${prenom}, tu as ${age} ans et tu habites a ${ville} ")

  */
//exercice 3-L’année de vos 100 ans
  /*  var annee: Int=2025
    val cent=100
    print("entrer votre age actuel:")
    var age =readln().toInt()
    when{
        age>=100 ->println("vous avez 100 ans revolue")
        age<=0 -> println("votre age est incorrect")
        else -> {
            annee = (cent - age) + annee

            println("vous auriez 100 ans en ${annee}")
        }
    }*/
//    Exercice 4 – Compteur de mots
  /*  println("entrer une phrase ")
    val phrase=readln()
    var tab=phrase.split(" ")
    println("le nombre de mot que contient votre Phrase est ${tab.size}")

   */
//Exercice 5 – Carte d’identité virtuelle
  /*  print("Nom:  ")
    val nom=readln()
    print("Prenom: ")
    val prenom=readln()
    print("age: ")
    val age=readln().toInt()
    print("ville: ")
    val ville=readln()
    print("Profession: ")
    val profession=readln()
    println("\n\n")
    println("*******************CNI **********************")
    println("Nom       : ${nom}\nPrenom    : ${prenom}\nAge       : ${age} ans\nVille     : ${ville}\nProfession: ${profession}")
    println("*********************************************")
*/
//Module 2 – Structures de contrôle et fonctions
//    Exercice 1 – Catégorie d’âge
    /*println("J'affiche la categorie d'une personne selon son age: ")
    print("entrer votre age:")
    val age=readln().toInt()
    when{
        age<12 ->println("Enfant")
        age in 12 .. 17 -> println("Adolescent")
        age in 18 .. 64 -> println("Adulte")
        else -> println("Senior")
    }*/
//Exercice 2 – Nombres pairs et impairs
    /*println("--- Les 10 premiers nombres PAIRS ---")

    // On parcourt les 20 premiers nombres (de 1 à 20)
    var compteurPairs = 0
    for (nombre in 1..20) {
        // Le nombre est pair si le reste de la division par 2 est 0
        if (nombre % 2 == 0) {
            print("$nombre ")
            compteurPairs++
        }

        // On arrête la boucle une fois que nous avons trouvé 10 pairs
        if (compteurPairs >= 10) {
            break
        }
    }

    println("\n\n--- Les 10 premiers nombres IMPAIRS ---")

    // On reprend une boucle similaire pour les impairs
    var compteurImpairs = 0
    for (nombre in 1..20) {
        // Le nombre est impair si le reste de la division par 2 n'est PAS 0
        if (nombre % 2 != 0) {
            print("$nombre ")
            compteurImpairs++
        }

        // On arrête la boucle une fois que nous avons trouvé 10 impairs
        if (compteurImpairs >= 10) {
            break
        }
    }*/
//Exercice 3 – Moyenne de N nombres
    println("combien de nombre voulez vous entrez:")
    var nbre=readln().toInt()
    var somme=0.0
    for (i in 1 .. nbre){
        println("entrer le nombre ${i}")
       var nb= readln().toFloat()
        somme=(somme+nb)
    }
    println("la moyenne des ${nbre} nombres est : \n Moy= ${somme/nbre}")
}
