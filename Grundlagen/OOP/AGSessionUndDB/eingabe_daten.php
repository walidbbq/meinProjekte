<html>
<form>
<table>
<tr>
<td>Vorname</td><td><input type='text' name=vorname></tr>
<tr>
<tr>
<td>Nachname</td><td><input type='text' name=nachname></tr>
<tr>
<tr>
<td>Strasse</td><td><input type='text' name=strasse></tr>
<tr>
<tr>
<td>Hausnr</td><td><input type='text' name=hausnr></tr>
<tr>
<tr>
<td>Postleizahl</td><td><input type='text' name=plz></tr>
<tr>
<tr>
<td>Wohnort</td><td><input type='text' name=wohnort></tr>
<tr>

</table>

<input type='submit' value=weiter>
<?php
require_once 'dbwork.php';
require_once 'bestellung.php';
require_once 'produkt.php';
// require_once 'eingabe_daten.php';

session_start();


$ausgabe=$_SESSION['ausp'];

    
    



//     $pid=$ausgabe[0];
//     $produktname=$ausgabe[1];
//     $beschreibung=$ausgabe[2];
//     $preis=$ausgabe[3];


// $p=new produkt($pid, $produktname, $beschreibung, $preis);
// print_r($p);



// if (isset($_SESSION['ausp']))
// print_r ($ausgabe);


// foreach ($ausgabe as $eintrag)
//     echo $eintrag;
    

if (isset($_GET['vorname'])){
$vor=$_GET['vorname'];
$nach=$_GET['nachname'];
$str=$_GET['strasse'];
$hnr=$_GET['hausnr'];
$plz=$_GET['plz'];
$wohnort=$_GET['wohnort'];


Dbwork::erstelleVerbindugn();
$b=new bestellung($vor, $nach, $str, $hnr, $plz, $wohnort,$ausgabe);
// Dbwork::eintragBestellung($b);
// echo $ausgabe->pid;$
print_r($b);
$_SESSION['bestellung']=$b;
}
?>
</form>
</html>