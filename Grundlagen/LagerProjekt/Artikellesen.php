<html>
<form action='einlogen.php'>

<table>
<tr><td>ID</td><td>Artikelname</td><td>Preis</td><tr>
<?php

require_once 'dblager2.php';
dblager2::erstelleVer();
$artikelTab=dblager2::artikelLesen();
session_start();
$_SESSION['artikelTab']=$artikelTab;



foreach ($artikelTab as $key=>$artikel) {
    echo"
    <tr>
    <td>$artikel->Aid</td>
    <td>$artikel->Aname</td>
    <td>$artikel->Vpreis</td>
    <td><input type='checkbox' name='gewArtikel[]' value=$key><td>
    </tr>";
    
}

//     <td><input type='number' name='count[]'> <td>



?>
<tr><td><input type ='submit' value='Absenden'></td></tr>
</table>
</form>
</html>