

<html>

<!-- <titel>Suchen</titel> -->
<body>
<form action="" method="post">
<table>
<tr> 
<td>Bitte Vornamen eingeben</td> <td><input type="text" name="Vname">
</td>
</tr>

<tr>
<td>Bitte Nachnamen eingeben</td> <td><input type="text" name= "Nname">
</td>
</tr>


<tr>
<td><input type="submit" value="Abschicken"></td>
</tr>
</table>
<?php
require_once 'person.php';
require_once 'daten.php';
require_once 'hilffunktionen.php';
if (isset($_POST["Vname"]) )
{
    
    $vorname = $_POST["Vname"];
    $nachname = $_POST["Nname"];
    
    $telefonliste= daten::get_telefonliste();
    
    $telefonnummer = Suchfunktion::durchsuche_telefonliste(
        $telefonliste,
        $vorname,
        $nachname);
    
    if ($telefonnummer==-1){
        echo "Nummer nicht gefunden";
    } else {
        echo "Telefonnummer von $vorname $nachname: $telefonnummer";
    }
    
    
}
    


?>
</form>
</body>
</html>