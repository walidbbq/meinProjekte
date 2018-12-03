
<html>

<hl>Ihre Bestellung:</hl>




</table>
<?php
require_once 'dbwork.php';
require_once 'produkt.php';
require_once 'bestellung.php';
// require_once 'eingabe_daten.php';
session_start();
$bestellung=$_SESSION['bestellung'];
$produkt=$_SESSION['ausp'];


echo "<form>";






    echo "
             <table><tr><td>Produkt</td><td>&nbsp&nbsp&nbsp&nbsp $produkt->produktname</td></tr>" . 
             "<tr><td>Beschreibung</td><td>&nbsp&nbsp&nbsp&nbsp $produkt->beschreibung</td></tr>" . 
             "<tr><td>Preis</td><td>&nbsp&nbsp&nbsp&nbsp $produkt->preis</td></tr>" .
             "<tr><td>Name</td><td>&nbsp&nbsp&nbsp&nbsp $bestellung->VornameKunde"."$bestellung->NachnameKunde</td></tr>".
             "<tr><td>Whonort</td><td>&nbsp&nbsp&nbsp&nbsp $bestellung->strasse.$bestellung->hausnr.$bestellung->plz.$bestellung->wohnort</td></tr>".
             
             " </table><br/>";


// foreach ($bestellung as $eintrag) {
//     echo "
//            <tr><td>Name<
// }



echo "<h>Möchten Sie die Bestellung abschicken?</h>
<table>
<tr><td>Abschicken</td><td><input type='radio' name='waehlen' value=1></td> </tr> 
<tr><td>Abbrechen</td><td><input type='radio' name='waehlen' value=2></td> </tr> 
<tr><td><input type='submit' value='Senden'></tr>
</table>";
 

if (isset($_GET['waehlen'])){
    if ($_GET['waehlen']==1) {
     Dbwork::erstelleVerbindugn();
     Dbwork::eintragBestellung($bestellung);
    echo "Herzlichen Dank für Ihre Bestellung!";
    }
    else 
        echo "Der Bestellvorgang wurde abgebrochen!";
        
    

}

?>

</form>
</html>