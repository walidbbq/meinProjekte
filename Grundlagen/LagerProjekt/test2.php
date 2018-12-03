</html>
<?php
require_once 'dblager2.php';
require_once 'artikel.php';
require_once 'best_artk.php';
require_once 'bestellungen.php';
require_once 'kunden.php';
require_once 'adresse.php';

session_start();
$myArtikel=array();


if (isset($_GET['gewArtikel'])) {
    foreach ($_GET['gewArtikel'] as $id) {
        $produkt = $_SESSION['artikelTab'][$id];
        $myArtikel[]=$produkt;
//                     echo $produkt->Aname;
    }
    $_SESSION['myArtikel']=$myArtikel;

}

echo "myArtikel aus get<br>";
foreach ($myArtikel as $artikel) {
    echo $artikel->Aname."<br>";
}
echo "<br>myArtikel aus get<br>";


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
    print_r($a);
    
    
    $k->adresse=$a;
    $k->kvorname=$_GET['vorname'];
    $k->kname=$_GET['nachname'];
    $k->email=$_GET['email'];
    print_r($k);
    
    $b->kunde=$k;
    
    
  
    
    $ar= $myArtikel;
    $ba->bestellung=$b;
    $ba->artikel=$ar;
    
    print_r($ba->artikel);
    
    dblager2::erstelleVer();
    dblager2::bestArtkEintrag($ba);
    
    
       
}
// print_r($ba);



?>
<form>
<table>
<tr><td>Vorname</td><td><input type='text' name='vorname'></td></tr>
<tr><td>Nachname</td><td><input type='text' name='nachname'></td></tr>
<tr><td>Email</td><td><input type='text' name='email'></td></tr>
<tr><td>Strasse</td><td><input type='text' name='strasse'></td></tr>
<tr><td>Hausnr.</td><td><input type='text' name='hausnr'></td></tr>
<tr><td>Postleitzahl</td><td><input type='text' name='plz'></td></tr>
<tr><td>Wohnort</td><td><input type='text' name='wohnort'></td></tr>
<tr><td><input type='submit'></td></tr>
</table>
</form>

</body>
</html>