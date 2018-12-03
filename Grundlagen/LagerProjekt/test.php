</html>
<?php
require_once 'dblager.php';
require_once 'artikel.php';
require_once 'best_artk.php';
require_once 'bestellungen.php';
require_once 'kunden.php';
require_once 'adresse.php';

session_start();

if (isset($_GET['gewArtikel'])) {
$artikelTab=$_SESSION['artikelTab'];
$gewArtikel=$_GET['gewArtikel'];
$myArtikel=$artikelTab[$gewArtikel];
$_SESSION['myArtikel']=$myArtikel;
}

if (isset($_GET['vorname'])) {
    $myArtikel=$_SESSION['myArtikel'];
    $aid=$myArtikel->Aid;
    $aname=$myArtikel->Aname;
    $lpreis=$myArtikel->Lpreis;
    $vpreis=$myArtikel->Vpreis;
    $lid=$myArtikel->Lid;
    $kaid=$myArtikel->Kaid;
    $laid=$myArtikel->Laid;
    
    $ar= new artikel($aid, $aname, $lpreis, $vpreis, $lid, $kaid, $laid);
    
    print_r($ar);
    $ba=new bestArtk();
    $ar= $myArtikel;
//     $ba->artikel=$ar;
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
//     $k->adresse=$a->adid;
    print_r($k);
    
    $b->kunde=$k;
//     $b->kunde=$k->kid;
    
    $ba->bestellung=$b;
    $ba->artikel=$ar;
    
    print_r($ba);
    
    
    dblager::erstelleVer();
    dblager::bestArtkEintrag($ba);
}



?>
<form>
<table>
<tr><td>Vorname</td><td><input type='text' name='vorname'></td></tr>
<tr><td>Nachname</td><td><input type='text' name='nachname'></td></tr>
<tr><td>Strasse</td><td><input type='text' name='strasse'></td></tr>
<tr><td>Hausnr.</td><td><input type='text' name='hausnr'></td></tr>
<tr><td>Postleitzahl</td><td><input type='text' name='plz'></td></tr>
<tr><td>Wohnort</td><td><input type='text' name='wohnort'></td></tr>
<tr><td><input type='submit'></td></tr>
</table>
</form>

</body>
</html>