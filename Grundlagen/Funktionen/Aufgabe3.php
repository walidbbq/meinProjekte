<html>
<form method="POST" action="Aufgabe3.php">
<table>
<tr>
<td>Buchtitel</td> <td><input type="text" name="BT"><br></td>
</tr>

<tr>
<td><input type="submit" name="SS" value="Suchen Starten"></td>
</tr>
</table>

</form>

<?php


// echo "===B===";

function durchsuche_buecherliste($array,$titel){
    
    
$erg=false;

for ($i=0; $i<sizeof($array);$i++){
    
        for($j=0; $j<sizeof($array[$i]);$j++) {
 
            if ( $titel==$array[$i][2] ) {
                
                echo "Autor: ";
                print_r($array[$i][0]);
                echo " , ";
                print_r($array[$i][1]);
                
                echo "<br>";
                echo"Titel: ";
                print_r($array[$i][2])."<br>";
                
                echo "<br>";
                echo"Jahr: ";
                print_r($array[$i][3])."<br>";
                
              
            $erg=true;
            break;
            }
            
        
        }
    
            echo "</td>";
    
            
    }
                if ($erg==false)
                    echo "Titel wurde nicht gefunden“";
  
        echo "</tr>";
        echo "<br>";
        
}
        
  


// echo "==A===";

$buecherliste=array( array("Dostojewski","Fjodor Michailowitsch","Weiße Nächte",1848),
                     array("Dostojewski","Fjodor Michailowitsch","Schuld und Sühne",1866),
                     array("Proust","Marcel","Auf der Suche nach der verlorenen Zeit 2",1918),
                     array("Proust","Marcel","Auf der Suche nach der verlorenen Zeit 1",1913),
                     array("Proust","Marcel","Auf der Suche nach der verlorenen Zeit 3",1921),
                     array("Bernhard","Thomas","Holzfällen",1984),
                     array("Bernhard","Thomas","Das Kalkwerk",1970)
    );

// echo"<table>";
// for ($i=0; $i<sizeof($buecherliste);$i++){
//     echo "<tr>";
//     for($j=0; $j<sizeof($buecherliste[$i]);$j++) {
//         echo "<td>";
//         echo $buecherliste[$i][$j]  ;
//         echo " &nbsp &nbsp &nbsp </td>";
        
//         }
//     echo "</tr>";
//     echo "<br>";
// }
// echo"</table>";
if (isset ($_POST["BT"]) ) {
    
durchsuche_buecherliste($buecherliste,(string)$_POST["BT"]);
}
?>
</html>