//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate
fun main() {
//    Module 1 – Introduction à Kotlin et à la programmation
//    Exercice 1-calcul de moyenne
    /*println("entrer 03 notes decimalle:")
    val nbre1= readlnOrNull()?.toDoubleOrNull()
    if (nbre1==null || nbre1<0) {
        nbre1 == 0.0
        println("le nombre saisir n'est pas correct")
    }
    val nbre2 = readlnOrNull()?.toDoubleOrNull()
    if (nbre2==null || nbre2<=0) {
        nbre2 == 0.0
        println("le nombre saisir n'est pas correct")
    }
    val nbre3= readlnOrNull()?.toDoubleOrNull()
    if (nbre3==null || nbre3<=0) {
        nbre3 == 0.0
        println("le nombre saisir n'est pas correct")
    }
    val moy = (nbre1 + nbre2 + nbre3)/3.0
    println("la moyenne est : M = ${moy}")

     */
//    exercice 2-Message personnalisé
    /*print("entrer votre Prenom: ")
    var prenom: String= readlnOrNull()?.trim()?: "Mr/Mme"
    if (prenom.isEmpty())
        prenom= "Mr/Mme"
    print("entrer votre age: ")
    val age= readlnOrNull()?.toIntOrNull()
    if (age==null || age==0)
        println("votre age est incorrect")
    print("entrer votre ville: ")
    val ville: String=readln()
    println("Bonjour ${prenom}, tu as ${age} ans et tu habites a ${ville} ")

     */

//exercice 3-L’année de vos 100 ans
    /*var annee= LocalDate.now().year
    val cent=100
    print("entrer votre age actuel:")
    var age =readlnOrNull()?.toIntOrNull()
    if (age==null) {
        println("entrer un age correct")
        age==0
    }

    if (age != null) {
        when{
            age>= 100 ->println("vous avez 100 ans en ${annee}")
            age<=0 -> println("votre age est incorrect")
            else -> {
                annee = (cent - age) + annee

                println("vous auriez 100 ans en ${annee}")
            }
        }
    }

     */
//    Exercice 4 – Compteur de mots
   /* println("entrer une phrase ")
    val phrase=readln().trim()
    if (phrase.isEmpty()) {
        println("le nombre de mot que contient votre Phrase est 0")
    }else{
        var tab=phrase.split(" ", "\t").filter { !it.isBlank() }
        println("le nombre de mot que contient votre Phrase est ${tab.size}")
        }
    */
//Exercice 5 – Carte d’identité virtuelle
    print("Nom:  ")
    val nom=readlnOrNull()?.trim()?:"N/A"
    print("Prenom: ")
    val prenom=readlnOrNull()?.trim()?:"N/A"
    print("age: ")
    val age=readlnOrNull()?.toIntOrNull()?:0
    print("ville: ")
    val ville=readlnOrNull()?.trim()?:"N/A"
    print("Profession: ")
    val profession=readlnOrNull()?.trim()?:"N/A"
    println("\n\n")
    println("*******************CNI **********************")
    println("Nom       : ${nom}\nPrenom    : ${prenom}\nAge       : ${age} ans\nVille     : ${ville}\nProfession: ${profession}")
    println("*********************************************")

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
    /*println("combien de nombre voulez vous entrez:")
    var nbre=readln().toInt()
    var somme=0.0
    for (i in 1 .. nbre){
        println("entrer le nombre ${i}")
       var nb= readln().toFloat()
        somme=(somme+nb)
    }
    println("la moyenne des ${nbre} nombres est : \n Moy= ${somme/nbre}")
    */
}
