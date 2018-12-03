<html>
<body>
<form>
<table>

<tr>
<td>Suchen<input type='text' name='suchen'></td> 
<td><input type='submit' value='absenden'></td>
</tr>
</table>
</form>

<?php 
require_once 'dblager2.php';
session_start();




if (isset($_GET['suchen'])) {

    dblager2::erstelleVer();
    $ergTab = dblager2::suchen($_GET['suchen']);
//     $_SESSION['suchen']=$ergTab;
    

    if (! isset($_SESSION['array'])) {
        $_SESSION['array'] = $ergTab;
    } else {
        $array = $_SESSION['array'];
        foreach ($ergTab as $zeile) {
            $array[] = $zeile;
        }
        $_SESSION['array'] = $array;
    }

    $myProdukte = $_SESSION['array'];
    echo "<form action = 'einlogen.php'> <table>";
    echo " <tr><td>ID</td><td>Artikelname</td><td>Preis</td><tr>";

    foreach ($myProdukte as $key => $eintrag) {
        echo "
    <tr>
    <td>$eintrag->Aid</td>
    <td>$eintrag->Aname</td>
    <td>$eintrag->Vpreis</td>
    <td><input type='checkbox' name='gewArtikel[]' value=$key><td>
    <td><input type ='number' name='count[]'>
    </tr>";
    }
    echo "<tr>
    <td><input type='submit' value='weiter'></td>
    </tr>
    </table>
    </form>";
}

// $_SESSION['array']=array();

?>

</body>
</html>