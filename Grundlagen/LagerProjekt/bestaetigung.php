<html>
<form action="">
<h>Ihre Bestellung</h>
<table>
<?php
require_once 'dblager2.php';
require_once 'artikel.php';
require_once 'best_artk.php';
require_once 'bestellungen.php';
require_once 'kunden.php';
require_once 'adresse.php';

session_start();
if (isset($_GET['vorname'])) {
    $myArtikel=$_SESSION['myArtikel'];
    
    $ba=new bestArtk();
    $b=new bestellung();
    $k=new kunden();
    $a=new adresse();
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
    
    echo "<tr><td>$k->kvorname</td> <td>$k->kname</td></tr>
          <tr><td>".$k->adresse->str."</td><td>".$k->adresse->hausnr."</td></tr>
          <tr><td>".$k->adresse->ort."</td><td>".$k->adresse->plz."</td></tr>
<br>
<br>
<br>
";
    
    foreach ($ba->artikel as $auswahl){
        echo" <tr><td>$auswahl->Aname</td><td>$auswahl->Vpreis</td></tr>";
    }

    
//     print_r($ba->artikel);
    
//     dblager2::erstelleVer();
//     dblager2::bestArtkEintrag($ba);
    
}
?>
</form>
</table>
</html>
