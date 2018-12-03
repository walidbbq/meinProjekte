<html>

<form action=''>

<?php
require_once 'dblager2.php';
require_once 'artikel.php';
require_once 'best_artk.php';
require_once 'bestellungen.php';
require_once 'kunden.php';
require_once 'adresse.php';

session_start();

// $myArtikel=$_SESSION['myArtikel'];

$ba=new bestArtk();
$b=new bestellung();
$k=new kunden();
$a=new adresse();

$myArtikel=array();




// if (isset($_GET['count'])) {

//     for ($i=0; $i<sizeof($_GET['count']);$i++) {
//         for ($j=0;$j<sizeof($_GET['count'][$i]);$j++){
//             echo $_GET['count'][$i][$j]."<br>";
//         }
//     }
// }


// if (isset($_GET['gewArtikel'])) {
    
//     for ($i=0; $i<sizeof($_GET['gewArtikel']);$i++) {
//         for ($j=0;$j<sizeof($_GET['gewArtikel'][$i]);$j++){
//             echo $_GET['gewArtikel'][$i]."<br>";
//         }
//     }
// }


if (isset($_GET['gewArtikel'])) {
    foreach ($_GET['gewArtikel'] as $id) {
        $produkt = $_SESSION['array'][$id];
        $produkt->menge=$_GET['count'][$id];
        print_r($produkt);
        $myArtikel[]=$produkt;
    }
    $_SESSION['myArtikel']=$myArtikel; 
//     echo "aus if gewArtikel <br>";
//     echo "aus if gewArtikel <br>";
    
}



// if (isset ($_GET['count'])) {
//     $myArtikel=$_SESSION['myArtikel'];
    
    
    




?>

<h>Registrierte kunde</h>
<table>


<tr><td>Geben Sie dein Email ein:</td></tr>
<tr><td><input type='text' name='regKunde'></td></tr>
<tr><td><input type='submit'></td></tr>
<tr><td> <?php 

if (isset($_GET['regKunde'])){
    $kunde = dblager2::emailUebepruefen($_GET['regKunde']);
    if($kunde->kid == -1)
    {
        echo 'Diese E-Mail-Adresse ist nicht vorhanden!<br>';
    }
    
    else if (empty($_GET['regKunde'])) {
        echo 'Geben Sie Ihre Email Adresse ein !<br>';
    }
    else {
        $myArtikel=$_SESSION['myArtikel'];
        print_r($myArtikel);
//         $k->adresse=$a;
//         $b->kunde=$k;
        $ar=$myArtikel;
        $ba->bestellung=$b;
        $ba->artikel=$ar;
        $ba->bestellung->kunde = $kunde;
        print_r($ba);
        
        dblager2::erstelleVer();
        dblager2::bestArtkEintrag($ba);
        
    }
}

?></td></tr>


</table>
</form>

<br>
<br>
<br>
<br>


<form>
<h>Neue Kunde</h>
<table>
<tr><td>Vorname</td><td><input type='text' name='vorname'></td></tr>
<tr><td>Nachname</td><td><input type='text' name='nachname'></td></tr>
<tr><td>Email</td><td><input type='text' name='email'></td></tr>
<tr><td>Strasse</td><td><input type='text' name='strasse'></td></tr>
<tr><td>Hausnr.</td><td><input type='text' name='hausnr'></td></tr>
<tr><td>Postleitzahl</td><td><input type='text' name='plz'></td></tr>
<tr><td>Wohnort</td><td><input type='text' name='wohnort'></td></tr>
<tr><td><input type='submit'></td></tr>
<tr><td> <?php 

if (isset($_GET['vorname'])){
    
    if ($_GET['vorname']!=="") {
        
    
    $myArtikel=$_SESSION['myArtikel'];
    print_r($myArtikel);
    
    
 
    $a->ort=$_GET['wohnort'];
    $a->str=$_GET['strasse'];
    $a->hausnr=$_GET['hausnr'];
    $a->plz=$_GET['plz'];
    //     print_r($a);
    
    
    $k->adresse=$a;
    $k->kvorname=$_GET['vorname'];
    $k->kname=$_GET['nachname'];
    $k->email=$_GET['email'];
    //     print_r($k);
    // echo $k->adresse->plz;
    
    $b->kunde=$k;
    
    
    
    
    $ar= $myArtikel;
    $ba->bestellung=$b;
    $ba->artikel=$ar;
    
    print_r($ba);
    
    dblager2::erstelleVer();
    dblager2::bestArtkEintrag($ba);
    }

    
    else if (empty($_GET['vorname'])) {
        
        echo 'Füllen Sie bitte den Formular aus!<br>';
    }
    

}

?></td></tr>
</table>
</form>
</html>

