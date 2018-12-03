<html>
<form>
<?php
require_once 'dbwork.php';
require_once 'produkt.php';

Dbwork::erstelleVerbindugn();
$produkte=Dbwork::leseProdukte();

//  echo "<form>";
 
 
 
 echo "<table><tr><td>Name</td><td>Beschreibung</td><td>Preis Auswahl</td></tr></table>";


    foreach($produkte as $key=>$zeille) {
        echo "
             <table><tr><td>$zeille->produktname</td>" . "<td> $zeille->beschreibung</td>" . "<td> $zeille->preis</td>" . 
             "<td><input type='radio' name='produkt' value=$key></td> </tr> </table><br/>";
            }
            
            
          
            
        

if (isset($_GET['produkt'])){
    
    $ausgabe=$_GET['produkt'];
    echo $ausgabe;
    
    $myProdukt=new produkt($produkte[$ausgabe]->pid,$produkte[$ausgabe]->produktname,$produkte[$ausgabe]->beschreibung,$produkte[$ausgabe]->preis);
    print_r ($myProdukt);
    

    
//     echo $produkte[$ausgabe]->produktname ." / ". $produkte[$ausgabe]->beschreibung." / ". $produkte[$ausgabe]->preis ;
    session_start();
    
    $_SESSION['ausp']=$myProdukt;
    

// session_cache_expire();    
        
    
     
}

echo "<input type='submit' value='Absenden'>";





// echo "</form>";


// <a href=eingabe_daten.php></a>

?>
</form>
</html>
