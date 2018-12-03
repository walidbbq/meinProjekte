<?php
// require('person.php');
require_once('daten.php');


class Suchfunktion {
    
    
    public static function durchsuche_telefonliste
    ($telefonliste, $vorname, $nachname) {

   
        
        for($i=0; $i<sizeof($telefonliste);$i++){
            
        if  ( ($telefonliste[$i]->getVorname() == $vorname) AND
              ($telefonliste[$i]->getNachname()==$nachname) )

                return $telefonliste[$i]->getTelefonnummer();

         
                
        }
        return -1;
    }
    
}


?>